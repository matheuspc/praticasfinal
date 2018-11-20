import java.util.*;

public class DadosTecnicos {

	private ArrayList <Tecnicos> tecnicos = new ArrayList <Tecnicos>();
	
	public void cadastrar (String cpf) {
		this.tecnicos.add(cpf);
		System.out.println("Quantidade de técnicos inseridos...: ");
		System.out.println(this.tecnicos.size());
	}
	
	public void listar() {
		for (Tecnicos objeto: tecnicos) {
			objeto.mostrarDados();
		}
	}
	
	public Tecnicos buscar (String cpf) {
		Tecnicos t = null;
		for(Tecnicos objeto: tecnicos) {
			if(objeto.getCpfPessoa().equals(cpf)) {
				t = objeto;
				break;
			}
		}
		return t;
	}
	
	public boolean excluir (String cpf) {
		Tecnicos t = this.buscar(cpf);
		if(t!=null) {
			this.tecnicos.remove(cpf);
			return true;
		}
		else {
			return false;
		}
	}
}
