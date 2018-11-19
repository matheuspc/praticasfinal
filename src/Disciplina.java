import java.util.Scanner;

public class Disciplina {
	
	int codigoDisciplina;
	String nomeDisciplina;
	int cargaHoraria;
	Curso curso;
	Professor professor;
	
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o c�digo da disciplina: ");
		this.codigoDisciplina = s.nextInt();
		
		System.out.println("Digite o nome da disciplina: ");
		this.nomeDisciplina = s.nextLine();
		
		System.out.println("Digite a carga hor�ria da disciplina: ");
		this.cargaHoraria = s.nextInt();
		
		this.curso = new Curso();
		this.curso.lerDados();
		this.professor = new Professor();
		this.professor.lerDados();
				
	}
	
	public void mostrarDados() {
		
		System.out.println("C�digo da disciplina: " + this.codigoDisciplina);
		System.out.println("Nome da disciplina: " + this.nomeDisciplina);
		System.out.println("Carga hor�ria da disciplina: " + this.cargaHoraria);
		this.curso.mostrarDados();
		this.professor.mostrarDados();
	}

}
