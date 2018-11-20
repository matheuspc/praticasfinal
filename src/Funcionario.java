import java.util.Scanner;

public abstract class Funcionario extends Pessoa{
	
	String enderecoFunc;
	String telefoneFunc;
	String ctpsFunc;
	double salarioFunc;
	
	public String getEnderecoFunc() {
		return enderecoFunc;
	}

	public boolean setEnderecoFunc(String enderecoFunc) {
		if (enderecoFunc.length()>0) {
			this.enderecoFunc = enderecoFunc;
			return true;
		}
		else {
			System.out.println("Endereço inválido!");
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
			System.out.println("Telefone inválido!");
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
			System.out.println("CTPS inválido!");
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
			System.out.println("Salário inválido!");
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite o endereço do funcionário: ");
		while(!setEnderecoFunc(s.nextLine()));
		
		System.out.println("Digite o telefone do funcionário: ");
		while(!setTelefoneFunc(s.nextLine()));
		
		s.nextLine();
		System.out.println("Digite o CTPS do funcionário: ");
		while(!setCtpsFunc(s.nextLine()));
				
		System.out.println("Digite o salário do funcionário: ");
		while(!setSalarioFunc(s.nextDouble()));
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Endereço: " + this.enderecoFunc);
		System.out.println("Telefone: " + this.telefoneFunc);
		System.out.println("CTPS: " + this.ctpsFunc);
		System.out.println("Salário: " + this.salarioFunc);
		
	}
	
	public abstract double calcSalario();
}
