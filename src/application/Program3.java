package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Program3 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("ALUNO");
		System.out.print("Digite o nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.print("Digite a nota do primeiro trimestre: ");
		aluno.a = sc.nextDouble();
		System.out.print("Digite a nota do segundo trimestre: ");
		aluno.b = sc.nextDouble();
		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno.c = sc.nextDouble();

		System.out.printf("Nota final: %.2f ", aluno.notaFinal());
		System.out.println();

		if(aluno.notaFinal()< 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS" ,aluno.missing());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
