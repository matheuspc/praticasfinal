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

public class CadastroProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_1;
	private JTextField textField_10;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 66, 242, 20);
		panel.add(textField);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(10, 97, 109, 22);
		panel.add(lblCpf);
		
		JLabel lblTitulao = new JLabel("Titula\u00E7\u00E3o");
		lblTitulao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitulao.setBounds(272, 36, 109, 22);
		panel.add(lblTitulao);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 66, 242, 20);
		panel.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 127, 242, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblreaDePesquisa = new JLabel("\u00C1rea de Pesquisa");
		lblreaDePesquisa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblreaDePesquisa.setBounds(272, 97, 109, 22);
		panel.add(lblreaDePesquisa);
		
		JLabel lblQtdDeHoras = new JLabel("Qtd de Horas Aula");
		lblQtdDeHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQtdDeHoras.setBounds(272, 218, 109, 22);
		panel.add(lblQtdDeHoras);
		
		textField_5 = new JTextField();
		textField_5.setBounds(272, 251, 109, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblValorHoraAula = new JLabel("Valor Hora Aula");
		lblValorHoraAula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorHoraAula.setBounds(405, 218, 109, 22);
		panel.add(lblValorHoraAula);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(405, 251, 109, 20);
		panel.add(textField_6);
		
		JButton button = new JButton("Cadastrar");
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 188, 242, 20);
		panel.add(textField_7);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 219, 126, 22);
		panel.add(lblTelefone);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 251, 242, 20);
		panel.add(textField_8);
		
		JLabel lblDadosProfissionais = new JLabel("Dados Profissionais");
		lblDadosProfissionais.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDadosProfissionais.setBounds(272, 13, 242, 14);
		panel.add(lblDadosProfissionais);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(272, 188, 242, 20);
		panel.add(textField_9);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalrio.setBounds(272, 158, 126, 22);
		panel.add(lblSalrio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 127, 109, 20);
		panel.add(textField_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(143, 127, 109, 20);
		panel.add(textField_10);
		
		JLabel lblCtps = new JLabel("CTPS");
		lblCtps.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCtps.setBounds(143, 97, 109, 22);
		panel.add(lblCtps);
	}
}
