package curso;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor X:");
		int valor1 = sc.nextInt();
		System.out.println("Digite o valor Y:");
		int valor2 = sc.nextInt();
		sc.nextLine();
		int result = valor1 + valor2;
	
		System.out.printf("Soma:%d", result);
		
		sc.close();
	}

}
