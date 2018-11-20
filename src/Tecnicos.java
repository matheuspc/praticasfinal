import java.util.Scanner;

public class Tecnicos extends Funcionario {
	
	String cargo;
	String departamento;
	double qtdHoraExtra;
	double valorHoraExtra;
	
	public String getCargo() {
		return cargo;
	}

	public boolean setCargo(String cargo) {
		if(cargo.length()>0) {
			this.cargo = cargo;
			return true;
		}
		else {
			System.out.println("Cargo inv�lido!");
			return false;
		}
	}

	public String getDepartamento() {
		return departamento;
	}

	public boolean setDepartamento(String departamento) {
		if(departamento.length()>0) {
			this.departamento = departamento;
			return true;
		}
		else {
			System.out.println("Departamento inv�lido!");
			return false;
		}
	}

	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite o cargo do t�cnico: ");
		while(!setCargo(s.nextLine()));
		
		System.out.println("Digite o departamento do t�cnico: ");
		while(!setDepartamento(s.nextLine()));
	}

	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento: " + this.departamento);
		
	}
	
	public double calcSalario() {
		return super.salarioFunc + (this.valorHoraExtra * this.qtdHoraExtra);  
	}
	
	public double calcSalario(double qtdHoraExtra, double valorHoraExtra) {
		return super.salarioFunc + (qtdHoraExtra * valorHoraExtra);
	}
}
