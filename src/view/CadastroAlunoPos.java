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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

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
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10, 11, 65, 22);
		contentPane.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		nameAlunoPos = new JTextField();
		nameAlunoPos.setBounds(10, 36, 355, 20);
		contentPane.add(nameAlunoPos);
		nameAlunoPos.setColumns(10);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setBounds(10, 63, 65, 22);
		contentPane.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		cpfAlunoPos = new JTextField();
		cpfAlunoPos.setBounds(10, 87, 146, 20);
		contentPane.add(cpfAlunoPos);
		cpfAlunoPos.setColumns(10);
		
		JLabel label_2 = new JLabel("Matr\u00EDcula");
		label_2.setBounds(10, 102, 65, 42);
		contentPane.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		matriculaAlunoPos = new JTextField();
		matriculaAlunoPos.setBounds(10, 134, 146, 20);
		contentPane.add(matriculaAlunoPos);
		matriculaAlunoPos.setColumns(10);
		
		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o");
		label_3.setBounds(197, 63, 146, 22);
		contentPane.add(label_3);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton matriculado = new JRadioButton("Matriculado");
		matriculado.setBounds(194, 86, 139, 23);
		contentPane.add(matriculado);
		buttonGroup.add(matriculado);
		
		JRadioButton desligado = new JRadioButton("Desligado");
		desligado.setBounds(195, 107, 148, 23);
		contentPane.add(desligado);
		buttonGroup.add(desligado);
		
		JRadioButton trancado = new JRadioButton("Trancado");
		trancado.setBounds(195, 128, 158, 23);
		contentPane.add(trancado);
		buttonGroup.add(trancado);
		
		JLabel label_4 = new JLabel("Selecione o curso");
		label_4.setBounds(10, 172, 146, 22);
		contentPane.add(label_4);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton cadastrarPos = new JButton("Cadastrar");
		cadastrarPos.setBounds(119, 311, 109, 23);
		contentPane.add(cadastrarPos);
		
		JLabel lblGraduao = new JLabel("Gradua\u00E7\u00E3o");
		lblGraduao.setBounds(10, 200, 146, 22);
		contentPane.add(lblGraduao);
		lblGraduao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		graduacaoAlunoPos = new JTextField();
		graduacaoAlunoPos.setBounds(10, 225, 355, 20);
		contentPane.add(graduacaoAlunoPos);
		graduacaoAlunoPos.setColumns(10);
		
		JLabel lblDataDeIncio = new JLabel("Data de In\u00EDcio");
		lblDataDeIncio.setBounds(10, 251, 83, 22);
		contentPane.add(lblDataDeIncio);
		lblDataDeIncio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblDataDeConcluso = new JLabel("Data de Conclus\u00E3o");
		lblDataDeConcluso.setBounds(219, 242, 109, 42);
		contentPane.add(lblDataDeConcluso);
		lblDataDeConcluso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		dtInicioPos = new JTextField();
		dtInicioPos.setBounds(10, 270, 146, 20);
		contentPane.add(dtInicioPos);
		dtInicioPos.setColumns(10);
		
		dtConclusaoPos = new JTextField();
		dtConclusaoPos.setBounds(219, 272, 146, 20);
		contentPane.add(dtConclusaoPos);
		dtConclusaoPos.setColumns(10);
		
		JComboBox cursoPosBox = new JComboBox();
		cursoPosBox.setBounds(121, 174, 244, 20);
		contentPane.add(cursoPosBox);
		cursoPosBox.setModel(new DefaultComboBoxModel(new String[] {}));
		
		ArrayList<CursoPosGraduacao> cursos = DadosCursoPosGraduacao.retornaLista();
        for(int i=0; i<cursos.size();i++) {
        	CursoPosGraduacao cursoPos = cursos.get(i);
        	cursoPosBox.addItem(cursoPos);
        	
        }
		
		cadastrarPos.addActionListener(new ActionListener() {
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
				
				CursoPosGraduacao cursoEscolhido = (CursoPosGraduacao) cursoPosBox.getSelectedItem();
				ap.setCursoPos(cursoEscolhido);
				
				DadosAlunoPosGraduacao.cadastrar(ap);
				
				nameAlunoPos.setText("");
				cpfAlunoPos.setText("");
				matriculaAlunoPos.setText("");
				graduacaoAlunoPos.setText("");
				dtInicioPos.setText("");
				dtConclusaoPos.setText("");
				
			}
		});

	}
}
