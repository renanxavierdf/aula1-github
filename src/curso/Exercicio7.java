package curso;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}

		sc.close();
	}

}
