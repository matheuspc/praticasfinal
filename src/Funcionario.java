import java.util.Scanner;

public class Funcionario {
	
	String nomeFunc;
	String enderecoFunc;
	String telefoneFunc;
	String cpfFunc;
	String ctpsFunc;
	double salarioFunc;
	
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcion�rio: ");
		this.nomeFunc = s.nextLine();
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		this.enderecoFunc = s.nextLine();
		
		System.out.println("Digite o telefone do funcion�rio: ");
		this.telefoneFunc = s.nextLine();
		
		System.out.println("Digite o CPF do funcion�rio: ");
		this.cpfFunc = s.next();
		
		s.nextLine();
		System.out.println("Digite o CTPS do funcion�rio: ");
		this.ctpsFunc = s.nextLine();
				
		System.out.println("Digite o sal�rio do funcion�rio: ");
		this.salarioFunc = s.nextDouble();
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + this.nomeFunc);
		System.out.println("Endere�o: " + this.enderecoFunc);
		System.out.println("Telefone: " + this.telefoneFunc);
		System.out.println("CPF: " + this.cpfFunc);
		System.out.println("CTPS: " + this.ctpsFunc);
		System.out.println("Sal�rio: " + this.salarioFunc);
		
	}
}
