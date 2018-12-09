package DAO;
import java.util.*;

import Persistencia.Persist;
import model.AlunoGraduacao;
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
	
	public static ArrayList<AlunoPosGraduacao> retornaLista() {
        return alunos;
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
	
	
	public static void deletar (int i) {
		alunos.remove(i);
	}
	
	public static void alterar (int i, AlunoPosGraduacao ap) {
		alunos.get(i).setNomePessoa(ap.getNomePessoa());
		alunos.get(i).setCpf(ap.getCpfPessoa());
		alunos.get(i).setMatriculaAluno(ap.getMatriculaAluno());
		alunos.get(i).setGraduacao(ap.getGraduacao());
		alunos.get(i).setAnoInicio(ap.getAnoInicio());
		alunos.get(i).setAnoConclusao(ap.getAnoConclusao());
	}
	
}
