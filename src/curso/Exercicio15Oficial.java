package curso;

import java.util.Scanner;

public class Exercicio15Oficial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrado");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrado");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrado");
			} else {
				System.out.println("Quarto quadrado");
			}
			
			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = sc.nextInt();
		}

		sc.close();

	}

}
