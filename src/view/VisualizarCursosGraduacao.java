package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosCursoGraduacao;
import model.AlunoGraduacao;
import model.CursoGraduacao;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisualizarCursosGraduacao extends JFrame {

	private JPanel contentPane;
	private JTable tabelaCursosGraduacao;
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
	public VisualizarCursosGraduacao() {
		setTitle("GSchool v1.0 - Consulta Cursos Gradua\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 703, 356);
		contentPane = new JPanel();  
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 667, 254);
		contentPane.add(scrollPane);
		
		tabelaCursosGraduacao = new JTable();
		scrollPane.setViewportView(tabelaCursosGraduacao);
		mostrarDadosTabela(tabelaCursosGraduacao);
		
		JButton btnExcluirAluno = new JButton("Excluir");
		btnExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaCursosGraduacao.getSelectedRow() > -1) {
					DadosAlunoGraduacao.deletar(tabelaCursosGraduacao.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaCursosGraduacao);
				}
				
			}
		});
		btnExcluirAluno.setBounds(229, 276, 89, 23);
		contentPane.add(btnExcluirAluno);
		
		btnEditarAluno = new JButton("Editar");
		btnEditarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CursoGraduacao cg = new CursoGraduacao();
				
				String nome = (String)tabelaCursosGraduacao.getValueAt(tabelaCursosGraduacao.getSelectedRow(), 0);
				cg.setNomeCurso(nome);
				
				String codigo = (String)tabelaCursosGraduacao.getValueAt(tabelaCursosGraduacao.getSelectedRow(), 1);
				cg.setCodigoCurso(codigo);
				
				String duracao = (String)tabelaCursosGraduacao.getValueAt(tabelaCursosGraduacao.getSelectedRow(), 2);
				cg.setDuracaoCurso(duracao);	

				DadosCursoGraduacao.alterar(tabelaCursosGraduacao.getSelectedRow(), cg);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaCursosGraduacao);
				
			}
		});
		btnEditarAluno.setBounds(350, 276, 89, 23);
		contentPane.add(btnEditarAluno);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Código Curso", "Duração", "Disciplinas"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<CursoGraduacao> lista = DadosCursoGraduacao.retornaLista();
        for (CursoGraduacao cg : DadosCursoGraduacao.retornaLista()){
            modelo.addRow(new String [] {cg.getNomeCurso(), cg.getCodigoCurso(), cg.getDuracaoCurso(), "POO1"});

        }
    }
}