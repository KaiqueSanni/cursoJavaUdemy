package estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi, hf, duracao;
		hi = sc.nextInt();
		hf = sc.nextInt();

		if (hi < hf) {
			duracao = hf - hi;
			System.out.printf("O jogo durou %d", duracao);
		} else if (hi > hf) {
			hf = hf + 24;
			duracao = hi - hf;
			duracao = duracao * -1;
			System.out.printf("O jogo durou %d", duracao);

		} else {
			System.out.println("O jogo durou 24 Horas");
		}
		sc.close();

	}
}
