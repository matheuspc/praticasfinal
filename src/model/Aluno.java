package model;
import java.util.Scanner;

public abstract class Aluno extends Pessoa implements Pesquisador {
	
	private String matriculaAluno;
	private String situacao;
	private byte situacaoMatricula;
	private Curso curso;
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getSituacao() {
		return situacao;
	}

	public boolean setSituacao(String situacao) {
		if(situacao.equals("m") || situacao.equals("t") || situacao.equals("d")) {
			if(situacao.equals("m")) {
				this.situacaoMatricula = 1;
			}
			else if(situacao.equals("t")){
				this.situacaoMatricula = 2; 
			}
			else if(situacao.equals("d")) {
				this.situacaoMatricula = 3;
			}
			this.situacao = situacao;
			return true;
		}
		else {
			System.out.println("Situa��o inv�lida!");
			return false;
		}
		
	}	
	
	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public boolean setMatriculaAluno(String matriculaAluno) {
		if(matriculaAluno.length()>0) {
			this.matriculaAluno = matriculaAluno;
			return true;
		}
		else {
			System.out.println("Matr�cula inv�lida!");
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite a matr�cula do aluno: ");
		while(!setMatriculaAluno(s.nextLine()));
		
		System.out.println("Digite a situa��o do curso: ");
		while(!setSituacao(s.nextLine()));
					
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Matr�cula: " + this.matriculaAluno);
		if(this.situacaoMatricula == 1) {
			System.out.println("Matriculado");
		}
		else if(this.situacaoMatricula == 2) {
			System.out.println("Trancado");
		}
		else if(this.situacaoMatricula == 3) {
			System.out.println("Desligado");
		}
		//this.curso.mostrarDados();

	}


}
