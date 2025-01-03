package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		// Exercicio 1
		// Converter Fahrenheit para Celsius
		// (32 °F − 32) × 5/9 = 0 °C
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Fahrenheit:");
		double fah = entrada.nextDouble();
		
		double converter = (fah - 32) * 5/9;
		
		System.out.printf("A temperatura é %.2f ºC ", converter);
		
		
		entrada.close();
	}
}
