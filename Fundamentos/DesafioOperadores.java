package Fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		int p1 = 6 * (3+2);
		int p2 = (int) Math.pow(p1, 2);
		int p3 = 3 * 2;
		int r1 = p2 / p3;
		
		int v1 = (1-5) * (2-7) / 2;
		int v2 = (int) Math.pow(v1, 2);
		
		int r = r1 - v2;
		int res = (int) Math.pow(r, 3);
		
		int div = (int) Math.pow(10, 3);
		
		int resultado = res / div;
		
		System.out.println(resultado);
		
	}
}
