import java.util.*;

public abstract class DadosTecnicos {

	private static ArrayList <Tecnicos> tecnicos = new ArrayList <Tecnicos>();
	
	public static void cadastrar (Tecnicos t) {
		tecnicos.add(t);
	}
	
	public static void listar () {
		for(Tecnicos t: tecnicos) {
			t.mostrarDados();
		}
	}
	
	public static Tecnicos buscar(String cpf) {
		for(Tecnicos t: tecnicos) {
			if(t.getCpfPessoa().equals(cpf)) {
				return t;
			}
		}
		return null;
	}
	
	public static boolean excluir (String cpf) {
		for(Tecnicos t: tecnicos) {
			if(t.getCpfPessoa().equals(cpf)) {
				tecnicos.remove(cpf);
				return true;
			}
		}
		return false;
	}
	
}
