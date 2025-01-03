package Fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		++b;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		// Precedencia prefix > prefix
		
		System.out.println(++a == b--);
		System.out.println(a == b);
		
	}
}
