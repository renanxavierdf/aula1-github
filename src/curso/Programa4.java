package curso;

import java.util.Locale;
import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter your full name:");
		String name = sc.nextLine();
		System.out.printf("How many bedrooms are there in your house?");
		int quartos = sc.nextInt();
		System.out.printf("Enter product price:");
		float valor = sc.nextFloat();

		System.out.printf("Enter your lastname, age and height?");
		String lastname = sc.next();
		int idade = sc.nextInt();
		float altura = sc.nextFloat();

		System.out.println(name);
		System.out.println(quartos);
		System.out.printf("%.2f", valor);
		System.out.println();
		System.out.println(lastname);
		System.out.println(idade);
		System.out.println(altura);

		sc.close();

	}

}
