package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosFuncionario;
import DAO.DadosTecnicos;
import model.Tecnicos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroTecnico extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTecnico;
	private JTextField cargoTecnico;
	private JTextField departamentoTecnico;
	private JTextField qtdHorasTecnico;
	private JTextField valorHoraTecnico;
	private JTextField enderecoTecnico;
	private JTextField telefoneTecnico;
	private JTextField salarioTecnico;
	private JTextField cpfTecnico;
	private JTextField ctpsTecnico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTecnico frame = new CadastroTecnico();
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
	public CadastroTecnico() {
		setResizable(false);
		setTitle("GSchool v1.0 - Cadastro T\u00E9cnicos");
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
		
		JLabel label = new JLabel("Nome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 36, 126, 22);
		panel.add(label);
		
		nomeTecnico = new JTextField();
		nomeTecnico.setColumns(10);
		nomeTecnico.setBounds(10, 66, 242, 20);
		panel.add(nomeTecnico);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 97, 109, 22);
		panel.add(label_1);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCargo.setBounds(272, 36, 109, 22);
		panel.add(lblCargo);
		
		cargoTecnico = new JTextField();
		cargoTecnico.setColumns(10);
		cargoTecnico.setBounds(272, 66, 242, 20);
		panel.add(cargoTecnico);
		
		departamentoTecnico = new JTextField();
		departamentoTecnico.setColumns(10);
		departamentoTecnico.setBounds(272, 127, 242, 20);
		panel.add(departamentoTecnico);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartamento.setBounds(272, 97, 109, 22);
		panel.add(lblDepartamento);
		
		JLabel lblQtdDeHoras = new JLabel("Qtd de Horas Extra");
		lblQtdDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQtdDeHoras.setBounds(272, 218, 109, 22);
		panel.add(lblQtdDeHoras);
		
		qtdHorasTecnico = new JTextField();
		qtdHorasTecnico.setColumns(10);
		qtdHorasTecnico.setBounds(272, 251, 109, 20);
		panel.add(qtdHorasTecnico);
		
		JLabel lblValorHoraExtra = new JLabel("Valor Hora Extra");
		lblValorHoraExtra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorHoraExtra.setBounds(405, 218, 109, 22);
		panel.add(lblValorHoraExtra);
		
		valorHoraTecnico = new JTextField();
		valorHoraTecnico.setColumns(10);
		valorHoraTecnico.setBounds(405, 251, 109, 20);
		panel.add(valorHoraTecnico);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tecnicos t = new Tecnicos();
				
				t.setNomePessoa(nomeTecnico.getText());
				t.setCargo(cargoTecnico.getText());
				t.setDepartamento(departamentoTecnico.getText());
				
				Double quantidadeHoras = Double.parseDouble(qtdHorasTecnico.getText());
				t.setQtdHoraExtra(quantidadeHoras);
				
				Double valorHoras = Double.parseDouble(valorHoraTecnico.getText());
				t.setValorHoraExtra(valorHoras);
				
				t.setEnderecoFunc(enderecoTecnico.getText());
				t.setTelefoneFunc(telefoneTecnico.getText());
				
				Double salarioTec = Double.parseDouble(salarioTecnico.getText());
				t.setSalarioFunc(salarioTec);
				
				t.setCpf(cpfTecnico.getText());
				t.setCtpsFunc(ctpsTecnico.getText());
				
				DadosTecnicos.cadastrar(t);		
				
				DadosFuncionario.cadastrar(t);
				
				nomeTecnico.setText("");
				cargoTecnico.setText("");
				departamentoTecnico.setText("");
				qtdHorasTecnico.setText("");
				valorHoraTecnico.setText("");
				enderecoTecnico.setText("");
				telefoneTecnico.setText("");
				salarioTecnico.setText("");
				cpfTecnico.setText("");
				ctpsTecnico.setText("");
				
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			}
		});
		button.setBounds(143, 302, 238, 23);
		panel.add(button);
		
		JLabel label_6 = new JLabel("Dados Pessoais");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(10, 11, 242, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Endere\u00E7o");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(10, 158, 126, 22);
		panel.add(label_7);
		
		enderecoTecnico = new JTextField();
		enderecoTecnico.setColumns(10);
		enderecoTecnico.setBounds(10, 188, 242, 20);
		panel.add(enderecoTecnico);
		
		JLabel label_8 = new JLabel("Telefone");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 219, 126, 22);
		panel.add(label_8);
		
		telefoneTecnico = new JTextField();
		telefoneTecnico.setColumns(10);
		telefoneTecnico.setBounds(10, 251, 242, 20);
		panel.add(telefoneTecnico);
		
		JLabel label_9 = new JLabel("Dados Profissionais");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(272, 13, 242, 14);
		panel.add(label_9);
		
		salarioTecnico = new JTextField();
		salarioTecnico.setColumns(10);
		salarioTecnico.setBounds(272, 188, 242, 20);
		panel.add(salarioTecnico);
		
		JLabel label_10 = new JLabel("Sal\u00E1rio");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(272, 158, 126, 22);
		panel.add(label_10);
		
		cpfTecnico = new JTextField();
		cpfTecnico.setColumns(10);
		cpfTecnico.setBounds(10, 127, 109, 20);
		panel.add(cpfTecnico);
		
		ctpsTecnico = new JTextField();
		ctpsTecnico.setColumns(10);
		ctpsTecnico.setBounds(143, 127, 109, 20);
		panel.add(ctpsTecnico);
		
		JLabel label_11 = new JLabel("CTPS");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(143, 97, 109, 22);
		panel.add(label_11);
	}

}
