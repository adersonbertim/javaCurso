package Fundamentos;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		int c = a + b;
		
		System.out.println(c);
		c += b;
		System.out.println(c);
		c *= b;
		System.out.println(c);
		c -= b;
		System.out.println(c);
		c /= b;
		System.out.println(c);
		c %= 2;
		System.out.println(c);
		
	}
}