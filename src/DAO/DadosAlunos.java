package DAO;
import java.util.*;
import Persistencia.*;
import model.Aluno;
import java.io.Serializable;

public abstract class DadosAlunos implements Serializable{
	
	private static ArrayList <Aluno> alunos = new ArrayList <Aluno>();
	
	static {
		alunos = (ArrayList <Aluno>)Persist.recuperar("alunosA.dat");
		if(alunos==null) {
			alunos = new ArrayList<Aluno>();
		}
	}
	
	public static void cadastrar (Aluno a) {
		alunos.add(a);
	}
	
	public static void listar() {
		for(Aluno a: alunos) {
			a.mostrarDados();
			boolean r = Persist.gravar(alunos, "alunosA.dat");
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
