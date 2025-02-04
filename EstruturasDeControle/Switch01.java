package EstruturasDeControle;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 3");
		int valor = entrada.nextInt();
		switch(valor) {
		case 1:
			System.out.println("Primeiro");
			break;
		case 2:
			System.out.println("Segundo");
			break;
		case 3:
			System.out.println("Terceiro");
			break;
		}
		
		entrada.close();
	}
}
