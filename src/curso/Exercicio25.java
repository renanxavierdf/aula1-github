package curso;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		System.out.print("Digite o valor de N:");
		int n = sc.nextInt();

		while (n <= 0) {

			System.out.print("N não é positivo. Digite novamente:");
			n = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {

			System.out.print("Value #" + i + ":");
			int value = sc.nextInt();
			if (value > maior) {
				maior = value;
			}
		}
		sc.close();
		System.out.println(maior);

		
	}

}
