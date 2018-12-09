package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosCursoGraduacao;
import model.CursoGraduacao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCursoGraduacao extends JFrame {

	private JPanel contentPane;
	private JTextField nomeCursoGraduacao;
	private JTextField codCursoGraduacao;
	private JTextField duracaoCursosGraduacao;
	private JTextField disciplinasCursoGraduacao;

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
		setTitle("GSchool v1.0 - Cadastro Curso Gradua\u00E7\u00E3o");
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
		
		nomeCursoGraduacao = new JTextField();
		nomeCursoGraduacao.setColumns(10);
		nomeCursoGraduacao.setBounds(10, 30, 219, 20);
		panel.add(nomeCursoGraduacao);
		
		JLabel lblCdigoDoCurso = new JLabel("C\u00F3digo do Curso");
		lblCdigoDoCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigoDoCurso.setBounds(10, 61, 109, 22);
		panel.add(lblCdigoDoCurso);
		
		codCursoGraduacao = new JTextField();
		codCursoGraduacao.setColumns(10);
		codCursoGraduacao.setBounds(10, 81, 219, 20);
		panel.add(codCursoGraduacao);
		
		JLabel duracaoCursoGraduacao = new JLabel("Dura\u00E7\u00E3o");
		duracaoCursoGraduacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		duracaoCursoGraduacao.setBounds(10, 145, 65, 42);
		panel.add(duracaoCursoGraduacao);
		
		duracaoCursosGraduacao = new JTextField();
		duracaoCursosGraduacao.setColumns(10);
		duracaoCursosGraduacao.setBounds(10, 177, 65, 20);
		panel.add(duracaoCursosGraduacao);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CursoGraduacao cg = new CursoGraduacao();
				
				cg.setNomeCurso(nomeCursoGraduacao.getText());
				cg.setCodigoCurso(codCursoGraduacao.getText());
				cg.setDuracaoCurso(duracaoCursosGraduacao.getText());
				
				DadosCursoGraduacao.cadastrar(cg);
				DadosCursoGraduacao.listar();
				
				nomeCursoGraduacao.setText("");
				codCursoGraduacao.setText("");
				duracaoCursosGraduacao.setText("");
				
				
				JOptionPane.showMessageDialog(null, "OK!");
			}
		});
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDisciplinas.setBounds(10, 112, 109, 22);
		panel.add(lblDisciplinas);
		
		disciplinasCursoGraduacao = new JTextField();
		disciplinasCursoGraduacao.setColumns(10);
		disciplinasCursoGraduacao.setBounds(10, 133, 109, 20);
		panel.add(disciplinasCursoGraduacao);
	}
}
