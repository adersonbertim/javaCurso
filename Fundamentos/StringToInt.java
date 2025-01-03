package Fundamentos;

import javax.swing.JOptionPane;

public class StringToInt {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(
				"Digite um numero:");
		String num2 = JOptionPane.showInputDialog(
				"Digite um numero:");
		
		System.out.println(num1 + num2);
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		
		double soma = numero1 + numero2;
		System.out.println(soma);
		System.out.println(soma / 2);
		
	}
}
