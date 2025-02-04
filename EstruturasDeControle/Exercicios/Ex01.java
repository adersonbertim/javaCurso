package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero entre 1 e 10");
		int valor = entrada.nextInt();
		
		if(valor >= 1 && valor <= 10) {
			if(valor % 2 == 0) {
			System.out.println("O valor é par");
		}else {
			System.out.println("É impar");
			}
		}
		entrada.close();
	}
}
