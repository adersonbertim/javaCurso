package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite Seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Qual sua idade? ");
		int idade = entrada.nextInt();
		System.out.printf("\n %s tem %d anos de idade", nome, idade);
		entrada.close();
	}
}
