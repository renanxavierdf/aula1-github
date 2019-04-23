package curso;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		System.out.print("Digite o codigo do TIPO do combustivel: ");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
				System.out.print("Digite o codigo do TIPO do combustivel: ");
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
				System.out.print("Digite o codigo do TIPO do combustivel: ");
			} else if (tipo == 3) {
				diesel = diesel + 1;
				System.out.print("Digite o codigo do TIPO do combustivel: ");
			}
			tipo = sc.nextInt();

		}
		System.out.println("----------------------------");
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}
