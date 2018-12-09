package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosProfessores;
import model.AlunoGraduacao;
import model.Professor;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VisualizarProfessores extends JFrame {

	private JPanel contentPane;
	private JTable tabelaProfessor;
	private JButton btnEditarProfessor;

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
	public VisualizarProfessores() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 824, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 767, 294);
		contentPane.add(scrollPane);
		
		tabelaProfessor = new JTable();
		scrollPane.setViewportView(tabelaProfessor);
		mostrarDadosTabela(tabelaProfessor);
		
		JButton btnExcluirProfessor = new JButton("Excluir");
		btnExcluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaProfessor.getSelectedRow() > -1) {
					DadosProfessores.deletar(tabelaProfessor.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaProfessor);
				}
				
			}
		});
		btnExcluirProfessor.setBounds(299, 316, 89, 23);
		contentPane.add(btnExcluirProfessor);
		
		btnEditarProfessor = new JButton("Editar");
		btnEditarProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Professor p = new Professor();
				
				String nome = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 0);
				p.setNomePessoa(nome);
				
				String area = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 1);
				p.setAreaPesquisa(area);
				
				String titulacao = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 2);
				p.setTitulacao(titulacao);
				
				String qtdHoras = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 3);
				double quantidade = Double.parseDouble(qtdHoras);
				p.setNumeroHorasAula(quantidade);
				
				String valorHoras = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 4);
				double valor = Double.parseDouble(valorHoras);
				p.setValorHoraAula(valor);
				
				String endereco = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 5);
				p.setEnderecoFunc(endereco);
				
				String telefone = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 6);
				p.setTelefoneFunc(telefone);
				
				String salarioFunc = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 7);
				double salario = Double.parseDouble(salarioFunc);
				p.setSalarioFunc(salario);
				
				String cpf = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 8);
				p.setCpf(cpf);
				
				String ctps = (String)tabelaProfessor.getValueAt(tabelaProfessor.getSelectedRow(), 0);
				p.setCtpsFunc(ctps);
				
				DadosProfessores.alterar(tabelaProfessor.getSelectedRow(), p);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaProfessor);
				
			}
		});
		btnEditarProfessor.setBounds(423, 316, 89, 23);
		contentPane.add(btnEditarProfessor);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Titulação", "Área Pesquisa", "Endereço", "Telefone", "CPF", "CTPS", "Salário", "QTD Extra", "Valor Hora"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<Professor> lista = DadosProfessores.retornaLista();
        for (Professor p : DadosProfessores.retornaLista()){
        	String salarioFuncionario = String.valueOf(p.getSalarioFunc());
        	String numeroHorasFuncionario = String.valueOf(p.getNumeroHorasAula());
        	String valorHorasFuncionario = String.valueOf(p.getValorHoraAula());
            modelo.addRow(new String [] {p.getNomePessoa(), p.getTitulacao(), p.getAreaPesquisa(), p.getEnderecoFunc(), p.getTelefoneFunc(), p.getCpfPessoa(), p.getCtpsFunc(), salarioFuncionario, numeroHorasFuncionario, valorHorasFuncionario});

        }
    }
}