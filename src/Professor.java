import java.util.Scanner;

public class Professor extends Funcionario {
	
	String titulacao;
	String areaPesquisa;
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a titulação do professor:  ");
		this.titulacao = s.nextLine();
		
		System.out.println("Digite a área de pesquisa do professor: ");
		this.areaPesquisa = s.nextLine();		
	}
	
	public void mostrarDados() {		
		
		super.mostrarDados();
		System.out.println("Titulação: " + this.titulacao);
		System.out.println("Área de Pesquisa: " + this.areaPesquisa);
		
	}

}
