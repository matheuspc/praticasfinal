package model;
import java.util.Scanner;

public class Tecnicos extends Funcionario {
	
	private String cargo;
	private String departamento;
	private double qtdHoraExtra;
	private double valorHoraExtra;
	
	public double getQtdHoraExtra() {
		return qtdHoraExtra;
	}

	public void setQtdHoraExtra(double qtdHoraExtra) {
		this.qtdHoraExtra = qtdHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	//public static void setValorHoraExtra(double valorHoraExtra) {
		//Tecnicos.valorHoraExtra = valorHoraExtra;
//	}

	public String getCargo() {
		return cargo;
	}

	public boolean setCargo(String cargo) {
		if(cargo.length()>0) {
			this.cargo = cargo;
			return true;
		}
		else {
			System.out.println("Cargo inválido!");
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
			System.out.println("Departamento inválido!");
			return false;
		}
	}

	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite o cargo do técnico: ");
		while(!setCargo(s.nextLine()));
		
		System.out.println("Digite o departamento do técnico: ");
		while(!setDepartamento(s.nextLine()));
	}

	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento: " + this.departamento);
		
	}
	
	public double calcSalario() {
		return super.getSalarioFunc() + (this.valorHoraExtra * this.qtdHoraExtra);  
	}
	
	public double calcSalario(double qtdHoraExtra, double valorHoraExtra) {
		return super.getSalarioFunc() + (qtdHoraExtra * valorHoraExtra);
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
}
