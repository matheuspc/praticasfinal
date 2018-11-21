import java.util.*;

public class DadosAlunos {
	
	private ArrayList <Aluno> alunos = new ArrayList <Aluno>();
	
	public void cadastrar(Aluno a) {
		this.alunos.add(a); //Adiciona o aluno no array
		System.out.println("Total de alunos inseridos...: ");
		System.out.println(this.alunos.size());
	}
	
	public void listar() {
		for (Aluno objeto: this.alunos) {
			objeto.mostrarDados();
		}
	}
	
	public Aluno buscar(String matricula) {
		Aluno a = null;
		for(Aluno objeto: this.alunos) {
			if(objeto.getMatriculaAluno().equals(matricula)) {
				a = objeto;
				break;
			}
		}
		return a;
	}
	
	public boolean excluir(String matricula) {
		Aluno a = this.buscar(matricula);
		if(a!=null) {
			this.alunos.remove(a);
			return true;
		}
		else {
			return false;
		}
	}

}
