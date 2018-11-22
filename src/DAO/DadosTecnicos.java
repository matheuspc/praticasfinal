package DAO;
import java.util.*;

import Persistencia.Persist;
import model.Tecnicos;
import java.io.*;

public abstract class DadosTecnicos implements Serializable{

	private static ArrayList <Tecnicos> tecnicos = new ArrayList <Tecnicos>();
	
	static {
		tecnicos = (ArrayList <Tecnicos>)Persist.recuperar("tecnicos.dat");
		if(tecnicos==null) {
			tecnicos = new ArrayList <Tecnicos>();
		}
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
