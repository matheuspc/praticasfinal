package DAO;
import java.util.*;

import Persistencia.Persist;

import java.io.*;

import model.Pessoa;

public abstract class DadosPessoa implements Serializable{

	private static ArrayList <Pessoa> pessoas = new ArrayList <Pessoa>();
	
	static {
		pessoas = (ArrayList <Pessoa>)Persist.recuperar("pessoas.dat");
		if(pessoas==null) {
			pessoas = new ArrayList <Pessoa>();
		}
	}
	
	public static void cadastrar (Pessoa p) {
		pessoas.add(p);
		boolean r = Persist.gravar(pessoas, "pessoas.dat");
	}
	
	public static void listar() {
		for(Pessoa p: pessoas) {
			p.mostrarDados();
		}
	}
	
	public static Pessoa buscar (String cpf) {
		for (Pessoa p: pessoas) {
			if(p.getCpfPessoa().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	public static boolean excluir (String cpf) {
		for (Pessoa p: pessoas) {
			if(p.getCpfPessoa().equals(cpf)) {
				pessoas.remove(cpf);
				return true;
			}
		}
		return false;
	}
}
