package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o numero do funcionario:");
		int numFunc = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horasTrab = sc.nextInt();
		System.out.println("Digite o valor das horas trabalhadas:");
		double valorTrab = sc.nextDouble();
		double salario=valorTrab*horasTrab;
		
		System.out.printf("Numero do Funcionario: %s%n", numFunc);
		System.out.printf("Salário: U$%.2f", salario);
		
			
		
		sc.close();
	}

}
