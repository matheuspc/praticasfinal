package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.*;

import model.CursoPosGraduacao;
import model.Professor;

public abstract class DadosProfessores implements Serializable {

	private static ArrayList <Professor> professores;//= new ArrayList <Professor> ();
	
	static {
		professores = (ArrayList <Professor>)Persist.recuperar("professores.dat");
		if(professores==null) {
			professores = new ArrayList <Professor>();
		}
	}
	
	public static ArrayList <Professor> retornaLista(){
		return professores;
	}
	
	public static void cadastrar (Professor p) {
		professores.add(p);
		boolean r = Persist.gravar(professores, "professores.dat");
	}
	
	public static void deletar (int i) {
		professores.remove(i);
	}
	
	public static void alterar (int i, Professor p) {
		//professores.get(i).setNomeCurso((cpg.getNomeCurso()));
		//professores.get(i).setCodigoCurso(cpg.getCodigoCurso());
		//professores.get(i).setDuracaoCurso(cpg.getDuracaoCurso());
	}
	
	
	public static void listar () {
		for(Professor p: professores) {
			p.mostrarDados();
		}
	}
	
	public static Professor buscar(String cpf) {
		for(Professor p: professores) {
			if(p.getCpfPessoa().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	public static boolean excluir(String cpf) {
		for(Professor p: professores) {
			if(p.getCpfPessoa().equals(cpf)) {
				professores.remove(cpf);
				return true;
			}
		}
		return false;
	}
	
}
