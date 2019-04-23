package curso;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro:");
		int x = sc.nextInt();

		for (int y = 1; y <= x; y++) {
			if (y % 2 != 0) {
				System.out.println(y);
			}

		}
		sc.close();
	}

}
