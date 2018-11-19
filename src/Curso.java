import java.util.Scanner;

public class Curso {
	
	int codigoCurso;
	String nomeCurso;
	int duracaoCurso;
	
	public int getCodigoCurso() {
		return codigoCurso;
	}

	public boolean setCodigoCurso(int codigoCurso) {
		if(codigoCurso>0) {
			this.codigoCurso = codigoCurso;
			return true;
		}
		else {
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
			return false;
		}
	}

	public int getDuracaoCurso() {
		return duracaoCurso;
	}

	public boolean setDuracaoCurso(int duracaoCurso) {
		if(duracaoCurso>0) {
			this.duracaoCurso = duracaoCurso;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		this.nomeCurso = s.nextLine();
		
		System.out.println("Digite o código do curso: ");
		this.codigoCurso = s.nextInt();
		
		System.out.println("Digite a duração do curso: ");
		this.duracaoCurso = s.nextInt();
	}
	
	public void mostrarDados() {
		
		System.out.println("Código do curso: " + this.codigoCurso);
		System.out.println("Nome do curso: " + this.nomeCurso);
		System.out.println("Duração do curso: " + this.duracaoCurso);
	}

}
