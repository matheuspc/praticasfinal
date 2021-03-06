package DAO;
import Persistencia.*;
import java.io.Serializable;
import java.util.*;

import model.AlunoGraduacao;

public abstract class DadosAlunoGraduacao implements Serializable {
	
	private static ArrayList <AlunoGraduacao> alunos; //= new ArrayList <AlunoGraduacao>();
	
	static {
		alunos = (ArrayList <AlunoGraduacao>)Persist.recuperar("alunosG.dat");
		if(alunos==null) {
			alunos = new ArrayList<AlunoGraduacao>();
		}
	}
	
	public static ArrayList<AlunoGraduacao> retornaLista() {
        return alunos;
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
	
	public static void deletar (int i) {
		alunos.remove(i);
	}
	
	public static void alterar (int i, AlunoGraduacao ag) {
		alunos.get(i).setNomePessoa(ag.getNomePessoa());
		alunos.get(i).setCpf(ag.getCpfPessoa());
		alunos.get(i).setMatriculaAluno(ag.getMatriculaAluno());
		alunos.get(i).setSituacao(ag.getSituacao());
	}


}
