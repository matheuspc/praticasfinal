import java.util.Scanner;

public class Tecnicos extends Funcionario {
	
	String cargo;
	String departamento;
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite o cargo do t�cnico: ");
		this.cargo = s.nextLine();
		
		System.out.println("Digite o departamento do t�cnico: ");
		this.departamento = s.nextLine();
	}

	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento: " + this.departamento);
		
	}
}
