import java.util.*;

public abstract class DadosAlunoPosGraduacao {
	
	private static ArrayList <AlunoPosGraduacao> alunos = new ArrayList<AlunoPosGraduacao>();
	
	public static void cadastrar (AlunoPosGraduacao a) {
		alunos.add(a);
	}
	
	public static void listar () {
		for(AlunoPosGraduacao a: alunos) {
			a.mostrarDados();
		}
	}
	
	public static AlunoPosGraduacao buscar(String matricula) {
		for(AlunoPosGraduacao a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				return a;
			}
		}
		return null;
	}
	
	public static boolean excluir(String matricula) {
		for(AlunoPosGraduacao a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				alunos.remove(matricula);
				return true;
			}
		}
		return false;
	}

}
