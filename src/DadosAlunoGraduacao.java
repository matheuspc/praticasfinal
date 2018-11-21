import java.util.*;

public abstract class DadosAlunoGraduacao {
	
	private static ArrayList <AlunoGraduacao> alunos = new ArrayList <AlunoGraduacao>();
	
	public static void adicionar (AlunoGraduacao a) {
		alunos.add(a);
	}
	
	public static void listar() {
		for (AlunoGraduacao a: alunos) {
			a.mostrarDados();
		}
	}
	
	public static AlunoGraduacao buscar (String matricula) {
		for (AlunoGraduacao a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				return a;
			}
		}
		return null;
	}
	
	public static boolean excluir(String matricula) {
		for (AlunoGraduacao a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				alunos.remove(matricula);
				return true;
			}
						
		}
		return false;	
	}

}
