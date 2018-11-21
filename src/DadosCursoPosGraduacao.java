import java.util.*;

public abstract class DadosCursoPosGraduacao {

	private static ArrayList <CursoPosGraduacao> cursos = new ArrayList <CursoPosGraduacao>();
	
	public static void cadastrar (CursoPosGraduacao c) {
		cursos.add(c);
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
