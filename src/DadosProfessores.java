import java.util.*;

public class DadosProfessores {

	private ArrayList <Professor> professores = new ArrayList <Professor> ();
	
	public void cadastrar (Professor p) {
		this.professores.add(p);
		System.out.println("Total de professores inseridos...: ");
		System.out.println(this.professores.size());
	}
	
	public void listar () {
		for (Professor objeto: professores) {
			objeto.mostrarDados();
		}
	}
	
	public Professor buscar (String cpf) {
		Professor p = null;
		for(Professor objeto: this.professores) {
			if(objeto.getCpfPessoa().equals(cpf)) {
				p = objeto;
				break;
			}
		}
		return p;
	}
	
	public boolean excluir (String cpf) {
		Professor p = this.buscar(cpf);
		if(p!=null) {
			this.professores.remove(cpf);
			return true;
		}
		else {
			return false;
		}
	}
	
}
