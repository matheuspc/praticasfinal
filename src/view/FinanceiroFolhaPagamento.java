package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosAlunoPosGraduacao;
import DAO.DadosFuncionario;
import DAO.DadosTecnicos;
import model.AlunoGraduacao;
import model.AlunoPosGraduacao;
import model.FolhaPagamento;
import model.Funcionario;
import model.Tecnicos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;



public class FinanceiroFolhaPagamento extends JFrame {

	private JPanel contentPane;
	private JTable tabelaFinanceiro;
	private JButton btnEditarAlunoPos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceiroFolhaPagamento frame = new FinanceiroFolhaPagamento();
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
	public FinanceiroFolhaPagamento() {
		setTitle("GSchool v1.0 - Folha de Pagamento");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 703, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 667, 260);
		contentPane.add(scrollPane);
		
		tabelaFinanceiro = new JTable();
		scrollPane.setViewportView(tabelaFinanceiro);
		mostrarDadosTabela(tabelaFinanceiro);
		
		JLabel lblNewLabel = new JLabel("Total da Folha:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 21, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$ ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(106, 21, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel totalFolha = new JLabel("12.000,52");
		totalFolha.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalFolha.setBounds(132, 21, 151, 14);
		contentPane.add(totalFolha);
		FolhaPagamento folha = new FolhaPagamento();
		folha.somaFolha(DadosFuncionario.retornaLista());
		String totalDaFolha = String.valueOf(folha.getTotalFolha());
		totalFolha.setText(totalDaFolha);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Categoria", "Sal�rio Bruto", "IRRF", "INSS", "Salario L�quido"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        FolhaPagamento fp = new FolhaPagamento();
        
//        fp.somaFolha(DadosFuncionario.retornaLista());
        
        //3a. parte - adicionar linhas na tabela
        ArrayList<Funcionario> lista = DadosFuncionario.retornaLista();
        for (Funcionario f : DadosFuncionario.retornaLista()){
        	String salario = String.valueOf(f.getSalarioFunc());
        	String irrf = String.valueOf(f.getSalarioFunc() * 0.3378);
        	String inss = String.valueOf(f.getSalarioFunc() * 0.11);
        	String salarioLiquido = String.valueOf(f.getSalarioFunc() - (f.getSalarioFunc() * 0.3378) - (f.getSalarioFunc() * 0.11));
            modelo.addRow(new String [] {f.getNomePessoa(), f.getClass().getName(), salario, irrf, inss, salarioLiquido});

        }
    }
}