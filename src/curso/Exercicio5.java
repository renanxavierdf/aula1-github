package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorPeca1 = sc.nextDouble();
		sc.nextLine();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double numPeca1 = 0;
		double pagarPeca = ((double) (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2));

		System.out.printf("VALOR A PAGAR: %.2f", pagarPeca);

		sc.close();
	}

}
