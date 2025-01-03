package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		// (B * H ) / 2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o valor da base:");
		double base = entrada.nextDouble();
		System.out.println("Qual o valor da altura:");
		double altura = entrada.nextDouble();
		
		double result = (base * altura) / 2;
		
		System.out.printf("O resultado da area do triangulo é %.2f m²", result);
		
		entrada.close();
	}
}
