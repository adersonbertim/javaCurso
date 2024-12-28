package Fundamentos;

public class TiposString {
	public static void main(String[] args) {
		String x = "Olá, bom dia";
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.concat("!!!!"));
		System.out.println(x.charAt(9));
		System.out.println(x.toLowerCase().startsWith("boa"));
		System.out.println(x.startsWith("Olá"));

		var nome = "João Pedro";
		var idade = 38;
		var nacionalidade = "Brasileiro";
		var salario = 11_200.98F;
		
		
		
		System.out.printf("Nome: %s \nIdade: %d \nNacionalidade: %s \nSalario: %.2f\n",nome, idade, nacionalidade, salario);
		
		System.out.println("Uma string".indexOf("a"));
		System.out.println("Uma string".isEmpty());
		System.out.println("Uma string".repeat(2));
		System.out.println("Uma string".strip());
		System.out.println("Uma string".substring(2, 7));
		System.out.println("Uma string".getBytes());
		System.out.println("Uma string".replace("a", "b"));
		
		
	}
}
