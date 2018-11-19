import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
	
	String graduacao;
	String anoInicio;
	String anoConclusao;
	Curso curso;

	public String getGraduacao() {
		return graduacao;
	}

	public boolean setGraduacao(String graduacao) {
		if(graduacao.length()>0) {
			this.graduacao = graduacao;
			return true;
		}
		else {
			return false;
		}
	}

	public String getAnoInicio() {
		return anoInicio;
	}

	public boolean setAnoInicio(String anoInicio) {
		if(anoInicio.length()>0) {
			this.anoInicio = anoInicio;
			return true;
		}
		else {
			return false;
		}
	}

	public String getAnoConclusao() {
		return anoConclusao;
	}

	public boolean setAnoConclusao(String anoConclusao) {
		if(anoConclusao.length()>0) {
			this.anoConclusao = anoConclusao;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a graduação do aluno:");
		this.graduacao = s.nextLine();
		
		System.out.println("Digite o ano de início da graduação: ");
		this.anoInicio = s.nextLine();
		
		System.out.println("Digite o ano de conclusão da graduação: ");
		this.anoConclusao = s.nextLine();
		
		this.curso = new Curso();
		this.curso.lerDados();
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		
		System.out.println("Graduação: " + this.graduacao);
		System.out.println("Ano de início: " + this.anoInicio);
		System.out.println("Ano de conclusão: " + this.anoConclusao);
		this.curso.mostrarDados();
	}
}
