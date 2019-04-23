package curso;

import java.util.Locale;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(); // 35
		sc.nextLine();
		String name = sc.nextLine(); // Bob Brown
		char gender = sc.next().charAt(0); // F
		// digitar B5
		String s = sc.next();
		char letter = s.charAt(0);// posicao 0
		char letra = s.charAt(2);
		int digit = Integer.parseInt(s.substring(1));// posição 1

		double n2 = sc.nextDouble();
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(letra);
		System.out.println(digit);
		System.out.println(n2);

		sc.close();

	}

}
