package curso;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro:");
		int time = sc.nextInt();
		
		if(time <12) {
		System.out.println("Bom dia!");
		}
		else if(12<=time && time<18) {
		System.out.println("Boa tarde!");
		}
		else{
			System.out.println("boa noite!");
		}
		sc.close();
	}

}
