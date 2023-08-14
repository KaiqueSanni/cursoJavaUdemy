package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double total;
		int codigo;
		int quantidade;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4;
			System.out.printf("Total: %.2f", total);
		} else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total: %.2f", total);
		} else if (codigo == 3) {
			total = quantidade * 5;
			System.out.printf("Total: %.2f", total);
		} else if (codigo == 4) {
			total = quantidade * 2;
			System.out.printf("Total: %.2f", total);
		} else {

			total = quantidade * 1.50;
			System.out.printf("Total: %.2f", total);
		}
		sc.close();
	}
}
