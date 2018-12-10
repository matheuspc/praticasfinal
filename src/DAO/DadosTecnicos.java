package DAO;
import java.util.*;

import Persistencia.Persist;
import model.Professor;
import model.Tecnicos;
import java.io.*;

public abstract class DadosTecnicos implements Serializable{

	private static ArrayList <Tecnicos> tecnicos;// = new ArrayList <Tecnicos>();
	
	static {
		tecnicos = (ArrayList <Tecnicos>)Persist.recuperar("tecnicos.dat");
		if(tecnicos==null) {
			tecnicos = new ArrayList <Tecnicos>();
		}
	}
	
	public static ArrayList <Tecnicos> retornaLista(){
		return tecnicos;
	}
	
	public static void deletar (int i) {
		tecnicos.remove(i);
	}
	
	public static void alterar (int i, Tecnicos t) {
		tecnicos.get(i).setNomePessoa(t.getNomePessoa());
		tecnicos.get(i).setCargo(t.getCargo());
		tecnicos.get(i).setDepartamento(t.getDepartamento());
		tecnicos.get(i).setQtdHoraExtra(t.getQtdHoraExtra());
		tecnicos.get(i).setValorHoraExtra(t.getValorHoraExtra());
		tecnicos.get(i).setEnderecoFunc(t.getEnderecoFunc());
		tecnicos.get(i).setTelefoneFunc(t.getTelefoneFunc());
		tecnicos.get(i).setSalarioFunc(t.getSalarioFunc());
		tecnicos.get(i).setCpf(t.getCpfPessoa());
		tecnicos.get(i).setCtpsFunc(t.getCtpsFunc());
	}
	
	public static void cadastrar (Tecnicos t) {
		tecnicos.add(t);
		boolean r = Persist.gravar(tecnicos, "tecnicos.dat");
	}
	
	public static void listar () {
		for(Tecnicos t: tecnicos) {
			t.mostrarDados();
		}
	}
	
	public static Tecnicos buscar(String cpf) {
		for(Tecnicos t: tecnicos) {
			if(t.getCpfPessoa().equals(cpf)) {
				return t;
			}
		}
		return null;
	}
	
	public static boolean excluir (String cpf) {
		for(Tecnicos t: tecnicos) {
			if(t.getCpfPessoa().equals(cpf)) {
				tecnicos.remove(cpf);
				return true;
			}
		}
		return false;
	}
	
}
