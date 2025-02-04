package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero!");
		int num = entrada.nextInt();
		boolean primo = true;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				primo = false;
			break;
			}
		}
		if(primo) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
		
		entrada.close();
		}
}
