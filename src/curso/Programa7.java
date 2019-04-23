package curso;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três numero inteiros:");
		int numInteiro1 = sc.nextInt();
		int numInteiro2 = sc.nextInt();
		int numInteiro3 = sc.nextInt();

		if (numInteiro1 > numInteiro2 && numInteiro1 > numInteiro3) {

			System.out.printf("Numero maior: %s", numInteiro1);

		}

		else if (numInteiro2 > numInteiro1 && numInteiro2 > numInteiro3) {

			System.out.printf("Numero maior: %s ", numInteiro2);

		}

		else {

			System.out.printf("Numero maior: %s ", numInteiro3);

		}

		sc.close();
	}

}
