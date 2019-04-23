package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Retangulo retangulo = new Retangulo();
	
	
	System.out.println("RETANGULO:");
	System.out.print("Digite o valor da base:");
	retangulo.a = sc.nextDouble();
	System.out.print("Digite o valor da altura:");
	retangulo.b = sc.nextDouble();
	
	System.out.printf("%.2f %n", retangulo.area());
	System.out.printf("%.2f %n",retangulo.perimetro());
	System.out.printf("%.2f %n", retangulo.diagonal());
	
	
	sc.close();
	}

}
