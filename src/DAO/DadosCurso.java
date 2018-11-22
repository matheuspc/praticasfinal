package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.Serializable;

import model.Curso;

public abstract class DadosCurso implements Serializable {

		private static ArrayList <Curso> cursos = new ArrayList <Curso>();
		
		static {
			cursos = (ArrayList <Curso>)Persist.recuperar("cursosC.dat");
			if(cursos==null) {
				cursos = new ArrayList <Curso>();
			}
		}
		
		public static void cadastrar (Curso c) {
			cursos.add(c);
			boolean r = Persist.gravar(cursos, "cursosC.dat");
		}
		
		public static void listar() {
			for (Curso c: cursos) {
				c.mostrarDados();
			}
		}
		
		public static Curso buscar (String codigo) {
			for(Curso c: cursos) {
				if(c.getCodigoCurso().equals(codigo)) {
					return c;
				}			
			}
			return null;
		}
		
		public static boolean excluir(String codigo) {
			for (Curso c: cursos) {
				if(c.getCodigoCurso().equals(codigo)) {
					cursos.remove(codigo);
					return true;
				}
							
			}
			return false;	
		}
	

}
