package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// Precisa de 3 variaveis
		// Uma para acumular
		// Outra para as notas
		// Total que vai ser usada para a media
		int qtdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 1 && nota <= 10) {
				total += nota;
				qtdNotas++;
			}
		}
		double media = total / qtdNotas;
		
		System.out.println("Media: "+ media);
		
		entrada.close();
	}
}
