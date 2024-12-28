package Fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		// Byte
		Byte b = 100;
		// Short
		Short s = 200;
		// Integer
		// Integer.parseInt(entrada.next();
		Integer i = 10000; // Isso é um wrapper nao uma variavel primitiva!
		// Long
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 2);
		System.out.println(l / 2);
		
		Float f = 11_200F;
		Double d = 11_300D;
		
		System.out.println(f.BYTES);
		System.out.println(d.toString());
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = 'H';
		System.out.println(c.BYTES);
		
	}
}
