package desafiocontrole;

import javax.swing.JOptionPane;

public class Number1 {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Verifique o valor");
		
		int num = Integer.parseInt(valor);
		
		if(num >= 0 && num <= 10){
			JOptionPane.showMessageDialog(null, num);			
		} else {
			JOptionPane.showMessageDialog(null, "N�mero Inv�lido!");
		}
		
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � par");
		} else {
			JOptionPane.showMessageDialog(null, "O valor � �mpar");
		}
	
		
		
	}

}
