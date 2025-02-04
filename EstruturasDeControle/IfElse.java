package EstruturasDeControle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero:");
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É par");
		}else {
			System.out.println("É impar");
		}
		
		entrada.close();
	}
}
