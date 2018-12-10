package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosFuncionario;
import DAO.DadosProfessores;
import model.Professor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField nomeProfessor;
	private JTextField areaProfessor;
	private JTextField titulacaoProfessor;
	private JTextField qtdHorasProfessor;
	private JTextField valorHoraProfessor;
	private JTextField enderecoProfessor;
	private JTextField telefoneProfessor;
	private JTextField salarioProfessor;
	private JTextField cpfProfessor;
	private JTextField ctpsProfessor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
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
	public CadastroProfessor() {
		setResizable(false);
		setTitle("GSchool v1.0 - Cadastro Professor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 529, 337);
		contentPane.add(panel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 36, 126, 22);
		panel.add(lblNome);
		
		nomeProfessor = new JTextField();
		nomeProfessor.setColumns(10);
		nomeProfessor.setBounds(10, 66, 242, 20);
		panel.add(nomeProfessor);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(10, 97, 109, 22);
		panel.add(lblCpf);
		
		JLabel lblTitulao = new JLabel("Titula\u00E7\u00E3o");
		lblTitulao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitulao.setBounds(272, 36, 109, 22);
		panel.add(lblTitulao);
		
		titulacaoProfessor = new JTextField();
		titulacaoProfessor.setColumns(10);
		titulacaoProfessor.setBounds(272, 66, 242, 20);
		panel.add(titulacaoProfessor);
		
		areaProfessor = new JTextField();
		areaProfessor.setBounds(272, 127, 242, 20);
		panel.add(areaProfessor);
		areaProfessor.setColumns(10);
		
		JLabel lblreaDePesquisa = new JLabel("\u00C1rea de Pesquisa");
		lblreaDePesquisa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblreaDePesquisa.setBounds(272, 97, 109, 22);
		panel.add(lblreaDePesquisa);
		
		JLabel lblQtdDeHoras = new JLabel("Qtd de Horas Aula");
		lblQtdDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQtdDeHoras.setBounds(272, 218, 109, 22);
		panel.add(lblQtdDeHoras);
		
		qtdHorasProfessor = new JTextField();
		qtdHorasProfessor.setBounds(272, 251, 109, 20);
		panel.add(qtdHorasProfessor);
		qtdHorasProfessor.setColumns(10);
		
		JLabel lblValorHoraAula = new JLabel("Valor Hora Aula");
		lblValorHoraAula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorHoraAula.setBounds(405, 218, 109, 22);
		panel.add(lblValorHoraAula);
		
		valorHoraProfessor = new JTextField();
		valorHoraProfessor.setColumns(10);
		valorHoraProfessor.setBounds(405, 251, 109, 20);
		panel.add(valorHoraProfessor);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Professor p = new Professor();
				
				p.setNomePessoa(nomeProfessor.getText());
				p.setAreaPesquisa(areaProfessor.getText());
				p.setTitulacao(titulacaoProfessor.getText());
				
				double quantidadeHoras = Double.parseDouble(qtdHorasProfessor.getText());
				p.setNumeroHorasAula(quantidadeHoras);
				
				double valorHora = Double.parseDouble(valorHoraProfessor.getText());
				p.setValorHoraAula(valorHora);		
				
				p.setEnderecoFunc(enderecoProfessor.getText());
				p.setTelefoneFunc(telefoneProfessor.getText());
												
				double salarioProf = Double.parseDouble(salarioProfessor.getText());
				p.setSalarioFunc(salarioProf);
				
				p.setCpf(cpfProfessor.getText());
				p.setCtpsFunc(ctpsProfessor.getText());
				
				DadosProfessores.cadastrar(p);
				//DadosProfessores.listar();
				
				DadosFuncionario.cadastrar(p);
				
				nomeProfessor.setText("");
				areaProfessor.setText("");
				titulacaoProfessor.setText("");
				qtdHorasProfessor.setText("");
				valorHoraProfessor.setText("");
				enderecoProfessor.setText("");
				telefoneProfessor.setText("");
				salarioProfessor.setText("");
				cpfProfessor.setText("");
				ctpsProfessor.setText("");
				
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			}
		});
		button.setBounds(143, 302, 238, 23);
		panel.add(button);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDadosPessoais.setBounds(10, 11, 242, 14);
		panel.add(lblDadosPessoais);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(10, 158, 126, 22);
		panel.add(lblEndereo);
		
		enderecoProfessor = new JTextField();
		enderecoProfessor.setColumns(10);
		enderecoProfessor.setBounds(10, 188, 242, 20);
		panel.add(enderecoProfessor);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 219, 126, 22);
		panel.add(lblTelefone);
		
		telefoneProfessor = new JTextField();
		telefoneProfessor.setColumns(10);
		telefoneProfessor.setBounds(10, 251, 242, 20);
		panel.add(telefoneProfessor);
		
		JLabel lblDadosProfissionais = new JLabel("Dados Profissionais");
		lblDadosProfissionais.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDadosProfissionais.setBounds(272, 13, 242, 14);
		panel.add(lblDadosProfissionais);
		
		salarioProfessor = new JTextField();
		salarioProfessor.setColumns(10);
		salarioProfessor.setBounds(272, 188, 242, 20);
		panel.add(salarioProfessor);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalrio.setBounds(272, 158, 126, 22);
		panel.add(lblSalrio);
		
		cpfProfessor = new JTextField();
		cpfProfessor.setColumns(10);
		cpfProfessor.setBounds(10, 127, 109, 20);
		panel.add(cpfProfessor);
		
		ctpsProfessor = new JTextField();
		ctpsProfessor.setColumns(10);
		ctpsProfessor.setBounds(143, 127, 109, 20);
		panel.add(ctpsProfessor);
		
		JLabel lblCtps = new JLabel("CTPS");
		lblCtps.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCtps.setBounds(143, 97, 109, 22);
		panel.add(lblCtps);
	}
}
