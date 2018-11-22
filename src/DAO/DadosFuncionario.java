package DAO;
import java.util.*;

import Persistencia.Persist;
import model.Funcionario;
import java.io.*;

public abstract class DadosFuncionario implements Serializable {

	private static ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario>();
	
	static{
		funcionarios = (ArrayList <Funcionario>)Persist.recuperar("funcionarios.dat");
		if(funcionarios==null) {
			funcionarios = new ArrayList <Funcionario>();
		}
	}
	
	public static void cadastrar (Funcionario f) {
		funcionarios.add(f);
		boolean r = Persist.gravar(funcionarios, "funcionarios.dat");
	}
	
	public static void listar () {
		for(Funcionario f: funcionarios) {
			f.mostrarDados();
		}
	}
	
	public static Funcionario buscar(String cpf) {
		for(Funcionario f: funcionarios) {
			if(f.getCpfPessoa().equals(cpf)) {
				return f;
			}
		}
		return null;
	}
	
	public static boolean excluir(String cpf) {
		for(Funcionario f: funcionarios) {
			if(f.getCpfPessoa().equals(cpf)) {
				funcionarios.remove(cpf);
				return true;
			}
		}
		return false;
	}
}
