package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.*;

import model.CursoPosGraduacao;

public abstract class DadosCursoPosGraduacao implements Serializable {

	private static ArrayList <CursoPosGraduacao> cursos = new ArrayList <CursoPosGraduacao>();
	
	static {
		cursos = (ArrayList <CursoPosGraduacao>)Persist.recuperar("cursosP.dat");
		if(cursos==null)
			cursos = new ArrayList <CursoPosGraduacao>();
	}
	
	public static void cadastrar (CursoPosGraduacao c) {
		cursos.add(c);
		boolean r = Persist.gravar(cursos, "cursosP.dat");
	}
	
	public static void listar() {
		for(CursoPosGraduacao c: cursos) {
			c.mostrarDados();
		}
	}
	
	public static CursoPosGraduacao buscar (String codigo) {
		for(CursoPosGraduacao c: cursos) {
			if(c.getCodigoCurso().equals(codigo)) {
				return c;
			}
		}
		return null;
	}
	
	public static boolean excluir (String codigo) {
		for (CursoPosGraduacao c: cursos) {
			if(c.getCodigoCurso().equals(codigo)) {
				cursos.remove(codigo);
				return true;
			}
		}
		return false;
	}
}
