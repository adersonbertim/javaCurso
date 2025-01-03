package Fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Executar operação + - * / %
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo numero");
		double num2 = entrada.nextDouble();
		System.out.println("As operações permitidas: + - * / % ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("O resultado de %.2f %s %.2f é: %.2f", num1, op, num2, resultado );
		
		
		
		entrada.close();
		
	}
}
