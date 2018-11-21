import java.util.Scanner;

public class AlunoGraduacao extends Aluno {
	
	CursoGraduacao cg;
	
	AlunoGraduacao(CursoGraduacao cg){
		
	}
	
	AlunoGraduacao(){
		
	}
	
	public CursoGraduacao getCursoGraduacao() {
		return cg;
	}

	public void setCursoGraduacao(CursoGraduacao cg) {
		this.cg = cg;
	}

	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		
		super.lerDados();
		
		this.cg = new CursoGraduacao();
		this.cg.lerDados();		
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		this.cg.mostrarDados();
	}

}
