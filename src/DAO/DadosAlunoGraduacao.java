package DAO;
import Persistencia.*;
import java.io.Serializable;
import java.util.*;

import model.AlunoGraduacao;

public abstract class DadosAlunoGraduacao implements Serializable {
	
	private static ArrayList <AlunoGraduacao> alunos; //= new ArrayList <AlunoGraduacao>();
	
	static {
		alunos = (ArrayList <AlunoGraduacao>)Persist.recuperar("C:\\Users\\matheus.cardoso\\eclipse-workspace\\ProjectPoo1\\src\\DAO\\alunosG.dat");
		if(alunos==null) {
			alunos = new ArrayList<AlunoGraduacao>();
		}
	}
	
	public static void adicionar (AlunoGraduacao a) {
		alunos.add(a);
		boolean r = Persist.gravar(alunos, "C:\\Users\\matheus.cardoso\\eclipse-workspace\\ProjectPoo1\\src\\DAO\\alunosG.dat");
	}
	
	public static void listar() {
		for (AlunoGraduacao a: alunos) {
			//a.mostrarDados();
			System.out.println("Nome: " + a.getNomePessoa());
			System.out.println("CPF: " + a.getCpfPessoa());
			System.out.println("Matricula: " + a.getMatriculaAluno());
			System.out.println("--------------------------------");
		}
	}
	
	public static ArrayList<AlunoGraduacao> retorno() {
		return alunos;
	}
	
	public static AlunoGraduacao buscar (String matricula) {
		try {
			
			for (AlunoGraduacao a: alunos) {				
					if(a.getMatriculaAluno().equals(matricula)) {
						return a;
					}
				
			}
			return null;
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return null;
		}
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
