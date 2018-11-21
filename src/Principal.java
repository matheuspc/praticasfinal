import java.util.*;

public class Principal {

	public static void main(String[] args) {
/*		Tecnicos teste;
		
		FolhaPagamento folha = new FolhaPagamento();
		
		ArrayList <Tecnicos> tec = new ArrayList <Tecnicos>();
		
		for (int i=0;i<2;i++) {
			teste = new Tecnicos();
			teste.lerDados();
			tec.add(teste);			
		}
		
		folha.somaFolha(tec);
		System.out.println(folha.getTotalFolha());
		
		folha.relatorioFolha(tec);*/
		
		Pesquisador pesq;
		
		ProjetoPesquisa pesquisa = new ProjetoPesquisa();
		
		ArrayList <Pesquisador> p = new ArrayList <Pesquisador>();
		
		for (int i=1; i<2;i++) {
			pesq = new AlunoGraduacao();
			pesq.lerDados();
			p.add(pesq);			
		}
		for (int i=1; i<2;i++) {
			pesq = new Professor();
			pesq.lerDados();
			p.add(pesq);			
		}
		
		ProjetoPesquisa.listar();
		
		
		
		
	} 
		
}
	

