package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		// Ler peso, altura printar o IMC
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o seu peso:");
		double peso = entrada.nextDouble();
		System.out.println("Qual sua altura");
		double altura = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura,2));
		
		System.out.printf("O imc é: %.2f", imc);
		
		entrada.close();
	}
}
