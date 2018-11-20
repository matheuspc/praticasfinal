import java.util.*;

public class DadosFuncionario {

	private ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario>();
	
	public void cadastrar (Funcionario f) {
		this.funcionarios.add(f);
		System.out.println("Total de Funcionários inseridos...: ");
		System.out.println(this.funcionarios.size());
	}
	
	public void listar() {
		for (Funcionario objeto: funcionarios) {
			objeto.mostrarDados();
		}
	}
	
	public Funcionario buscar (String cpf) {
		Funcionario f = null;
		for(Funcionario objeto: funcionarios) {
			if(objeto.getCpfPessoa().equals(cpf)) {
				f = objeto;
				break;
			}
		}
		return f;
	}
	
	public boolean excluir (String cpf) {
		Funcionario f = this.buscar(cpf);
		if(f!=null) {
			this.funcionarios.remove(cpf);
			return true;
		}
		else {
			return false;
		}
	}
}
