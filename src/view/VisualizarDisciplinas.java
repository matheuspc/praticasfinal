package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosDisciplina;
import DAO.DadosProfessores;
import model.AlunoGraduacao;
import model.Disciplina;
import model.Professor;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VisualizarDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTable tabelaDisciplinas;
	private JButton btnEditarDisciplina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarDisciplinas frame = new VisualizarDisciplinas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VisualizarDisciplinas() {
		setResizable(false);
		setTitle("GSchool v1.0 - Consulta Disciplinas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 811, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 785, 378);
		contentPane.add(scrollPane);
		
		tabelaDisciplinas = new JTable();
		scrollPane.setViewportView(tabelaDisciplinas);
		mostrarDadosTabela(tabelaDisciplinas);
		
		JButton btnExcluirDisciplina = new JButton("Excluir");
		btnExcluirDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaDisciplinas.getSelectedRow() > -1) {
					DadosDisciplina.deletar(tabelaDisciplinas.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaDisciplinas);
				}
				
			}
		});
		btnExcluirDisciplina.setBounds(301, 400, 89, 23);
		contentPane.add(btnExcluirDisciplina);
		
		btnEditarDisciplina = new JButton("Editar");
		btnEditarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Disciplina t = new Disciplina();
				
				String nome = (String)tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0);
				t.setNomeDisciplina(nome);
				
				String codigo = (String)tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 1);
				t.setCodigoDisciplina(codigo);
				
				String carga = (String)tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 2);
				int cargaDisciplina = Integer.parseInt(carga);
				t.setCargaHoraria(cargaDisciplina);
				
				DadosDisciplina.alterar(tabelaDisciplinas.getSelectedRow(), t);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaDisciplinas);
				
			}
		});
		btnEditarDisciplina.setBounds(416, 400, 89, 23);
		contentPane.add(btnEditarDisciplina);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Código", "Carga Horária", "Professor", "Curso"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<Disciplina> lista = DadosDisciplina.retornaLista();
        for (Disciplina d : DadosDisciplina.retornaLista()){
        	String duracao = String.valueOf(d.getCargaHoraria());
            modelo.addRow(new String [] {d.getNomeDisciplina(), d.getCodigoDisciplina(), duracao, d.getProfessor().getNomePessoa(), d.getCg().getNomeCurso()});

        }
    }
}