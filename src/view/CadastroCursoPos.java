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

public class CadastroCursoPos extends JFrame {

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
					CadastroCursoPos frame = new CadastroCursoPos();
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
	public CadastroCursoPos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JLabel label = new JLabel("Nome do Curso");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 11, 126, 22);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 30, 219, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("C\u00F3digo do Curso");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 61, 109, 22);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 81, 219, 20);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Dura\u00E7\u00E3o");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(10, 145, 65, 42);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 177, 65, 20);
		panel.add(textField_2);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel label_3 = new JLabel("Disciplinas");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 112, 109, 22);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 133, 109, 20);
		panel.add(textField_3);
	}

}
