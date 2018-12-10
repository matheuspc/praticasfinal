package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.*;

import model.Disciplina;
import model.Professor;

public abstract class DadosDisciplina implements Serializable {

	private static ArrayList <Disciplina> disciplinas;// = new ArrayList <Disciplina>();
	
	static {
		disciplinas = (ArrayList <Disciplina>)Persist.recuperar("disciplinas.dat");
		if(disciplinas==null) {
			disciplinas = new ArrayList <Disciplina>();
		}
	}
	
	public static ArrayList <Disciplina> retornaLista(){
		return disciplinas;
	}
	
	public static void deletar (int i) {
		disciplinas.remove(i);
	}
	
	public static void alterar (int i, Disciplina d) {
		disciplinas.get(i).setNomeDisciplina(d.getNomeDisciplina());
		disciplinas.get(i).setCodigoDisciplina(d.getCodigoDisciplina());
		disciplinas.get(i).setCargaHoraria(d.getCargaHoraria());
	}
	
	public static void cadastrar (Disciplina d) {
		disciplinas.add(d);
		boolean r = Persist.gravar(disciplinas, "disciplinas.dat");
	}
	
	public static void listar() {
		for (Disciplina d: disciplinas) {
			d.mostrarDados();
		}
	}
	
	public static Disciplina buscar (String codigo) {
		for (Disciplina d: disciplinas) {
			if(d.getCodigoDisciplina().equals(codigo)) {
				return d;
			}
		}
		return null;
	}
	
	public static boolean excluir (String codigo) {
		for(Disciplina d: disciplinas) {
			if(d.getCodigoDisciplina().equals(codigo)) {
				disciplinas.remove(codigo);
				return true;
			}
		}
		return false;
	}
}
