package model;
import java.util.Scanner;

public class Disciplina {
	
	private String codigoDisciplina;
	private String nomeDisciplina;
	private int cargaHoraria;
	//Curso curso;
	Professor professor;
	
	Disciplina (Curso curso){
		
	}
	
	Disciplina (){
		
	}
	
	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public boolean setCodigoDisciplina(String codigoDisciplina) {
		if(codigoDisciplina.length()>0) {
			this.codigoDisciplina = codigoDisciplina;
			return true;
		}
		else {
			System.out.println("C�digo da disciplina inv�lida!");
			return false;
		}
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public boolean setNomeDisciplina(String nomeDisciplina) {
		if(nomeDisciplina.length()>0) {
			this.nomeDisciplina = nomeDisciplina;
			return true;
		}
		else {
			System.out.println("Nome da disciplina inv�lida!");
			return false;
		}
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public boolean setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria>0) {
			this.cargaHoraria = cargaHoraria;
			return true;
		}
		else {
			System.out.println("Carga hor�ria inv�lida!");
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o c�digo da disciplina: ");
		while(!setCodigoDisciplina(s.nextLine()));
		
		System.out.println("Digite o nome da disciplina: ");
		while(!setNomeDisciplina(s.nextLine()));
		
		System.out.println("Digite a carga hor�ria da disciplina: ");
		while(!setCargaHoraria(s.nextInt()));
		
		//this.curso = new Curso();
		//this.curso.lerDados();
		this.professor = new Professor();
		this.professor.lerDados();
				
	}
	
	public void mostrarDados() {
		
		System.out.println("C�digo da disciplina: " + this.codigoDisciplina);
		System.out.println("Nome da disciplina: " + this.nomeDisciplina);
		System.out.println("Carga hor�ria da disciplina: " + this.cargaHoraria);
		//curso.mostrarDados();
		this.professor.mostrarDados();
	}
	
}