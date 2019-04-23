package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program5 {

	public static void main(String[] args) {
		
		CurrencyConverter conversor = new CurrencyConverter();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		conversor.valDolar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		conversor.quantDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f ", conversor.calc());
		
		
		sc.close();
		
		

	}

}
