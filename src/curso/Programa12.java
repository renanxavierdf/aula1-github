package curso;

import java.util.Locale;
import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Entre com outro numero: ");
			n = sc.nextDouble();
		}
		System.out.println("Numero negativo");
		sc.close();

	}

}
