package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com os numeros do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os numeros do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		System.out.printf("%.4f %n", x.area());

		double areaY = y.area();

		System.out.printf("%.4f %n", y.area());

		if (x.area() > y.area()) {
			System.out.printf("O Triangulo maior é X: %.4f", areaX);
		} else {
			System.out.printf("O Triangulo maior é Y: %.4f", areaY);
		}

		sc.close();
	}

}
