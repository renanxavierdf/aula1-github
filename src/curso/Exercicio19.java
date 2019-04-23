package curso;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE A QUANTIDADE DE VALORES INTEIROS: ");
		int i = sc.nextInt();
		int cont = 0;
		int contOut = 0;

		for (int n = 1; n <= i; n++) {
			System.out.print("Digite o valor de # " + n + ": ");
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				cont++;

			} else {
				contOut++;

			}

		}

		System.out.println("----------------------");
		System.out.printf("In %d %n", cont);
		System.out.printf("Out %d ", contOut);

		sc.close();
	}
}
