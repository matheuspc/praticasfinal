package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosDisciplina;
import model.Disciplina;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField nomeDisciplina;
	private JTextField codigoDisciplina;
	private JTextField cargaDisciplina;
	private JTextField professorDisciplina;

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
		setTitle("GSchool v1.0 - Cadastro Disciplinas");
		setAlwaysOnTop(true);
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
		
		JLabel lblNomeDaDisciplina = new JLabel("Nome da Disciplina");
		lblNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeDaDisciplina.setBounds(10, 11, 126, 22);
		panel.add(lblNomeDaDisciplina);
		
		nomeDisciplina = new JTextField();
		nomeDisciplina.setColumns(10);
		nomeDisciplina.setBounds(10, 30, 219, 20);
		panel.add(nomeDisciplina);
		
		JLabel lblCdigoDaDisciplina = new JLabel("C\u00F3digo da Disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigoDaDisciplina.setBounds(10, 61, 126, 22);
		panel.add(lblCdigoDaDisciplina);
		
		codigoDisciplina = new JTextField();
		codigoDisciplina.setColumns(10);
		codigoDisciplina.setBounds(10, 81, 219, 20);
		panel.add(codigoDisciplina);
		
		JLabel lblCargaHorria = new JLabel("Carga Hor\u00E1ria");
		lblCargaHorria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCargaHorria.setBounds(10, 145, 86, 42);
		panel.add(lblCargaHorria);
		
		cargaDisciplina = new JTextField();
		cargaDisciplina.setColumns(10);
		cargaDisciplina.setBounds(10, 177, 65, 20);
		panel.add(cargaDisciplina);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Disciplina d = new Disciplina();
				
				d.setNomeDisciplina(nomeDisciplina.getText());
				d.setCodigoDisciplina(codigoDisciplina.getText());
				
				int cargaHoraria = Integer.parseInt(cargaDisciplina.getText());
				d.setCargaHoraria(cargaHoraria);
				
				DadosDisciplina.cadastrar(d);
				DadosDisciplina.listar();
				
				nomeDisciplina.setText("");
				codigoDisciplina.setText("");
				cargaDisciplina.setText("");
				professorDisciplina.setText("");
			}
		});
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProfessor.setBounds(10, 112, 109, 22);
		panel.add(lblProfessor);
		
		professorDisciplina = new JTextField();
		professorDisciplina.setColumns(10);
		professorDisciplina.setBounds(10, 133, 109, 20);
		panel.add(professorDisciplina);
	}

}
