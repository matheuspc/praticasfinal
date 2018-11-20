import java.util.*;

public class DadosDisciplina {

	private ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();
	
	public void cadastrar (Disciplina d) {
		this.disciplinas.add(d);
		System.out.println("Total de disciplinas inseridas...: ");
		System.out.println(this.disciplinas.size());
	}
	
	public void listar() {
		for (Disciplina objeto: disciplinas) {
			objeto.mostrarDados();
		}
	}
	
	public Disciplina buscar (String codigo) {
		Disciplina d = null;
		for(Disciplina objeto: this.disciplinas) {
			if(objeto.getCodigoDisciplina().equals(codigo)) {
				d = objeto;
				break;
			}
		}
		return d;
	}
	
	public boolean excluir (String codigo) {
		Disciplina d = this.buscar(codigo);
		if(d!=null) {
			this.disciplinas.remove(codigo);
			return true;
		}
		else {
			return false;
		}
	}
}
