package curso;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números inteiros você vai digitar?");
		int n = sc.nextInt();
		int total = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite valor #" + i + ":");
			int x = sc.nextInt();

			total += x;
		}

		System.out.println("Total = " + total);

		sc.close();

	}

}
