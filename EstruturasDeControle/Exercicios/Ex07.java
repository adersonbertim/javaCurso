package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		
		while(num >= 0) {
			System.out.println("Digite um numero");
			num = entrada.nextInt();
			if(num >= 0) {
				soma += num;
				System.out.printf("Somando até agora %d\n", soma);
			}
		}
		
		entrada.close();
	}
}
