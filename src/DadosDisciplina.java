import java.util.*;

public abstract class DadosDisciplina {

	private static ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();
	
	public static void cadastrar (Disciplina d) {
		disciplinas.add(d);
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
