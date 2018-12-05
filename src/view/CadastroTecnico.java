package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroTecnico extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 66, 242, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 97, 109, 22);
		panel.add(label_1);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCargo.setBounds(272, 36, 109, 22);
		panel.add(lblCargo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 66, 242, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(272, 127, 242, 20);
		panel.add(textField_2);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartamento.setBounds(272, 97, 109, 22);
		panel.add(lblDepartamento);
		
		JLabel lblQtdDeHoras = new JLabel("Qtd de Horas Extra");
		lblQtdDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQtdDeHoras.setBounds(272, 218, 109, 22);
		panel.add(lblQtdDeHoras);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 251, 109, 20);
		panel.add(textField_3);
		
		JLabel lblValorHoraExtra = new JLabel("Valor Hora Extra");
		lblValorHoraExtra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorHoraExtra.setBounds(405, 218, 109, 22);
		panel.add(lblValorHoraExtra);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(405, 251, 109, 20);
		panel.add(textField_4);
		
		JButton button = new JButton("Cadastrar");
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
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 188, 242, 20);
		panel.add(textField_5);
		
		JLabel label_8 = new JLabel("Telefone");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 219, 126, 22);
		panel.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 251, 242, 20);
		panel.add(textField_6);
		
		JLabel label_9 = new JLabel("Dados Profissionais");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(272, 13, 242, 14);
		panel.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(272, 188, 242, 20);
		panel.add(textField_7);
		
		JLabel label_10 = new JLabel("Sal\u00E1rio");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(272, 158, 126, 22);
		panel.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 127, 109, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(143, 127, 109, 20);
		panel.add(textField_9);
		
		JLabel label_11 = new JLabel("CTPS");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(143, 97, 109, 22);
		panel.add(label_11);
	}

}
