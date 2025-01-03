package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner salarios = new Scanner (System.in);
		System.out.println("Digite o primeiro salario: ");
		String sal1 = salarios.nextLine();
		
		// Poderia ter usado:
		// String sal1 = salarios.nextLine().replace(",",".");
		
		System.out.println("\nDigite o segundo salario: ");
		String sal2 = salarios.nextLine();
		
		System.out.println("\nDigite o terceiro salario: ");
		String sal3 = salarios.nextLine();
		
		double num1 = Double.parseDouble(sal1.replace(",", "."));
		double num2 = Double.parseDouble(sal2.replace(",", "."));
		double num3 = Double.parseDouble(sal3.replace(",", "."));
		
		
		double media = (num1 + num2 + num3) / 3;
		System.out.println("A media salarial é: " + media);
		
		
		
		salarios.close();
	}
}
