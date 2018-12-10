package model;
import java.io.Serializable;
import java.util.Scanner;

public abstract class Aluno extends Pessoa implements Pesquisador, Serializable {
	
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
		if(situacao.equals("Matriculado") || situacao.equals("Trancado") || situacao.equals("Desligado")) {
			if(situacao.equals("Matriculado")) {
				this.situacaoMatricula = 1;
			}
			else if(situacao.equals("Trancado")){
				this.situacaoMatricula = 2; 
			}
			else if(situacao.equals("Desligado")) {
				this.situacaoMatricula = 3;
			}
			this.situacao = situacao;
			return true;
		}
		else {
			System.out.println("Situação inválida!");
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
			System.out.println("Matrícula inválida!");
			return false;
		}
	}

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		System.out.println("Digite a matrícula do aluno: ");
		while(!setMatriculaAluno(s.nextLine()));
		
		System.out.println("Digite a situação do curso: ");
		while(!setSituacao(s.nextLine()));
					
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("Matrícula: " + this.matriculaAluno);
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
