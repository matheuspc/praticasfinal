package model;
import java.util.Scanner;

public class Professor extends Funcionario {
	
	private String titulacao;
	private String areaPesquisa;
	private double numeroHorasAula;
	private double valorHoraAula;
	
	public double getNumeroHorasAula() {
		return numeroHorasAula;
	}

	public void setNumeroHorasAula(double numeroHorasAula) {
		this.numeroHorasAula = numeroHorasAula;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public boolean setTitulacao(String titulacao) {
		if(titulacao.length()>0) {
			this.titulacao = titulacao;
			return true;
		}
		else {
			System.out.println("Titulação inválida!");
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
			System.out.println("Área de pesquisa inválida!");
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a titulação do professor:  ");
		while(!setTitulacao(s.nextLine()));
		
		System.out.println("Digite a área de pesquisa do professor: ");
		while(!setAreaPesquisa(s.nextLine()));	
	}
	
	public void mostrarDados() {		
		
		super.mostrarDados();
		System.out.println("Titulação: " + this.titulacao);
		System.out.println("Área de Pesquisa: " + this.areaPesquisa);
		
	}

	public double calcSalario() {
		return numeroHorasAula * valorHoraAula;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
