package curso;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A:");
		int num1 = sc.nextInt();
		System.out.println("Digite o valor de B:");
		int num2 = sc.nextInt();

		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o s�o multiplus");
		}

		sc.close();
	}

}
