package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import DAO.*;
import model.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class CadastroAlunoPos extends JFrame {

	private JPanel contentPane;
	private JTextField nameAlunoPos;
	private JTextField cpfAlunoPos;
	private JTextField matriculaAlunoPos;
	private JTextField graduacaoAlunoPos;
	private JTextField dtInicioPos;
	private JTextField dtConclusaoPos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunoPos frame = new CadastroAlunoPos();
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
	public CadastroAlunoPos() {
		setTitle("GSchool v1.0 - Cadastro Aluno P\u00F3s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 391, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel view = new JPanel();
		view.setLayout(null);
		view.setBorder(new EmptyBorder(5, 5, 5, 5));
		view.setBounds(0, 0, 375, 345);
		contentPane.add(view);
		
		JLabel label = new JLabel("Nome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 11, 65, 22);
		view.add(label);
		
		nameAlunoPos = new JTextField();
		nameAlunoPos.setColumns(10);
		nameAlunoPos.setBounds(10, 30, 355, 20);
		view.add(nameAlunoPos);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 49, 65, 22);
		view.add(label_1);
		
		cpfAlunoPos = new JTextField();
		cpfAlunoPos.setColumns(10);
		cpfAlunoPos.setBounds(10, 71, 146, 20);
		view.add(cpfAlunoPos);
		
		JLabel label_2 = new JLabel("Matr\u00EDcula");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(219, 39, 65, 42);
		view.add(label_2);
		
		matriculaAlunoPos = new JTextField();
		matriculaAlunoPos.setColumns(10);
		matriculaAlunoPos.setBounds(219, 71, 146, 20);
		view.add(matriculaAlunoPos);
		
		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 102, 146, 22);
		view.add(label_3);
		
		JRadioButton matriculado = new JRadioButton("Matriculado");
		buttonGroup.add(matriculado);
		matriculado.setBounds(10, 131, 109, 23);
		view.add(matriculado);
		
		JRadioButton desligado = new JRadioButton("Desligado");
		buttonGroup.add(desligado);
		desligado.setBounds(121, 131, 109, 23);
		view.add(desligado);
		
		JRadioButton trancado = new JRadioButton("Trancado");
		buttonGroup.add(trancado);
		trancado.setBounds(232, 131, 109, 23);
		view.add(trancado);
		
		JLabel label_4 = new JLabel("Selecione o curso");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(10, 161, 146, 22);
		view.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(146, 161, 219, 20);
		view.add(comboBox);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AlunoPosGraduacao ap = new AlunoPosGraduacao();
				
				ap.setNomePessoa(nameAlunoPos.getText());
				ap.setCpf(cpfAlunoPos.getText());
				ap.setMatriculaAluno(matriculaAlunoPos.getText());
				ap.setGraduacao(graduacaoAlunoPos.getText());
				ap.setAnoInicio(dtInicioPos.getText());
				ap.setAnoConclusao(dtConclusaoPos.getText());
				
				if(matriculado.isSelected()) {
					ap.setSituacao("Matriculado");
				}
				else if (trancado.isSelected()) {
					ap.setSituacao("Trancado");
				}
				else if (desligado.isSelected()) {
					ap.setSituacao("Desligado");
				}
				
				DadosAlunoPosGraduacao.cadastrar(ap);
				
				nameAlunoPos.setText("");
				cpfAlunoPos.setText("");
				matriculaAlunoPos.setText("");
				graduacaoAlunoPos.setText("");
				dtInicioPos.setText("");
				dtConclusaoPos.setText("");
				
			}
		});
		button.setBounds(131, 312, 109, 23);
		view.add(button);
		
		JLabel lblGraduao = new JLabel("Gradua\u00E7\u00E3o");
		lblGraduao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGraduao.setBounds(10, 194, 146, 22);
		view.add(lblGraduao);
		
		graduacaoAlunoPos = new JTextField();
		graduacaoAlunoPos.setColumns(10);
		graduacaoAlunoPos.setBounds(10, 217, 355, 20);
		view.add(graduacaoAlunoPos);
		
		JLabel lblDataDeIncio = new JLabel("Data de In\u00EDcio");
		lblDataDeIncio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataDeIncio.setBounds(10, 248, 83, 22);
		view.add(lblDataDeIncio);
		
		JLabel lblDataDeConcluso = new JLabel("Data de Conclus\u00E3o");
		lblDataDeConcluso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataDeConcluso.setBounds(219, 238, 109, 42);
		view.add(lblDataDeConcluso);
		
		dtInicioPos = new JTextField();
		dtInicioPos.setBounds(10, 281, 146, 20);
		view.add(dtInicioPos);
		dtInicioPos.setColumns(10);
		
		dtConclusaoPos = new JTextField();
		dtConclusaoPos.setColumns(10);
		dtConclusaoPos.setBounds(219, 281, 146, 20);
		view.add(dtConclusaoPos);
	}
}
