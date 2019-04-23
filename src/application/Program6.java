package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoVetor;

public class Program6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		ProdutoVetor[] vect = new ProdutoVetor[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
		
			String name = sc.nextLine();
			System.out.print("Digite o valor do produto: ");
			double price = sc.nextDouble();
			vect[i] = new ProdutoVetor(name,price);
						
		}
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum /n;
		System.out.printf("A média é: %.2f ", avg);
		
		sc.close();

	}

}
