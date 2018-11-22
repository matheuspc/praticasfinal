package model;
import java.util.*;

public class FolhaPagamento {

	private double totalFolha;
	double IRRF;
    double INSS;
	
	public double somaFolha (ArrayList <? extends Funcionario> funcionarios) {
		this.totalFolha = 0;
		for (Funcionario f: funcionarios) {
			this.totalFolha += f.calcSalario();
			System.out.printf("\n Nome: %s \n Salario: %1.2f \n Categoria: %s \n", f.getNomePessoa(), f.getSalarioFunc(), f.getClass().getName());
		}
		return this.totalFolha;
	}
	
	public double getTotalFolha() {
		return this.totalFolha;
	}
	
	public double getTotalEncargos() {
		return (this.totalFolha * 0.3378);
	}
	
	public double calcIRRF(Funcionario f) {
		if(f.calcSalario() > 3000) {
			return f.calcSalario()*0.275;
		}
		else if(f.calcSalario()>1500) {
			return f.calcSalario()*0.15;
		}
		else {
			return 0;
		}
	}
	
	public double calcINSS(Funcionario f) {
		return f.calcSalario()*0.11;
	}
	
	public void relatorioFolha (ArrayList <? extends Funcionario> funcionarios) {
		for(Funcionario f: funcionarios) {
			f.mostrarDados();
			System.out.println("Salario Bruto: " + f.calcSalario());
			IRRF = calcIRRF(f);
			INSS = calcINSS(f);
			System.out.println("A ser pago IRRF: " + IRRF + ", INSS: " +INSS);
			System.out.println("Salário Líquido: R$ " + ((f.calcSalario() - IRRF) - INSS));
			System.out.println("------------------------------------");	
			
		}
	}
	
}

