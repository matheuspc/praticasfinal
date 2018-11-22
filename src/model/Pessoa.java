package model;
import java.util.*;

import main.ValidaCPF;

public abstract class Pessoa implements Pesquisador {
	
	private String nomePessoa;
	private String cpfPessoa;
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public boolean setNomePessoa(String nomePessoa) {
		if(nomePessoa.length()>0) {
			this.nomePessoa = nomePessoa;
			return true;
		}
		else {
			System.out.println("Nome inválido!");
			return false;
		}
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

    public boolean setCpf (String cpfPessoa){
        if (ValidaCPF.isCPF(cpfPessoa)) {
            //System.out.printf("%s\n", ValidaCPF.imprimeCPF(getCpfPessoa()));
            this.cpfPessoa = cpfPessoa;
            return true;
        }
        else {
            System.out.printf("Favor inserir um CPF válido: \n");
            return false;
        }

    }

	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		while(!setNomePessoa(s.nextLine()));
		
		System.out.println("Digite o CPF: ");
		while (!setCpf(s.nextLine()));
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("CPF: " + this.cpfPessoa);
	}

}
