package curso;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha:");
			int senhaDigit = sc.nextInt();
			int n = 2002;
		
		while (senhaDigit != n) {
			System.out.println("Senha invalida");
			System.out.print("Digite sua senha:");
			senhaDigit = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
