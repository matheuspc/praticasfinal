package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import model.AlunoGraduacao;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VisualizarAlunos extends JFrame {

	private JPanel contentPane;
	private JTable tabelaAlunos;
	private JButton btnEditarAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarAlunos frame = new VisualizarAlunos();
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
	public VisualizarAlunos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 703, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 667, 254);
		contentPane.add(scrollPane);
		
		tabelaAlunos = new JTable();
		scrollPane.setViewportView(tabelaAlunos);
		mostrarDadosTabela(tabelaAlunos);
		
		JButton btnExcluirAluno = new JButton("Excluir");
		btnExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaAlunos.getSelectedRow() > -1) {
					DadosAlunoGraduacao.deletar(tabelaAlunos.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaAlunos);
				}
				
			}
		});
		btnExcluirAluno.setBounds(229, 276, 89, 23);
		contentPane.add(btnExcluirAluno);
		
		btnEditarAluno = new JButton("Editar");
		btnEditarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AlunoGraduacao ag = new AlunoGraduacao();
				
				String nome = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 0);
				ag.setNomePessoa(nome);
				
				String cpf = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 1);
				ag.setCpf(cpf);
				
				String matricula = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 2);
				ag.setMatriculaAluno(matricula);
				
				String situacao = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 3);
				ag.setSituacao(situacao);
				
				//String curso = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 4);
				//ag.
				
				DadosAlunoGraduacao.alterar(tabelaAlunos.getSelectedRow(), ag);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaAlunos);
				
			}
		});
		btnEditarAluno.setBounds(350, 276, 89, 23);
		contentPane.add(btnEditarAluno);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "CPF", "Matrícula", "Situação", "Curso"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<AlunoGraduacao> lista = DadosAlunoGraduacao.retornaLista();
        for (AlunoGraduacao a : DadosAlunoGraduacao.retornaLista()){
            modelo.addRow(new String [] {a.getNomePessoa(), a.getCpfPessoa(), a.getMatriculaAluno(), a.getSituacao(), "Sistemas"});

        }
    }
}