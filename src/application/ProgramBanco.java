package application;

import java.text.Format;
import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class ProgramBanco {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Banco banco;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit? (y/n): ");
		char escolha = sc.next().charAt(0);
		if (escolha == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			
			banco = new Banco(number, holder, balance);
		}
		else {
			banco = new Banco(number, holder);
		}
		
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(banco);
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			banco.deposit(depositValue);
			System.out.println("Updated account data: ");
			System.out.println(banco);
			
			System.out.println();
			System.out.println("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();
			banco.whithdraw(withdrawValue);
			System.out.println("Updated Account data ");
			System.out.println(banco);
			
			sc.close();
		}

}
		
		
		

		
	
