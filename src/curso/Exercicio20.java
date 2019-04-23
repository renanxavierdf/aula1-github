package curso;

import java.util.Locale;
import java.util.Scanner;
//CONSULTANDO MATERIAL DO PROFESSOR
public class Exercicio20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de casos de teste:");
		int n = sc.nextInt();
		if (n>3) {
			System.out.println("Limite de teste ultrapassado!");
		}
		for(int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = ((a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
			
			System.out.printf("%.1f %n", media);
			
		}
	

		
		
		sc.close();
	}
}
