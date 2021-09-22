package desafioconceitosbasicos;

import javax.swing.JOptionPane;

public class ConversaoCelsius {
	
	public static void main(String[] args) {
//		(°F - 32) * 5/9 = °C
//		°F = (°C × 1, 8) + 32
		String valor1 = JOptionPane.showInputDialog("Digite a temperatura em °C :");
			
		final double FATOR = 1.8;
		final double AJUSTE = 32;
		
		double celsius = Double.parseDouble(valor1);
		var conversao = celsius * FATOR + AJUSTE;
		
		System.out.println(conversao + "°F");
	
			
	}

}
