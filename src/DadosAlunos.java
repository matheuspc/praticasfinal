import java.util.*;

public abstract class DadosAlunos {
	
	private static ArrayList <Aluno> alunos = new ArrayList <Aluno>();
	
	public static void cadastrar (Aluno a) {
		alunos.add(a);
	}
	
	public static void listar() {
		for(Aluno a: alunos) {
			a.mostrarDados();
		}
	}
	
	public static Aluno buscar(String matricula) {
		for (Aluno a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				return a;
			}
		}
		return null;
	}
	
	public static boolean excluir (String matricula) {
		for(Aluno a: alunos) {
			if(a.getMatriculaAluno().equals(matricula)) {
				alunos.remove(a);
				return true;
			}
		}
		return false;
	}
	
}
