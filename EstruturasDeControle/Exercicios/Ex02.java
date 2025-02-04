package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("É bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
		
		entrada.close();
		
	}
}
