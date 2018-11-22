package DAO;
import Persistencia.*;
import java.io.Serializable;
import java.util.*;

import model.AlunoGraduacao;

public abstract class DadosAlunoGraduacao implements Serializable {
	
	private static ArrayList <AlunoGraduacao> alunos = new ArrayList <AlunoGraduacao>();
	
	static {
		alunos = (ArrayList <AlunoGraduacao>)Persist.recuperar("alunosG.dat");
		if(alunos==null) {
			alunos = new ArrayList<AlunoGraduacao>();
		}
	}
	
	public static void adicionar (AlunoGraduacao a) {
		alunos.add(a);
		boolean r = Persist.gravar(alunos, "alunosG.dat");
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
