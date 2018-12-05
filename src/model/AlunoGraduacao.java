package model;
import java.io.Serializable;
import java.util.Scanner;

public class AlunoGraduacao extends Aluno implements Serializable{
	
	CursoGraduacao cg;
	
	AlunoGraduacao(CursoGraduacao cg){
		
	}
	
	public AlunoGraduacao (){
		
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
		
		cg = new CursoGraduacao();
		this.cg.lerDados();		
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		this.cg.mostrarDados();
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome();
	}

}
