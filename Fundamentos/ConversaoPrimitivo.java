package Fundamentos;

public class ConversaoPrimitivo {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float f = 1.30F;
		float fl = (float) 1.31;
		float flo = (int) 1.32;
		
		System.out.println(f);
		System.out.println(fl);
		System.out.println(flo);
		
		int b = 340;
		byte c = (byte) b; // Isso é um CAST
		
		System.out.println(c);
	}
}
