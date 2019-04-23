package curso;

import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro");
		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("Negativo");
		}

		sc.close();
	}

}
