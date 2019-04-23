package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		float triangulo = A*C/2;
		double pi = 3.14159;
		float circulo = (float)pi*(C*C);
		float trapezio = ((A+B)/2)*C;
		float quadrado = B*B;
		float retangulo = A*B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("TRIANGULO: %.3f%n", circulo);
		System.out.printf("TRIANGULO: %.3f%n", trapezio);
		System.out.printf("TRIANGULO: %.3f%n", quadrado);
		System.out.printf("TRIANGULO: %.3f", retangulo);
		
		sc.close();
	}

}
