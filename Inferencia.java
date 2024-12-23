package Fundamentos;

public class Inferencia {
 public static void main(String[] args) {
	 int a = 3;
	 System.out.println(a);
	 
	 var b = 4;
	 System.out.println(b);
	 
	 var c = "Texto";
	 System.out.println(c);
	 
	 // Inferencia seria usar o "var" assim o Java reconhece a variavel sem precisar declarar o tipo de  variavel;
	 // Não pode declarar duas variaveis com inferencia de mesmo nome para tipos diferentes;
	 double d; // Variavel declarada
	 d = 12.34; // Variavel inicializada
	 System.out.println(d); // usada 
	 
	 var f = 12.45; // Em inferencia ela deve ser declara e inicializada no mesmo momento
	 System.out.println(f);
 }
}
