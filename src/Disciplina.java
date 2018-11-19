import java.util.Scanner;

public class Disciplina {
	
	int codigoDisciplina;
	String nomeDisciplina;
	int cargaHoraria;
	Curso curso;
	Professor professor;
	
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public boolean setCodigoDisciplina(int codigoDisciplina) {
		if(codigoDisciplina>0) {
			this.codigoDisciplina = codigoDisciplina;
			return true;
		}
		else {
			return false;
		}
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public boolean setNomeDisciplina(String nomeDisciplina) {
		if(nomeDisciplina.length()>0) {
			this.nomeDisciplina = nomeDisciplina;
			return true;
		}
		else {
			return false;
		}
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public boolean setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria>0) {
			this.cargaHoraria = cargaHoraria;
			return true;
		}
		else {
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o código da disciplina: ");
		this.codigoDisciplina = s.nextInt();
		
		System.out.println("Digite o nome da disciplina: ");
		this.nomeDisciplina = s.nextLine();
		
		System.out.println("Digite a carga horária da disciplina: ");
		this.cargaHoraria = s.nextInt();
		
		this.curso = new Curso();
		this.curso.lerDados();
		this.professor = new Professor();
		this.professor.lerDados();
				
	}
	
	public void mostrarDados() {
		
		System.out.println("Código da disciplina: " + this.codigoDisciplina);
		System.out.println("Nome da disciplina: " + this.nomeDisciplina);
		System.out.println("Carga horária da disciplina: " + this.cargaHoraria);
		this.curso.mostrarDados();
		this.professor.mostrarDados();
	}

}
