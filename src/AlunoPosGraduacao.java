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
			System.out.println("Gradua��o inv�lida!");
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
			System.out.println("Ano de in�cio inv�lido!");
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
			System.out.println("Ano de conclus�o inv�lido!");
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a gradua��o do aluno:");
		while(!setGraduacao(s.nextLine()));
		
		System.out.println("Digite o ano de in�cio da gradua��o: ");
		while(!setAnoInicio(s.nextLine()));
		
		System.out.println("Digite o ano de conclus�o da gradua��o: ");
		while(!setAnoConclusao(s.nextLine()));
		
		this.curso = new Curso();
		this.curso.lerDados();
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		
		System.out.println("Gradua��o: " + this.graduacao);
		System.out.println("Ano de in�cio: " + this.anoInicio);
		System.out.println("Ano de conclus�o: " + this.anoConclusao);
		this.curso.mostrarDados();
	}
}
