package desafiocontrole;

import javax.swing.JOptionPane;

public class Number2 {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o ano");
		
		double ano = Double.parseDouble(valor);
		
	  	if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) )	{ 
			JOptionPane.showMessageDialog(null, "O ano é bissexto");
		} else{ 
			JOptionPane.showMessageDialog(null, "O ano não é bissexto");
				
		} 
			
	}
}

