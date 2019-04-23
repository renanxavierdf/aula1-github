package application;

import java.util.Scanner;

import entidades.ProdutoVetor1;

public class RevisaoVetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de reserva: ");
		int n = sc.nextInt();

		ProdutoVetor1[] vect = new ProdutoVetor1[10];

		for (int i = 0; i < n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.printf("Cadastro #%d: ", i + 1);
			System.out.println();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o email: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto: ");
			int quarto = sc.nextInt();

			vect[quarto] = new ProdutoVetor1(name, email);

		}

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {

				System.out.println();
				System.out.println("Quartos ocupados: ");
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}
}
