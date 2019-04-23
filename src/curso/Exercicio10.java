package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String especif1 = "Cachorro quente";
		String especif2 = "X-Salada";
		String especif3 = "X-Bacon";
		String especif4 = "Torrada simples";
		String especif5 = "Refrigerante";

		int code;
		System.out.println("Digite o codigo:");
		code = sc.nextInt();
		int quantidade;
		System.out.println("Digite a quantidade:");
		quantidade = sc.nextInt();

		double valor;

		if (code == 1) {
			double preco1 = 4.00;
			valor = (preco1 * quantidade);
			System.out.printf("total: %n %s R$ %.2f", especif1, valor);
		} else if (code == 2) {
			double preco2 = 4.50;
			valor = preco2 * quantidade;
			System.out.printf("total: %n %s R$ %.2f", especif2, valor);
		}

		else if (code == 3) {
			double preco3 = 5.00;
			valor = preco3 * quantidade;
			System.out.printf("total: %n %s R$ %.2f", especif3, valor);
		} else if (code == 4) {
			double preco4 = 2.00;
			valor = preco4 * quantidade;
			System.out.printf("total: %n %s R$ %.2f", especif4, valor);
		}

		else if (code == 5) {
			double preco5 = 1.50;
			valor = preco5 * quantidade;
			System.out.printf("total: %n %s R$ %.2f", especif5, valor);
		} else {
		}

		sc.close();

	}

}
