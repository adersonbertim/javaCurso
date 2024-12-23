package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String x = "Bem-vindo ao Eclipse!";
		
		x = x.concat("!!!!");
		x = x.toUpperCase();
		
		System.out.println(x);
		
		String y = "Bom dia Usuario";
		System.out.println(y);
		
		y = y.replace("Usuario", "Aderson");
		System.out.println(y);
	}
}
