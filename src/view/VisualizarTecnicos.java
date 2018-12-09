package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.DadosAlunoGraduacao;
import DAO.DadosProfessores;
import DAO.DadosTecnicos;
import model.AlunoGraduacao;
import model.Professor;
import model.Tecnicos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class VisualizarTecnicos extends JFrame {

	private JPanel contentPane;
	private JTable tabelaTecnicos;
	private JButton btnEditarTecnico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarTecnicos frame = new VisualizarTecnicos();
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
	public VisualizarTecnicos() {
		setTitle("GSchool v1.0 - Consulta T\u00E9cnicos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 854, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 818, 254);
		contentPane.add(scrollPane);
		
		tabelaTecnicos = new JTable();
		scrollPane.setViewportView(tabelaTecnicos);
		mostrarDadosTabela(tabelaTecnicos);
		
		JButton btnExcluirTecnico = new JButton("Excluir");
		btnExcluirTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tabelaTecnicos.getSelectedRow() > -1) {
					DadosProfessores.deletar(tabelaTecnicos.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					mostrarDadosTabela(tabelaTecnicos);
				}
				
			}
		});
		btnExcluirTecnico.setBounds(328, 276, 89, 23);
		contentPane.add(btnExcluirTecnico);
		
		btnEditarTecnico = new JButton("Editar");
		btnEditarTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tecnicos t = new Tecnicos();
				
				String nome = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 0);
				t.setNomePessoa(nome);
				
				String cargo = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 1);
				t.setCargo(cargo);
				
				String departamento = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 2);
				t.setDepartamento(departamento);
				
				String endereco = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 3);
				t.setEnderecoFunc(endereco);
				
				String telefone = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 4);
				t.setTelefoneFunc(telefone);
				
				String cpf = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 5);
				t.setCpf(cpf);

				String ctps = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 6);
				t.setCtpsFunc(ctps);
				
				String salarioFunc = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 7);
				double salario = Double.parseDouble(salarioFunc);
				t.setSalarioFunc(salario);
				
				String qtdHoras = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 8);
				double quantidade = Double.parseDouble(qtdHoras);
				t.setQtdHoraExtra(quantidade);
				
				String valorHoras = (String)tabelaTecnicos.getValueAt(tabelaTecnicos.getSelectedRow(), 9);
				double valor = Double.parseDouble(valorHoras);
				t.setValorHoraExtra(valor);	
					
				DadosTecnicos.alterar(tabelaTecnicos.getSelectedRow(), t);
				
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				mostrarDadosTabela(tabelaTecnicos);
				
			}
		});
		btnEditarTecnico.setBounds(427, 276, 89, 23);
		contentPane.add(btnEditarTecnico);
	}
	
    public static void mostrarDadosTabela(JTable tabela){
        //1a. parte - definir modelo de dados
        String[] colunas = new String []{"Nome", "Cargo", "Departamento", "Endereço", "Telefone", "CPF", "CTPS", "Salário", "QTD Horas", "Valor Hora"};  
        String[][] dados = new String[0][0];
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);  

        //2a. parte - setar modelo de dados no JTable
        tabela.setModel(modelo);

        //3a. parte - adicionar linhas na tabela
        ArrayList<Tecnicos> lista = DadosTecnicos.retornaLista();
        for (Tecnicos t : DadosTecnicos.retornaLista()){
        	String salarioTecnico = String.valueOf(t.getSalarioFunc());
        	String numeroHorasTecnico = String.valueOf(t.getQtdHoraExtra());
        	String valorHorasTecnico = String.valueOf(t.getValorHoraExtra());
            modelo.addRow(new String [] {t.getNomePessoa(), t.getCargo(), t.getDepartamento(), t.getEnderecoFunc(), t.getTelefoneFunc(), t.getCpfPessoa(), t.getCtpsFunc(), salarioTecnico, numeroHorasTecnico, valorHorasTecnico});

        }
    }
}