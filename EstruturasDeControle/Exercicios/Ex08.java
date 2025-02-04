package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int maiorValor = 0;
		int contador = 0;
		
		while(contador != 10) {
			System.out.println("Digite um numero: ");
			int valor = entrada.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
		}
		System.out.println("Maior valor " + maiorValor);
		entrada.close();
	}
}
