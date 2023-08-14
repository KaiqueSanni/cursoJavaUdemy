package curso_progamação;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
	
	/*public static void main(String[] args) {
		
		Scanner sc  = new  Scanner(System.in);
		int x, y  ;
		
		x = sc.nextInt();
		y= sc.nextInt();
		System.out.println("A soma de x e y é : " + (x +y) );
		sc.close();
		*/
	
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
    
    R = sc.nextDouble();

    A = pi * R * R;

    System.out.printf("A=%.4f%n", A);

	sc.close();
		
	}	*/
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Diferenca = A*B - C*D;
		System.out.println("Diferenca: " +  Diferenca);
		
		sc.next();
		
	}*/
	/*public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}*/
	
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, pec1, pec2;
		double val1, val2, total;
		
		cod1 = sc.nextInt();
		pec1 = sc.nextInt();
		val1 = sc.nextDouble();
		cod2= sc.nextInt();
		pec2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total = pec1 * val1 + pec2 *val2;
		System.out.println("Codigo:" + cod1 +cod2);
		System.out.printf("Valor a Pagar: %.2f", total );
		
		sc.close();
	}*/
	
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = (A * C) / 2;
		CIRCULO = 3.14159 * Math.pow(C , 2) ;
		TRAPEZIO = (A+ B) * C / 2;
		QUADRADO = Math.pow(B , 2); 
		RETANGULO = A * B;
		
		 System.out.printf("TRIANGULO %.3f%n", TRIANGULO);
		 System.out.printf("CIRCULO %.3f%n", CIRCULO);
		 System.out.printf("TRAPEZIO %.3f%n", TRAPEZIO);
		 System.out.printf("QUADRADO %.3f%n", QUADRADO);
		 System.out.printf("RETANGULO %.3f%n ", RETANGULO);
		
		
		sc.close();
	}*/
}
