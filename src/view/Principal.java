package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JButton;

import model.*;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("GSchool v1.0 - Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matheus.cardoso\\eclipse-workspace\\ProjectPoo1\\src\\iconMain.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 636);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenu mnNewMenu = new JMenu("Alunos");
		mnCadastros.add(mnNewMenu);
		
		JMenuItem mntmGraduao = new JMenuItem("Gradua\u00E7\u00E3o");
		mntmGraduao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroAlunoGraduacao cagr = new CadastroAlunoGraduacao();
				cagr.setVisible(true);
			}
		});
		mnNewMenu.add(mntmGraduao);
		
		JMenuItem mntmPsGraduao = new JMenuItem("P\u00F3s Gradua\u00E7\u00E3o");
		mntmPsGraduao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroAlunoPos cap = new CadastroAlunoPos();
				cap.setVisible(true);
				
				
			}
		});
		mnNewMenu.add(mntmPsGraduao);
		
		JMenu mnFuncionrio = new JMenu("Funcion\u00E1rio");
		mnCadastros.add(mnFuncionrio);
		
		JMenuItem mntmProfessor = new JMenuItem("Professor");
		mntmProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastroProfessor cp = new CadastroProfessor();
				cp.setVisible(true);
				
			}
		});
		mnFuncionrio.add(mntmProfessor);
		
		JMenuItem mntmTcnico = new JMenuItem("T\u00E9cnico");
		mntmTcnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastroTecnico ct = new CadastroTecnico();
				ct.setVisible(true);
			}
		});
		mnFuncionrio.add(mntmTcnico);
		
		JMenu mnCursos = new JMenu("Cursos");
		mnCadastros.add(mnCursos);
		
		JMenuItem mntmGraduao_1 = new JMenuItem("Gradua\u00E7\u00E3o");
		mntmGraduao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastroCursoGraduacao ccg = new CadastroCursoGraduacao();
				ccg.setVisible(true);
				
			}
		});
		mnCursos.add(mntmGraduao_1);
		
		JMenuItem mntmPsGraduao_1 = new JMenuItem("P\u00F3s Gradua\u00E7\u00E3o");
		mntmPsGraduao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastroCursoPos ccp = new CadastroCursoPos();
				ccp.setVisible(true);
			
			}
		});
		mnCursos.add(mntmPsGraduao_1);
		
		JMenuItem mntmDisciplinas = new JMenuItem("Disciplinas");
		mntmDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastroDisciplinas cd = new CadastroDisciplinas();
				cd.setVisible(true);
			
			}
		});
		mnCadastros.add(mntmDisciplinas);
		
		JMenu mnVisualizar = new JMenu("Visualizar");
		menuBar.add(mnVisualizar);
		
		JMenu mnAlunos = new JMenu("Alunos");
		mnVisualizar.add(mnAlunos);
		
		JMenuItem mntmAlunos = new JMenuItem("Alunos Gradua\u00E7\u00E3o");
		mnAlunos.add(mntmAlunos);
		
		JMenuItem mntmAlunoPs = new JMenuItem("Aluno P\u00F3s");
		mnAlunos.add(mntmAlunoPs);
		mntmAlunoPs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VisualizarAlunosPos vap = new VisualizarAlunosPos();
				vap.setVisible(true);
			
			}
		});
		mntmAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VisualizarAlunos va = new VisualizarAlunos();
				va.setVisible(true);
				
			}
		});
		
		JMenu mnFuncoinrios = new JMenu("Funcion\u00E1rios");
		mnVisualizar.add(mnFuncoinrios);
		
		JMenuItem mntmProfessor_1 = new JMenuItem("Professores");
		mntmProfessor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VisualizarProfessores vp = new VisualizarProfessores();
				vp.setVisible(true);
			
			}
		});
		mnFuncoinrios.add(mntmProfessor_1);
		
		JMenuItem mntmTcnicos = new JMenuItem("T\u00E9cnicos");
		mntmTcnicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VisualizarTecnicos vt = new VisualizarTecnicos();
				vt.setVisible(true);
				
			}
		});
		mnFuncoinrios.add(mntmTcnicos);
		
		JMenu mnCursos_1 = new JMenu("Cursos");
		mnVisualizar.add(mnCursos_1);
		
		JMenuItem mntmGraduao_2 = new JMenuItem("Gradua\u00E7\u00E3o");
		mntmGraduao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			VisualizarCursosGraduacao vcg = new VisualizarCursosGraduacao();
			vcg.setVisible(true);
			
			}
		});
		mnCursos_1.add(mntmGraduao_2);
		
		JMenuItem mntmPsGraduao_2 = new JMenuItem("P\u00F3s Gradua\u00E7\u00E3o");
		mntmPsGraduao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VisualizarCursosPos vcp = new VisualizarCursosPos();
				vcp.setVisible(true);
				
			}
		});
		mnCursos_1.add(mntmPsGraduao_2);
		
		JMenuItem mntmDisciplinas_1 = new JMenuItem("Disciplinas");
		mntmDisciplinas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				VisualizarDisciplinas vd = new VisualizarDisciplinas();
				vd.setVisible(true);
			
			}
		});
		mnVisualizar.add(mntmDisciplinas_1);
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		menuBar.add(mnFinanceiro);
		
		JMenuItem mntmFolhaDePagamento = new JMenuItem("Folha de Pagamento");
		mntmFolhaDePagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FinanceiroFolhaPagamento ffp = new FinanceiroFolhaPagamento();
				ffp.setVisible(true);
				
			}
		});
		mnFinanceiro.add(mntmFolhaDePagamento);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\matheus.cardoso\\eclipse-workspace\\Versao Final poo1\\praticasfinal\\favicon-proesc.png"));
		lblNewLabel.setBounds(247, 80, 687, 448);
		contentPane.add(lblNewLabel);
		
		JLabel lblGschoolGerenciador = new JLabel("GSchool - Gerenciador Escolar");
		lblGschoolGerenciador.setFont(new Font("Nirmala UI", Font.BOLD, 32));
		lblGschoolGerenciador.setBounds(254, 11, 463, 79);
		contentPane.add(lblGschoolGerenciador);
		
		JLabel lblmatheusCardoso = new JLabel("@Matheus Cardoso 2018");
		lblmatheusCardoso.setBounds(793, 550, 173, 14);
		contentPane.add(lblmatheusCardoso);
	}
}
