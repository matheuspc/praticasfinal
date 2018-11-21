import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
	
	String graduacao;
	String anoInicio;
	String anoConclusao;
	CursoPosGraduacao cpg;
	
	AlunoPosGraduacao(CursoPosGraduacao cpg){
		
	}
	AlunoPosGraduacao(){
		
	}

	public String getGraduacao() {
		return graduacao;
	}

	public boolean setGraduacao(String graduacao) {
		if(graduacao.length()>0) {
			this.graduacao = graduacao;
			return true;
		}
		else {
			System.out.println("Graduação inválida!");
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
			System.out.println("Ano de início inválido!");
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
			System.out.println("Ano de conclusão inválido!");
			return false;
		}
	}
	
	public void lerDados() {
		
		Scanner s = new Scanner(System.in);
		super.lerDados();
		
		System.out.println("Digite a graduação do aluno:");
		while(!setGraduacao(s.nextLine()));
		
		System.out.println("Digite o ano de início da graduação: ");
		while(!setAnoInicio(s.nextLine()));
		
		System.out.println("Digite o ano de conclusão da graduação: ");
		while(!setAnoConclusao(s.nextLine()));
		
		this.cpg = new CursoPosGraduacao();
		this.cpg.lerDados();
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		
		System.out.println("Graduação: " + this.graduacao);
		System.out.println("Ano de início: " + this.anoInicio);
		System.out.println("Ano de conclusão: " + this.anoConclusao);
		this.cpg.mostrarDados();
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
}
