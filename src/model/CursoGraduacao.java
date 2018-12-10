package model;

import java.io.Serializable;

public class CursoGraduacao extends Curso implements Serializable {
	
	Disciplina d;
	
	CursoGraduacao(Disciplina d){
		
	}
	
	public CursoGraduacao() {
		
	}
	
	public Disciplina getD() {
		return d;
	}

	public void setD(Disciplina d) {
		this.d = d;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
