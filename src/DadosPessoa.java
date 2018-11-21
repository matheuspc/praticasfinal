import java.util.*;

public abstract class DadosPessoa {

	private static ArrayList <Pessoa> pessoas = new ArrayList <Pessoa>();
	
	public static void cadastrar (Pessoa p) {
		pessoas.add(p);
	}
	
	public static void listar() {
		for(Pessoa p: pessoas) {
			p.mostrarDados();
		}
	}
	
	public static Pessoa buscar (String cpf) {
		for (Pessoa p: pessoas) {
			if(p.getCpfPessoa().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	public static boolean excluir (String cpf) {
		for (Pessoa p: pessoas) {
			if(p.getCpfPessoa().equals(cpf)) {
				pessoas.remove(cpf);
				return true;
			}
		}
		return false;
	}
}
