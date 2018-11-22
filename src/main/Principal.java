package main;
import model.*;
import java.util.*;

import DAO.DadosAlunoGraduacao;
import model.AlunoGraduacao;
import model.Pesquisador;
import model.ProjetoPesquisa;

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
		
/*		Pesquisador pesquisador;
		
		ProjetoPesquisa projetop = new ProjetoPesquisa();
		
		ArrayList <Pesquisador> equipe = new ArrayList <Pesquisador>();
		
		for (int i=1;i<2;i++) {
			pesquisador = new AlunoGraduacao();
			pesquisador.lerDados();
			equipe.add(pesquisador);
		}*/
/*		for (int i=1;i<2;i++) {
			pesquisador = new Professor();
			pesquisador.lerDados();
			equipe.add(pesquisador);
		}*/

		DadosAlunoGraduacao.listar();
	} 
		
}
	

