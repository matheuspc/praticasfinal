package model;
import java.lang.reflect.Array;
import java.util.*;

public abstract class Curso {
	
	private String codigoCurso;
	private String nomeCurso;
	private String duracaoCurso;
	private ArrayList <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void adicionarDisciplinas(Disciplina d) {
		disciplinas.add(d);
	}
	
	public void mostrarDisciplinas() {
		for(Disciplina d: disciplinas) {
			d.mostrarDados();
		}
	}
	
	public void removerDisciplinas(Disciplina d) {
		disciplinas.remove(d);
	}
	
	public String getCodigoCurso() {
		return codigoCurso;
	}

	public boolean setCodigoCurso(String codigoCurso) {
		if(codigoCurso.length()>0) {
			this.codigoCurso = codigoCurso;
			return true;
		}
		else {
			System.out.println("C�digo do curso inv�lido!");
			return false;
		}
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public boolean setNomeCurso(String nomeCurso) {
		if(nomeCurso.length()>0) {
			this.nomeCurso = nomeCurso;
			return true;
		}
		else {
			System.out.println("Nome do curso inv�lido!");
			return false;
		}
	}

	public String getDuracaoCurso() {
		return duracaoCurso;
	}

	public boolean setDuracaoCurso(String duracaoCurso) {
		if(duracaoCurso.length() > 0) {
			this.duracaoCurso = duracaoCurso;
			return true;
		}
		else {
			System.out.println("Dura��o do curso inv�lida!");
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		while(!setNomeCurso(s.nextLine()));
		
		System.out.println("Digite o c�digo do curso: ");
		while(!setCodigoCurso(s.nextLine()));
		
		System.out.println("Digite a dura��o do curso: ");
		while(!setDuracaoCurso(s.nextLine()));
	}
	
	public void mostrarDados() {
		
		System.out.println("C�digo do curso: " + this.codigoCurso);
		System.out.println("Nome do curso: " + this.nomeCurso);
		System.out.println("Dura��o do curso: " + this.duracaoCurso);
	}

}
