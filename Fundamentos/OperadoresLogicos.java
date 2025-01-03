package Fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 2 > 4;
		
		System.out.println(condicao1);
		System.out.println(condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
	}
}
