package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(qtdNotas < 2) {
			System.out.println("Digite a nota:");
			nota = entrada.nextDouble();
			total += nota;
			qtdNotas++;
		}
		
		double media = total / 2;
		if(media >= 7.0) {
			System.out.printf("Aprovado pois a media foi: %.2f",media);
		}if(media < 7.0 || media > 4.0) {
			System.out.printf("Recuperação pois a media é: %.2f", media);
		}else {
			System.out.printf("Reprovado pois a media é: %.2f", media);
		}
		
		entrada.close();
	}
}
