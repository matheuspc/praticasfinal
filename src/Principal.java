
public class Principal {

	public static void main(String[] args) {

	/*AlunoGraduacao a = new AlunoGraduacao();
	a.lerDados();
	
	CursoGraduacao c = new CursoGraduacao();
	c.lerDados();
	
	a.setCursoGraduacao(c);
		
	a.mostrarDados();
	a.getCursoGraduacao().mostrarDados();
	
	Disciplina d = new Disciplina();
	d.lerDados();
	*/
	
	CursoGraduacao cg = new CursoGraduacao();
	cg.lerDados();
		
	//AlunoGraduacao ag = new AlunoGraduacao(cg);	
	Disciplina d = new Disciplina(cg);
	d.lerDados();
	d.mostrarDados();
}
	}
