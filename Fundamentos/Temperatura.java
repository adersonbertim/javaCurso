package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final int fah = 32;
		final double div = 5.0/9.0;
		// variaveis
		int f = 100;
		double result = (f - fah) * div;
		System.out.println(result);
	}
}
