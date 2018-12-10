package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DadosCurso;
import DAO.DadosCursoGraduacao;
import DAO.DadosDisciplina;
import DAO.DadosProfessores;
import model.CursoGraduacao;
import model.Disciplina;
import model.Professor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class CadastroDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField nomeDisciplina;
	private JTextField codigoDisciplina;
	private JTextField cargaDisciplina;

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
		setResizable(false);
		setTitle("GSchool v1.0 - Cadastro Disciplinas");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 272, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 252, 303);
		contentPane.add(panel);
		
		JLabel lblNomeDaDisciplina = new JLabel("Nome da Disciplina");
		lblNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeDaDisciplina.setBounds(10, 11, 126, 22);
		panel.add(lblNomeDaDisciplina);
		
		nomeDisciplina = new JTextField();
		nomeDisciplina.setColumns(10);
		nomeDisciplina.setBounds(10, 30, 232, 20);
		panel.add(nomeDisciplina);
		
		JLabel lblCdigoDaDisciplina = new JLabel("C\u00F3digo da Disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigoDaDisciplina.setBounds(10, 61, 126, 22);
		panel.add(lblCdigoDaDisciplina);
		
		codigoDisciplina = new JTextField();
		codigoDisciplina.setColumns(10);
		codigoDisciplina.setBounds(10, 81, 232, 20);
		panel.add(codigoDisciplina);
		
		JLabel lblCargaHorria = new JLabel("Carga Hor\u00E1ria");
		lblCargaHorria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCargaHorria.setBounds(10, 217, 86, 22);
		panel.add(lblCargaHorria);
		
		cargaDisciplina = new JTextField();
		cargaDisciplina.setColumns(10);
		cargaDisciplina.setBounds(10, 239, 65, 20);
		panel.add(cargaDisciplina);
		
		JComboBox cursoBoxDisciplina = new JComboBox();
		cursoBoxDisciplina.setModel(new DefaultComboBoxModel(new String[] {}));
		cursoBoxDisciplina.setBounds(10, 134, 232, 20);
		panel.add(cursoBoxDisciplina);
		
		ArrayList <CursoGraduacao> cursos = DadosCursoGraduacao.retornaLista();
		for(int i=0; i<cursos.size();i++) {
        	CursoGraduacao cursoGraduacao = cursos.get(i);
        	cursoBoxDisciplina.addItem(cursoGraduacao);        	
        }
		
		JComboBox profBoxDisciplina = new JComboBox();
		profBoxDisciplina.setModel(new DefaultComboBoxModel(new String[] {}));
		profBoxDisciplina.setBounds(10, 186, 232, 20);
		panel.add(profBoxDisciplina);
		
		ArrayList <Professor> professores = DadosProfessores.retornaLista();
		for(int i=0; i<professores.size();i++) {
        	Professor prof = professores.get(i);
        	profBoxDisciplina.addItem(prof);        	
        }
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Disciplina d = new Disciplina();
				
				d.setNomeDisciplina(nomeDisciplina.getText());
				d.setCodigoDisciplina(codigoDisciplina.getText());
				
				int cargaHoraria = Integer.parseInt(cargaDisciplina.getText());
				d.setCargaHoraria(cargaHoraria);
				
				CursoGraduacao cursoEscolhido = (CursoGraduacao) cursoBoxDisciplina.getSelectedItem();
				d.setCg(cursoEscolhido);
				
				Professor proff = (Professor) profBoxDisciplina.getSelectedItem();
				d.setProfessor(proff);
				
				DadosDisciplina.cadastrar(d);
				DadosDisciplina.listar();
				
				nomeDisciplina.setText("");
				codigoDisciplina.setText("");
				cargaDisciplina.setText("");
				
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			}
		});
		button.setBounds(73, 270, 109, 23);
		panel.add(button);
		
		JLabel lblProfessor = new JLabel("Selecione o Professor:");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProfessor.setBounds(10, 165, 232, 22);
		panel.add(lblProfessor);
		
		JLabel lblSelecioneOCurso = new JLabel("Selecione o curso:");
		lblSelecioneOCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso.setBounds(10, 112, 126, 22);
		panel.add(lblSelecioneOCurso);
		
	}
}
