package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import model.AlunoGraduacao;

import javax.swing.*;



public class VisualizarAlunos extends JFrame {

	private JPanel contentPane;
	private JTable tabelaAlunos;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabelaAlunos = new JTable();
		tabelaAlunos.setBounds(10, 115, 667, 334);
		contentPane.add(tabelaAlunos);
		mostrarDadosTabela(tabelaAlunos);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome"};  //,"Endereco","CPF","Sexo","Casado"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        for (AlunoGraduacao p : DadosAlunoGraduacao.retorno()){            
            //String sexo;
            //if (p.getSexo() == 'M') sexo = "Masculino";
            //else sexo = "Feminino";
            
            modelo.addRow(new String [] {p.getNomePessoa()}); //, (), p.getCPF(), sexo, "Casado" } );
            
        }
    }
    
}
	

