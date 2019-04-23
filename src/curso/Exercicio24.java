package curso;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int quad = i * i;
			int cubo = i * i * i;
			System.out.println(" " + i + " " + quad + " " + cubo);
		}

		sc.close();

	}

}
