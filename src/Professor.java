import java.util.Scanner;

public class Professor extends Funcionario {
	
	String titulacao;
	String areaPesquisa;
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a titula��o do professor:  ");
		this.titulacao = s.nextLine();
		
		System.out.println("Digite a �rea de pesquisa do professor: ");
		this.areaPesquisa = s.nextLine();		
	}
	
	public void mostrarDados() {		
		
		super.mostrarDados();
		System.out.println("Titula��o: " + this.titulacao);
		System.out.println("�rea de Pesquisa: " + this.areaPesquisa);
		
	}

}
