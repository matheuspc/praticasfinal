import java.util.Scanner;

public class Pessoa {
	
	String nomePessoa;
	String cpfPessoa;
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public boolean setNomePessoa(String nomePessoa) {
		if(nomePessoa.length()>0) {
			this.nomePessoa = nomePessoa;
			return true;
		}
		else {
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
		this.nomePessoa = s.nextLine();
		
		System.out.println("Digite o CPF: ");
		this.cpfPessoa = s.nextLine();
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("Matrícula: " + this.cpfPessoa);
	}

}
