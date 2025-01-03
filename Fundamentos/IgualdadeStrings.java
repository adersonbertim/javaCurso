package Fundamentos;

public class IgualdadeStrings {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String a = new String("2");
		System.out.println("2" == a);
		
		//Comparação de strings usar o EQUALS da notação ponto!
		System.out.println("2".equals(a));
	}
}
