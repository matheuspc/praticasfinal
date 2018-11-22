package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.Serializable;

import model.CursoGraduacao;

public abstract class DadosCursoGraduacao implements Serializable {

	private static ArrayList <CursoGraduacao> cursos = new ArrayList <CursoGraduacao>();
		
		static {
			cursos = (ArrayList <CursoGraduacao>)Persist.recuperar("cursosG.dat");
			if(cursos==null) {
				cursos = new ArrayList<CursoGraduacao>();
			}
		}
	
		public static void cadatrar(CursoGraduacao c) {
		cursos.add(c);
		boolean r = Persist.gravar(cursos, "cursosG.dat");
	}
	
	public static void listar () {
		for(CursoGraduacao c: cursos) {
			c.mostrarDados();
		}
	}
	
	public static CursoGraduacao buscar (String codigo) {
		for(CursoGraduacao c: cursos) {
			if(c.getCodigoCurso().equals(codigo)) {
				return c;
			}
		}
		return null;
	}
	
	public static boolean excluir (String codigo) {
		for(CursoGraduacao c: cursos) {
			if(c.getCodigoCurso().equals(codigo)) {
				cursos.remove(codigo);
				return true;
			}
		}
		return false;
	}
}
