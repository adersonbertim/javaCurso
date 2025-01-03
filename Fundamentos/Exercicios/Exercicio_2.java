package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		// (0 °C × 9/5) + 32
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius: ");
		double cel = entrada.nextDouble();
		
		double result = (cel * 9/5) + 32;
		
		System.out.printf("O resultado é %.2f Fahnheneit", result);
		
		entrada.close();
	}
}
