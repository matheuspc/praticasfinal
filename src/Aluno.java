import java.util.Scanner;

public class Aluno {
	
	String nomeAluno;
	String matriculaAluno;
	String cpfAluno;
	Curso curso;
	
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		this.nomeAluno = s.nextLine();
		
		System.out.println("Digite a matrícula do aluno: ");
		this.matriculaAluno = s.nextLine();
		
		System.out.println("Digite o CPF do aluno: ");
		this.cpfAluno = s.nextLine();
		
		this.curso = new Curso();
		this.curso.lerDados();		
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + this.nomeAluno);
		System.out.println("Matrícula: " + this.matriculaAluno);
		System.out.println("CPF: " + this.cpfAluno);
		this.curso.mostrarDados();

	}


}
