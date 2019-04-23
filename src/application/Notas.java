package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.CalculoNotas;

public class Notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		double nota, media=0;

		System.out.print("Informe a quantidade de notas: ");
		int n = sc.nextInt();
		CalculoNotas[] vect = new CalculoNotas[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.printf("Nota #%d: ", i + 1);
			System.out.print("Digite: ");
			nota = sc.nextDouble();
			media += nota;
		
				}
		
		media = media/n;
		System.out.println();
		System.out.printf("A média é: %.2f", media );
		
		sc.close();

	}

}
