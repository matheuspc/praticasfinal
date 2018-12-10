package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosAlunoPosGraduacao;
import model.AlunoGraduacao;
import model.AlunoPosGraduacao;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VisualizarAlunosPos extends JFrame {

	private JPanel contentPane;
	private JTable tabelaAlunosPos;
	private JButton btnEditarAlunoPos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarAlunosPos frame = new VisualizarAlunosPos();
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
	public VisualizarAlunosPos() {
		setTitle("GSchool v1.0 - Consulta Alunos P\u00F3s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 703, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 667, 254);
		contentPane.add(scrollPane);
		
		tabelaAlunosPos = new JTable();
		scrollPane.setViewportView(tabelaAlunosPos);
		mostrarDadosTabela(tabelaAlunosPos);
		
		JButton btnExcluirAluno = new JButton("Excluir");
		btnExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaAlunosPos.getSelectedRow() > -1) {
					DadosAlunoPosGraduacao.deletar(tabelaAlunosPos.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Exclu�do com sucesso!");
					mostrarDadosTabela(tabelaAlunosPos);
				}
				
			}
		});
		btnExcluirAluno.setBounds(229, 276, 89, 23);
		contentPane.add(btnExcluirAluno);
		
		btnEditarAlunoPos = new JButton("Editar");
		btnEditarAlunoPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AlunoPosGraduacao ap = new AlunoPosGraduacao();
				
				String nome = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 0);
				ap.setNomePessoa(nome);
				
				String cpf = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 1);
				ap.setCpf(cpf);
				
				String matricula = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 2);
				ap.setMatriculaAluno(matricula);
				
				String graduacao = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 3);
				ap.setGraduacao(graduacao);
				
				String dtinicio = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 4);
				ap.setAnoInicio(dtinicio);
				
				String dtconclusao = (String)tabelaAlunosPos.getValueAt(tabelaAlunosPos.getSelectedRow(), 5);
				ap.setAnoInicio(dtconclusao);
				
				
				//String curso = (String)tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 4);
				//ag.
				
				DadosAlunoPosGraduacao.alterar(tabelaAlunosPos.getSelectedRow(), ap);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaAlunosPos);
				
			}
		});
		btnEditarAlunoPos.setBounds(350, 276, 89, 23);
		contentPane.add(btnEditarAlunoPos);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "CPF", "Matr�cula", "Curso", "Cod Curso", "Dura��o", "Gradua��o", "Data de In�cio", "Data de Conclus�o"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<AlunoPosGraduacao> lista = DadosAlunoPosGraduacao.retornaLista();
        for (AlunoPosGraduacao a : DadosAlunoPosGraduacao.retornaLista()){
            modelo.addRow(new String [] {a.getNomePessoa(), a.getCpfPessoa(), a.getMatriculaAluno(), a.getCursoPos().getNomeCurso(), a.getCursoPos().getCodigoCurso(), a.getCursoPos().getDuracaoCurso(), a.getGraduacao(), a.getAnoInicio(), a.getAnoConclusao()});

        }
    }
}