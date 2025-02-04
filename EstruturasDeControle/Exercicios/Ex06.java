package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 17;
		
		int tentativa = 0;
		
		for(tentativa = 0; tentativa < 10; tentativa++) {
			System.out.println("digite um numero:");
			int num = entrada.nextInt();
			if(num > valor) {
				System.out.println("Digite um numero menor");
			}else if(num < valor) {
				System.out.println("Digite um numero maior");
			}else if(num == valor) {
				System.out.println("Parabens voce acertou");
				break;
			}
		}
		System.out.println("Obrigado por jogar");
		entrada.close();
	}
}
