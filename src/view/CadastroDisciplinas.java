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

public class CadastroDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDisciplinas frame = new CadastroDisciplinas();
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
	public CadastroDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 252, 247);
		contentPane.add(panel);
		
		JLabel lblNomeDaDisciplina = new JLabel("Nome da Disciplina");
		lblNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeDaDisciplina.setBounds(10, 11, 126, 22);
		panel.add(lblNomeDaDisciplina);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 30, 219, 20);
		panel.add(textField);
		
		JLabel lblCdigoDaDisciplina = new JLabel("C\u00F3digo da Disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigoDaDisciplina.setBounds(10, 61, 126, 22);
		panel.add(lblCdigoDaDisciplina);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 81, 219, 20);
		panel.add(textField_1);
		
		JLabel lblCargaHorria = new JLabel("Carga Hor\u00E1ria");
		lblCargaHorria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCargaHorria.setBounds(10, 145, 86, 42);
		panel.add(lblCargaHorria);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 177, 65, 20);
		panel.add(textField_2);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProfessor.setBounds(10, 112, 109, 22);
		panel.add(lblProfessor);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 133, 109, 20);
		panel.add(textField_3);
	}

}
