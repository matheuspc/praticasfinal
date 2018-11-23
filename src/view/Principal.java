package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matheus.cardoso\\eclipse-workspace\\ProjectPoo1\\src\\iconMain.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 491);
		
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
		mnFuncionrio.add(mntmProfessor);
		
		JMenuItem mntmTcnico = new JMenuItem("T\u00E9cnico");
		mnFuncionrio.add(mntmTcnico);
		
		JMenu mnCursos = new JMenu("Cursos");
		mnCadastros.add(mnCursos);
		
		JMenuItem mntmGraduao_1 = new JMenuItem("Gradua\u00E7\u00E3o");
		mnCursos.add(mntmGraduao_1);
		
		JMenuItem mntmPsGraduao_1 = new JMenuItem("P\u00F3s Gradua\u00E7\u00E3o");
		mnCursos.add(mntmPsGraduao_1);
		
		JMenuItem mntmDisciplinas = new JMenuItem("Disciplinas");
		mnCadastros.add(mntmDisciplinas);
		
		JMenuItem mntmPesquisador = new JMenuItem("Pesquisador");
		mnCadastros.add(mntmPesquisador);
		
		JMenu mnVisualizar = new JMenu("Visualizar");
		menuBar.add(mnVisualizar);
		
		JMenuItem mntmAlunos = new JMenuItem("Alunos");
		mnVisualizar.add(mntmAlunos);
		
		JMenu mnFuncoinrios = new JMenu("Funcion\u00E1rios");
		mnVisualizar.add(mnFuncoinrios);
		
		JMenuItem mntmProfessor_1 = new JMenuItem("Professores");
		mnFuncoinrios.add(mntmProfessor_1);
		
		JMenuItem mntmTcnicos = new JMenuItem("T\u00E9cnicos");
		mnFuncoinrios.add(mntmTcnicos);
		
		JMenuItem mntmCursos = new JMenuItem("Cursos");
		mnVisualizar.add(mntmCursos);
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		menuBar.add(mnFinanceiro);
		
		JMenuItem mntmFolhaDePagamento = new JMenuItem("Folha de Pagamento");
		mnFinanceiro.add(mntmFolhaDePagamento);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
