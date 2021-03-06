package model;
import java.util.Scanner;

public abstract class Funcionario extends Pessoa{
	
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

	private String enderecoFunc;
	private String telefoneFunc;
	private String ctpsFunc;
	private double salarioFunc;
	private static double pisoSalarial;
	
	public String getEnderecoFunc() {
		return enderecoFunc;
	}

	public boolean setEnderecoFunc(String enderecoFunc) {
		if (enderecoFunc.length()>0) {
			this.enderecoFunc = enderecoFunc;
			return true;
		}
		else {
			System.out.println("Endere�o inv�lido!");
			return false;
		}
	}

	public String getTelefoneFunc() {
		return telefoneFunc;
	}

	public boolean setTelefoneFunc(String telefoneFunc) {
		if(telefoneFunc.length()>0) {
			this.telefoneFunc = telefoneFunc;
			return true;
		}
		else {
			System.out.println("Telefone inv�lido!");
			return false;
		}
	}

	public String getCtpsFunc() {
		return ctpsFunc;
	}

	public boolean setCtpsFunc(String ctpsFunc) {
		if(ctpsFunc.length()>0) {
			this.ctpsFunc = ctpsFunc;
			return true;
		}
		else {
			System.out.println("CTPS inv�lido!");
			return false;
		}
	}

	public double getSalarioFunc() {
		return salarioFunc;
	}

	public boolean setSalarioFunc(double salarioFunc) {
		if(salarioFunc>0) {
			this.salarioFunc = salarioFunc;
			return true;
		}
		else {
			System.out.println("Sal�rio inv�lido!");
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		while(!setEnderecoFunc(s.nextLine()));
		
		System.out.println("Digite o telefone do funcion�rio: ");
		while(!setTelefoneFunc(s.nextLine()));
		
		s.nextLine();
		System.out.println("Digite o CTPS do funcion�rio: ");
		while(!setCtpsFunc(s.nextLine()));
				
		System.out.println("Digite o sal�rio do funcion�rio: ");
		//EntradaDeDados.lerDouble(s.nextDouble());
		while(!setSalarioFunc(s.nextDouble()));
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Endere�o: " + this.enderecoFunc);
		System.out.println("Telefone: " + this.telefoneFunc);
		System.out.println("CTPS: " + this.ctpsFunc);
		System.out.println("Sal�rio: " + this.salarioFunc);
		
	}
	
	public abstract double calcSalario();

	public static double getPisoSalarial() {
		return pisoSalarial;
	}

	public static void setPisoSalarial(double pisoSalarial) {
		Funcionario.pisoSalarial = pisoSalarial;
	}
}
