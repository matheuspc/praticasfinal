import java.util.Scanner;

public class Curso {
	
	int codigoCurso;
	String nomeCurso;
	int duracaoCurso;
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		this.nomeCurso = s.nextLine();
		
		System.out.println("Digite o c�digo do curso: ");
		this.codigoCurso = s.nextInt();
		
		System.out.println("Digite a dura��o do curso: ");
		this.duracaoCurso = s.nextInt();
	}
	
	public void mostrarDados() {
		
		System.out.println("C�digo do curso: " + this.codigoCurso);
		System.out.println("Nome do curso: " + this.nomeCurso);
		System.out.println("Dura��o do curso: " + this.duracaoCurso);
	}

}
