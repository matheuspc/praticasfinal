import java.util.*;

public abstract class DadosProfessores {

	private static ArrayList <Professor> professores = new ArrayList <Professor> ();
	
	public static void cadastrar (Professor p) {
		professores.add(p);
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
