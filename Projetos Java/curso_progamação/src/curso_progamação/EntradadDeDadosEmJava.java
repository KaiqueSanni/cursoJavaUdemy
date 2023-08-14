package curso_progamação;

import java.util.Scanner;

public class EntradadDeDadosEmJava {
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
	System.out.println("Voce Digitou: " +  x); 
		sc.close();
	}
}
