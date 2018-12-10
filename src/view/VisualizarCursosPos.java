package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosCursoGraduacao;
import DAO.DadosCursoPosGraduacao;
import model.AlunoGraduacao;
import model.CursoGraduacao;
import model.CursoPosGraduacao;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisualizarCursosPos extends JFrame {

	private JPanel contentPane;
	private JTable tabelaCursosPos;
	private JButton btnEditarAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarCursosGraduacao frame = new VisualizarCursosGraduacao();
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
	public VisualizarCursosPos() {
		setTitle("GSchool v1.0 - Consulta Cursos P\u00F3s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 703, 356);
		contentPane = new JPanel();  
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 667, 254);
		contentPane.add(scrollPane);
		
		tabelaCursosPos = new JTable();
		scrollPane.setViewportView(tabelaCursosPos);
		mostrarDadosTabela(tabelaCursosPos);
		
		JButton btnExcluirAluno = new JButton("Excluir");
		btnExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaCursosPos.getSelectedRow() > -1) {
					DadosCursoPosGraduacao.deletar(tabelaCursosPos.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaCursosPos);
				}
				
			}
		});
		btnExcluirAluno.setBounds(229, 276, 89, 23);
		contentPane.add(btnExcluirAluno);
		
		btnEditarAluno = new JButton("Editar");
		btnEditarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CursoPosGraduacao cpg = new CursoPosGraduacao();
				
				String nome = (String)tabelaCursosPos.getValueAt(tabelaCursosPos.getSelectedRow(), 0);
				cpg.setNomeCurso(nome);
				
				String codigo = (String)tabelaCursosPos.getValueAt(tabelaCursosPos.getSelectedRow(), 1);
				cpg.setCodigoCurso(codigo);
				
				String duracao = (String)tabelaCursosPos.getValueAt(tabelaCursosPos.getSelectedRow(), 2);
				cpg.setDuracaoCurso(duracao);	
				
				DadosCursoPosGraduacao.alterar(tabelaCursosPos.getSelectedRow(), cpg);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaCursosPos);
				
			}
		});
		btnEditarAluno.setBounds(350, 276, 89, 23);
		contentPane.add(btnEditarAluno);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Código Curso", "Duração"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<CursoPosGraduacao> lista = DadosCursoPosGraduacao.retornaLista();
        for (CursoPosGraduacao cpg : DadosCursoPosGraduacao.retornaLista()){
            modelo.addRow(new String [] {cpg.getNomeCurso(), cpg.getCodigoCurso(), cpg.getDuracaoCurso()});

        }
    }
}