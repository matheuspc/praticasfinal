import java.util.Scanner;

public class Professor extends Funcionario {
	
	String titulacao;
	String areaPesquisa;
	
	public String getTitulacao() {
		return titulacao;
	}

	public boolean setTitulacao(String titulacao) {
		if(titulacao.length()>0) {
			this.titulacao = titulacao;
			return true;
		}
		else {
			return false;
		}
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}

	public boolean setAreaPesquisa(String areaPesquisa) {
		if(areaPesquisa.length()>0) {
			this.areaPesquisa = areaPesquisa;
			return true;
		}
		else {
			return false;
		}
	}
	
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
