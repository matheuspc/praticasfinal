import java.util.Scanner;

public class Aluno extends Pessoa {
	
	String nomeAluno;
	String matriculaAluno;
	String cpfAluno;
	Curso curso;
	
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite a matr�cula do aluno: ");
		this.matriculaAluno = s.nextLine();
		
		this.curso = new Curso();
		this.curso.lerDados();		
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Matr�cula: " + this.matriculaAluno);
		this.curso.mostrarDados();

	}


}
