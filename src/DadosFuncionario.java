import java.util.*;

public abstract class DadosFuncionario {

	private static ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario>();
	
	public static void cadastrar (Funcionario f) {
		funcionarios.add(f);
	}
	
	public static void listar () {
		for(Funcionario f: funcionarios) {
			f.mostrarDados();
		}
	}
	
	public static Funcionario buscar(String cpf) {
		for(Funcionario f: funcionarios) {
			if(f.getCpfPessoa().equals(cpf)) {
				return f;
			}
		}
		return null;
	}
	
	public static boolean excluir(String cpf) {
		for(Funcionario f: funcionarios) {
			if(f.getCpfPessoa().equals(cpf)) {
				funcionarios.remove(cpf);
				return true;
			}
		}
		return false;
	}
}
