package Fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		// Trabalho terça e quinta
		// Caso os dois deem certo comprar tv 50 polegadas
		// So um deu certo 32 polegadas
		// Se um deu certo tomar sorvete
		// Se nenhum deu certo ninguem sai pra comer sorvete
		
		// Cenario um onde tudo deu certo
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		System.out.println("Cenario 1 onde os dois trabalhos deram certo e familia foi passear e comprar a tv 50 Polegadas");
		System.out.println(trabalho1 && trabalho2);
		System.out.println("Cenario 2 onde um trabalho deu certo e foram comprar a tv 32 polegadas e tomar sorvete:");
		System.out.println(!trabalho1 && trabalho2);
		System.out.println("Cenario 3 onde tudo deu errado e ficaram apenas em casa:");
		System.out.println(!trabalho1 || !trabalho2);
		
	}
}
