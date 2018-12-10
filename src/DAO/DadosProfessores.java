package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.*;

import model.CursoPosGraduacao;
import model.Professor;

public abstract class DadosProfessores implements Serializable {

	private static ArrayList <Professor> professores;//= new ArrayList <Professor> ();
	
	static {
		professores = (ArrayList <Professor>)Persist.recuperar("professores.dat");
		if(professores==null) {
			professores = new ArrayList <Professor>();
		}
	}
	
	public static ArrayList <Professor> retornaLista(){
		return professores;
	}
	
	public static void cadastrar (Professor p) {
		professores.add(p);
		boolean r = Persist.gravar(professores, "professores.dat");
	}
	
	public static void deletar (int i) {
		professores.remove(i);
	}
	
	public static void alterar (int i, Professor p) {
		professores.get(i).setNomePessoa(p.getNomePessoa());
		professores.get(i).setAreaPesquisa(p.getAreaPesquisa());
		professores.get(i).setTitulacao(p.getTitulacao());
		professores.get(i).setNumeroHorasAula(p.getNumeroHorasAula());
		professores.get(i).setValorHoraAula(p.getValorHoraAula());
		professores.get(i).setEnderecoFunc(p.getEnderecoFunc());
		professores.get(i).setTelefoneFunc(p.getTelefoneFunc());
		professores.get(i).setSalarioFunc(p.getSalarioFunc());
		professores.get(i).setCpf(p.getCpfPessoa());
		professores.get(i).setCtpsFunc(p.getCtpsFunc());
		
	}
	
	
	public static void listar () {
		for(Professor p: professores) {
			p.mostrarDados();
		}
	}
	
	public static Professor buscar(String cpf) {
		for(Professor p: professores) {
			if(p.getCpfPessoa().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	public static boolean excluir(String cpf) {
		for(Professor p: professores) {
			if(p.getCpfPessoa().equals(cpf)) {
				professores.remove(cpf);
				return true;
			}
		}
		return false;
	}
	
}
