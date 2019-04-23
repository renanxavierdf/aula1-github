package curso;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hora inicial do jogo:");
		int horaIni = sc.nextInt();
		System.out.println("Hora final do jogo:");
		int horaFim = sc.nextInt();

		int duracao=0;

		if ((horaIni < 0 || horaIni >= 24) || (horaFim < 0 || horaFim >= 24)) {
			System.out.println("Horario do jogo invalido");
		}

		else if (horaIni < horaFim) {
			duracao = (horaFim - horaIni);
		}

		else {
			duracao = (24 - horaIni) + horaFim;
		}

		System.out.printf("O jogo durou %d hora(s)", duracao);

		sc.close();

	}
}
