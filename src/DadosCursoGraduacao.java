import java.util.*;

public abstract class DadosCursoGraduacao {

	private static ArrayList <CursoGraduacao> cursos = new ArrayList <CursoGraduacao>();
		
		public static void cadatrar(CursoGraduacao c) {
		cursos.add(c);
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
