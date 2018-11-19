import java.util.Scanner;

public class Tecnicos extends Funcionario {
	
	public String getCargo() {
		return cargo;
	}

	public boolean setCargo(String cargo) {
		if(cargo.length()>0) {
			this.cargo = cargo;
			return true;
		}
		else {
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
			return false;
		}
	}

	String cargo;
	String departamento;
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite o cargo do técnico: ");
		this.cargo = s.nextLine();
		
		System.out.println("Digite o departamento do técnico: ");
		this.departamento = s.nextLine();
	}

	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento: " + this.departamento);
		
	}
}
