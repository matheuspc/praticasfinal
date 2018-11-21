
public class Principal {

	public static void main(String[] args) {

		DadosAlunos alunos = new DadosAlunos();
		DadosCurso cursos = new DadosCurso();
		DadosDisciplina disciplinas = new DadosDisciplina();
		DadosFuncionario funcionarios = new DadosFuncionario();
		DadosProfessores professores = new DadosProfessores();
		DadosTecnicos tecnicos = new DadosTecnicos();
		
		AlunoGraduacao a = new AlunoGraduacao();
		a.lerDados();
		alunos.cadastrar(a);
		alunos.listar();
		
		CursoGraduacao c = new CursoGraduacao();
		c.lerDados();
		cursos.cadastrar(c);

		a.setCurso(c);
	
	}
	}

