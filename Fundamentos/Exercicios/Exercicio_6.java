package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		// Criar soluções para equações do 2º grau
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o A da formula de Bhaskara: ");
		double a = entrada.nextDouble();
		System.out.println("Digite o B: ");
		double b = entrada.nextDouble();
		System.out.println("Digite o C: ");
		double c = entrada.nextDouble();
		
		double superior_A = Math.pow(b, 2) - 4*a*c;
		double inferior = 2*a;
		
		double resultA = Math.sqrt(superior_A);
		double resultPos = (-b + resultA) / inferior;
		double resultNeg = (-b - resultA) / inferior;
		System.out.println(resultPos);
		System.out.println(resultNeg);
		
		entrada.close();
				
	}
}
