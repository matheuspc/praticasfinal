package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroCursoGraduacao extends JFrame {

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
					CadastroCursoGraduacao frame = new CadastroCursoGraduacao();
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
	public CadastroCursoGraduacao() {
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
		
		JLabel lblNomeDoCurso = new JLabel("Nome do Curso");
		lblNomeDoCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeDoCurso.setBounds(10, 11, 126, 22);
		panel.add(lblNomeDoCurso);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 30, 219, 20);
		panel.add(textField);
		
		JLabel lblCdigoDoCurso = new JLabel("C\u00F3digo do Curso");
		lblCdigoDoCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigoDoCurso.setBounds(10, 61, 109, 22);
		panel.add(lblCdigoDoCurso);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 81, 219, 20);
		panel.add(textField_1);
		
		JLabel lblDurao = new JLabel("Dura\u00E7\u00E3o");
		lblDurao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDurao.setBounds(10, 145, 65, 42);
		panel.add(lblDurao);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 177, 65, 20);
		panel.add(textField_2);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDisciplinas.setBounds(10, 112, 109, 22);
		panel.add(lblDisciplinas);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 133, 109, 20);
		panel.add(textField_3);
	}
}
