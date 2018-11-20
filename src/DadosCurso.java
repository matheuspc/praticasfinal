import java.util.*;

public class DadosCurso {

		private ArrayList <Curso> cursos = new ArrayList <Curso>();
		
		public void cadastrar (Curso c) {
			this.cursos.add(c);
			System.out.println("Total de cursos inseridos...: ");
			System.out.println(this.cursos.size());
		}
		
		public void listar() {
			for (Curso objeto: cursos) {
				objeto.mostrarDados();
			}
		}
		
		public Curso buscar (String codigo) {
			Curso c = this.buscar(codigo);
			for(Curso objeto: this.cursos) {
				if(objeto.getCodigoCurso().equals(codigo)) {
					c = objeto;
					break;
				}
			}
			return c;
		}
		
		public boolean excluir (String codigo) {
			Curso c = this.buscar(codigo);
			if(c!=null) {
				this.cursos.remove(codigo);
				return true;
			}
			else {
				return false;
			}
		}
	

}
