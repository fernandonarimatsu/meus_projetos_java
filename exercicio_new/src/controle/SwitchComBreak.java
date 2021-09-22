package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito = JOptionPane.showInputDialog("Informe a nota");
		
		int nota = Integer.parseInt(conceito);
		
		switch (nota) {
		case 10: case 9:
			conceito = "Conceito: A";			
			break;
		case 8: case 7:
			conceito = "Conceito: B";			
			break;
		case 6: case 5:
			conceito = "Conceito: C";			
			break;
		case 4: case 3:
			conceito = "Conceito: D";			
			break;
		case 2: case 1: case 0:
			conceito = "Conceito: E";			
			break;
		default:
			conceito = "Valor inválido!";
		}
		
		JOptionPane.showMessageDialog(null, conceito);
				
	}
}
