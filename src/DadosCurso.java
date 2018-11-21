import java.util.*;

public abstract class DadosCurso {

		private static ArrayList <Curso> cursos = new ArrayList <Curso>();
		
		public static void cadastrar (Curso c) {
			cursos.add(c);
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
