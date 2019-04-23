package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double p = 3.14159;
		System.out.println("Digite o valor do raio:");
		double raio = sc.nextDouble();
		sc.nextLine();
		double result = p*(raio*raio);
		System.out.printf("Valor da Área é: %.4f", result);
		
		sc.close();

	}

}
