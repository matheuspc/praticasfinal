package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosCursoPosGraduacao;
import model.CursoPosGraduacao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCursoPos extends JFrame {

	private JPanel contentPane;
	private JTextField nomeCursoPos;
	private JTextField codigoCursoPos;
	private JTextField duracaoCursoPos;
	private JTextField disciplinasCursoPos;

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
		setTitle("GSchool v1.0 - Cadastro Curso P\u00F3s");
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
		
		nomeCursoPos = new JTextField();
		nomeCursoPos.setColumns(10);
		nomeCursoPos.setBounds(10, 30, 219, 20);
		panel.add(nomeCursoPos);
		
		JLabel label_1 = new JLabel("C\u00F3digo do Curso");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 61, 109, 22);
		panel.add(label_1);
		
		codigoCursoPos = new JTextField();
		codigoCursoPos.setColumns(10);
		codigoCursoPos.setBounds(10, 81, 219, 20);
		panel.add(codigoCursoPos);
		
		JLabel labelDuracao = new JLabel("Dura\u00E7\u00E3o");
		labelDuracao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelDuracao.setBounds(10, 145, 65, 42);
		panel.add(labelDuracao);
		
		duracaoCursoPos = new JTextField();
		duracaoCursoPos.setColumns(10);
		duracaoCursoPos.setBounds(10, 177, 65, 20);
		panel.add(duracaoCursoPos);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CursoPosGraduacao cpg = new CursoPosGraduacao();
				
				cpg.setNomeCurso(nomeCursoPos.getText());
				cpg.setCodigoCurso(codigoCursoPos.getText());
				cpg.setDuracaoCurso(duracaoCursoPos.getText());
				
				DadosCursoPosGraduacao.cadastrar(cpg);
				DadosCursoPosGraduacao.listar();
				
				nomeCursoPos.setText("");
				codigoCursoPos.setText("");
				duracaoCursoPos.setText("");
				
			}
		});
		button.setBounds(68, 213, 109, 23);
		panel.add(button);
		
		JLabel label_3 = new JLabel("Disciplinas");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 112, 109, 22);
		panel.add(label_3);
		
		disciplinasCursoPos = new JTextField();
		disciplinasCursoPos.setColumns(10);
		disciplinasCursoPos.setBounds(10, 133, 109, 20);
		panel.add(disciplinasCursoPos);
	}

}
