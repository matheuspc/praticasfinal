package view;
import model.*;
import DAO.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAlunoGraduacao extends JFrame {

	private JPanel contentPane;
	private JTextField nameAlunoG;
	private JTextField cpfAlunoG;
	private JTextField matriculaAlunoG;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunoGraduacao frame = new CadastroAlunoGraduacao();
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
	public CadastroAlunoGraduacao() {
		setTitle("Cadastro de Alunos - Gschool v1.0");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 593, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 11, 65, 22);
		contentPane.add(lblNome);
		
		nameAlunoG = new JTextField();
		nameAlunoG.setBounds(10, 30, 219, 20);
		contentPane.add(nameAlunoG);
		nameAlunoG.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(10, 65, 65, 22);
		contentPane.add(lblCpf);
		
		cpfAlunoG = new JTextField();
		cpfAlunoG.setColumns(10);
		cpfAlunoG.setBounds(10, 98, 219, 20);
		contentPane.add(cpfAlunoG);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMatrcula.setBounds(10, 129, 65, 22);
		contentPane.add(lblMatrcula);
		
		matriculaAlunoG = new JTextField();
		matriculaAlunoG.setColumns(10);
		matriculaAlunoG.setBounds(10, 162, 219, 20);
		contentPane.add(matriculaAlunoG);
		
		JLabel lblSituaoDaMatrcula = new JLabel("Situa\u00E7\u00E3o");
		lblSituaoDaMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSituaoDaMatrcula.setBounds(10, 193, 146, 22);
		contentPane.add(lblSituaoDaMatrcula);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Matriculado");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 222, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDesligado = new JRadioButton("Desligado");
		buttonGroup.add(rdbtnDesligado);
		rdbtnDesligado.setBounds(121, 222, 109, 23);
		contentPane.add(rdbtnDesligado);
		
		JRadioButton rdbtnTrancado = new JRadioButton("Trancado");
		buttonGroup.add(rdbtnTrancado);
		rdbtnTrancado.setBounds(232, 222, 109, 23);
		contentPane.add(rdbtnTrancado);
		
		JLabel lblSelecioneOCurso = new JLabel("Selecione o curso");
		lblSelecioneOCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso.setBounds(10, 256, 146, 22);
		contentPane.add(lblSelecioneOCurso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Administra\u00E7\u00E3o", "Direito", "Medicina", "Sistemas de Informa\u00E7\u00E3o"}));
		comboBox.setBounds(10, 289, 146, 20);
		contentPane.add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AlunoGraduacao ag = new AlunoGraduacao();				
				
				ag.setCpf(cpfAlunoG.getText());
				ag.setMatriculaAluno(matriculaAlunoG.getText());
				ag.setNomePessoa(nameAlunoG.getText());
				
				DadosAlunoGraduacao.adicionar(ag);
				
				nameAlunoG.setText("");
				cpfAlunoG.setText("");
				matriculaAlunoG.setText("");
				
				
			}
		});
		btnCadastrar.setBounds(10, 351, 109, 23);
		contentPane.add(btnCadastrar);
	}
}
