import java.util.*;

public class ProjetoPesquisa {
	
	String codigoPesquisa;
	String dtInicioPesquisa;
	String dtFimPesquisa;
	Professor professor;
	private static ArrayList <Pesquisador> equipe = new ArrayList <Pesquisador>();
	
	public static void listar (Pesquisador p) {
		equipe.add(p);
	}
	
	public static void listar () {
		for (Pesquisador p: equipe) {
			p.mostrarDados();
			System.out.println("-------------------------");
		}
	}

}
