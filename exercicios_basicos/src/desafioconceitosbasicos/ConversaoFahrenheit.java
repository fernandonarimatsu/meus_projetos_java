package desafioconceitosbasicos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConversaoFahrenheit {
	
	public static void main(String[] args) {
		
//		°C = (°F − 32) ÷ 1, 8
		
		Scanner entrada = new Scanner(System.in);
		String valor1 = JOptionPane.showInputDialog("Digite a temperatura em °F :");
		
		final double fator = 1.8;
		final double ajuste = 32;
		
		double fahrenheit = Double.parseDouble(valor1);
		var conversao = (fahrenheit - ajuste) / fator;
		
		System.out.println(conversao + "°C");
		
	    entrada.close();	
	}

}
