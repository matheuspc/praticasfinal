package DAO;
import java.util.*;

import Persistencia.Persist;
import model.AlunoPosGraduacao;
import java.io.Serializable;

public abstract class DadosAlunoPosGraduacao implements Serializable {
	
	private static ArrayList <AlunoPosGraduacao> alunos;// = new ArrayList<AlunoPosGraduacao>();
	
	static {
		alunos = (ArrayList <AlunoPosGraduacao>)Persist.recuperar("alunosP.dat");
		if(alunos==null) {
			alunos = new ArrayList<AlunoPosGraduacao>();
		}
	}
	
	public static void cadastrar (AlunoPosGraduacao a) {
		alunos.add(a);
		boolean r = Persist.gravar(alunos, "alunosP.dat");
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
