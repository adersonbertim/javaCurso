package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		// Apresentar os resultados de um input ao ²e³
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor e o resultado sera ao dobro e ao cubo!");
		int valor = entrada.nextInt();
		
		int dobro = (int) Math.pow(valor, 2);
		int cubo = (int) Math.pow(valor, 3);
		
		System.out.printf("Ao dobro fica %d. \nAo cubo fica %d.", dobro, cubo);
		 
		entrada.close();
	
	}
}
