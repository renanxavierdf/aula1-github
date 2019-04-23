package curso;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1 || n == 0) {
			System.out.println("1");
		} else {
			int fat=1;
			for (int i = 1; i <= n; i++) {
				
				fat = fat * i;
				
			}
			System.out.println(fat);
			sc.close();
		}
	}
}