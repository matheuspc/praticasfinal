import java.util.Scanner;

public class Pessoa {
	
	String nomePessoa;
	String cpfPessoa;
	
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		this.nomePessoa = s.nextLine();
		
		System.out.println("Digite a matrícula do aluno: ");
		this.cpfPessoa = s.nextLine();
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("Matrícula: " + this.cpfPessoa);
	}

}
