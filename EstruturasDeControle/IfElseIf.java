package EstruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a nota:");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		}else if (nota == 10) {
			System.out.println("A");
		}else if (nota >= 8 || nota <= 9.9) {
			System.out.println("B");
		}else if (nota >= 7 || nota < 7.9) {
			System.out.println("C");
		}else if (nota >= 6 || nota <= 5) {
			System.out.println("D");
		}else if (nota >= 4 || nota <= 4.9) {
			System.out.println("E");
		}else if (nota <= 3.9) {
			System.out.println("F");
		}
		
		entrada.close();
	}
}
