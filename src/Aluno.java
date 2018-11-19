import java.util.Scanner;

public class Aluno extends Pessoa {
	
	String nomeAluno;
	String matriculaAluno;
	String cpfAluno;
	Curso curso;
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public boolean setNomeAluno(String nomeAluno) {
		if(nomeAluno.length()>0) {
			this.nomeAluno = nomeAluno;
			return true;
		}
		else {
			return false;
		}
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public boolean setMatriculaAluno(String matriculaAluno) {
		if(matriculaAluno.length()>0) {
			this.matriculaAluno = matriculaAluno;
			return true;
		}
		else {
			return false;
		}
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public boolean setCpfAluno(String cpfAluno) {
		if(cpfAluno.length()>0) {
			this.cpfAluno = cpfAluno;
			return true;
		}
		else {
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite a matrícula do aluno: ");
		this.matriculaAluno = s.nextLine();
		
		this.curso = new Curso();
		this.curso.lerDados();		
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Matrícula: " + this.matriculaAluno);
		this.curso.mostrarDados();

	}


}
