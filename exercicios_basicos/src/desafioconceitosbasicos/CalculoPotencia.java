package desafioconceitosbasicos;

import javax.swing.JOptionPane;

public class CalculoPotencia {
	
	public static void main(String[] args) {
		
		
	/*String valor1 = JOptionPane.showInputDialog("Digite o valor");
	
	double fator1 = Double.parseDouble(valor1);
	double fator2 = Double.parseDouble(valor1);
	
	var quad = fator1 * fator1;
	var cubo = fator2 * fator2 * fator2;
	
	System.out.println("O valor elevado a ² é :" + quad + "².");
	System.out.println("O valor elevado a ³ é :" + cubo + "³.");*/
		
    
		String valor1 = JOptionPane.showInputDialog("Digite o valor");
		
		int fator1 = Integer.parseInt(valor1);
		int fator2 = Integer.parseInt(valor1);
		
		var quad = fator1 * fator1;
		var cubo = fator2 * fator2 * fator2;
		
		System.out.println("O valor de " + fator1 + " elevado a ² é: " + quad);
		System.out.println("\nO valor de " + fator2 + " elevado a ³ é: " + cubo);
		
		
				
				
	}
	

}
