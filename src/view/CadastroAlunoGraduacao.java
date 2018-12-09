package view;
import model.*;
import DAO.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
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
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

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
		setTitle("GSchool v1.0 - Cadastro Aluno Gradua\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 335, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 11, 65, 22);
		contentPane.add(lblNome);
		
		nameAlunoG = new JTextField();
		nameAlunoG.setBounds(10, 30, 299, 20);
		contentPane.add(nameAlunoG);
		nameAlunoG.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(10, 61, 65, 22);
		contentPane.add(lblCpf);
		
		cpfAlunoG = new JTextField();
		cpfAlunoG.setColumns(10);
		cpfAlunoG.setBounds(10, 82, 299, 20);
		contentPane.add(cpfAlunoG);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMatrcula.setBounds(10, 113, 65, 22);
		contentPane.add(lblMatrcula);
		
		matriculaAlunoG = new JTextField();
		matriculaAlunoG.setColumns(10);
		matriculaAlunoG.setBounds(10, 134, 299, 20);
		contentPane.add(matriculaAlunoG);
		
		JLabel lblSituaoDaMatrcula = new JLabel("Situa\u00E7\u00E3o");
		lblSituaoDaMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSituaoDaMatrcula.setBounds(10, 165, 146, 22);
		contentPane.add(lblSituaoDaMatrcula);
		
		JRadioButton matriculado = new JRadioButton("Matriculado");
		buttonGroup_1.add(matriculado);
		matriculado.setBounds(10, 194, 109, 23);
		contentPane.add(matriculado);
		
		JRadioButton desligado = new JRadioButton("Desligado");
		buttonGroup_1.add(desligado);
		desligado.setBounds(120, 194, 109, 23);
		contentPane.add(desligado);
		
		JRadioButton trancado = new JRadioButton("Trancado");
		buttonGroup_1.add(trancado);
		trancado.setBounds(229, 194, 109, 23);
		contentPane.add(trancado);
		
		JLabel cursoAlunoGraduacao = new JLabel("Selecione o curso");
		cursoAlunoGraduacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cursoAlunoGraduacao.setBounds(10, 224, 146, 22);
		contentPane.add(cursoAlunoGraduacao);
		
		JComboBox cursoBox = new JComboBox();
		cursoBox.setModel(new DefaultComboBoxModel(new String[] {"", "Administra\u00E7\u00E3o", "Direito", "Medicina", "Sistemas"}));
		cursoBox.setBounds(10, 245, 299, 20);
		contentPane.add(cursoBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AlunoGraduacao ag = new AlunoGraduacao();				
				
				ag.setCpf(cpfAlunoG.getText());
				ag.setMatriculaAluno(matriculaAlunoG.getText());
				ag.setNomePessoa(nameAlunoG.getText());
				
				if(matriculado.isSelected()) {
					ag.setSituacao("Matriculado");
				}
				else if (trancado.isSelected()) {
					ag.setSituacao("Trancado");
				}
				else if (desligado.isSelected()) {
					ag.setSituacao("Desligado");
				}
				
				if (cursoBox.getSelectedItem().equals("Sistemas")) {
					JOptionPane.showMessageDialog(null, "Sistemas efetuado com sucesso!");
				}
				
				//ag.setCursoGraduacao(cg);
				DadosAlunoGraduacao.adicionar(ag);
				
				DadosAlunoGraduacao.listar();
				
				//System.out.println(DadosAlunoGraduacao.retorno());
				
				
				nameAlunoG.setText("");
				cpfAlunoG.setText("");
				matriculaAlunoG.setText("");
				//buttonGroup.setSelected(null, b);
				
				
			//	AlunoGraduacao alunim = DadosAlunoGraduacao.buscar(ag.getMatriculaAluno());
				
				//for (A)
				
				//System.out.println(alunim.getNomePessoa());
				
				//JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
			}
		});
		btnCadastrar.setBounds(108, 288, 109, 23);
		contentPane.add(btnCadastrar);
	}
}
