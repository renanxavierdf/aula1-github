package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter com os dados do produto: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("Valor: ");
		double price = sc.nextDouble();
	
		
	
		Produto produto = new Produto(name, price);

		produto.setName("Computador");
	
		
		System.out.println("Updated name: " +produto.getName());
		
		produto.setPrice(1200.00);
		System.out.println("Update price: " +produto.getPrice());
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.print("Entre com o numero de produtos para adicionar no estoque:");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println("Dados atualizados do produto: " + produto);
		System.out.println();
		System.out.print("Entre com o numero de produtos para remover no estoque:");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto);
		sc.close();

	}

}
