package curso;

import java.util.Locale;
import java.util.Scanner;
// PROGRAMA SEM CODIGO DE ORIENTAÇÃO A OBJETO
public class Programa14 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;

		System.out.println("Entre com os numeros do triangulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entre com os numeros do triangulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		System.out.printf("%.4f %n", areaX);

		double r = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(r * (r - yA) * (r - yB) * (r - yC));

		System.out.printf("%.4f %n", areaY);

		if (p > r) {
			System.out.printf("O Triangulo maior é X: %.4f", areaX);
		} else {
			System.out.printf("O Triangulo maior é Y: %.4f", areaY);
		}

		sc.close();
	}

}
