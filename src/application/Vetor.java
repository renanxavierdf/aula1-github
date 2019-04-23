package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pensao;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Pensao[] vect = new Pensao[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

	

		for (int i = 1; i <= n; i++) {

			sc.nextLine();
			System.out.printf("Rent #%d ", i);
			System.out.println();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
							
			vect[room] = new Pensao(nome, email);

		}
		
		System.out.println();
		System.out.println("Bus rooms: ");
		
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
