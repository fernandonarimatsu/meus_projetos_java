package controle;

import javax.swing.JOptionPane;

public class DesafioSemana {
	
	public static void main(String[] args) {
		
		//Dom -> 1 , Seg -> 2, Ter -> 3
		
		String dia = JOptionPane.showInputDialog("Digite o dia da semana:");
		
//		Sempre usar equals para comprar Strings.
		
		if (dia.equalsIgnoreCase("domingo")) {	
			JOptionPane.showMessageDialog(null, "1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			JOptionPane.showMessageDialog(null, "2");
		}else if (dia.equalsIgnoreCase("terça")) {
			JOptionPane.showMessageDialog(null, "3");
		}else if (dia.equalsIgnoreCase("quarta")) {
			JOptionPane.showMessageDialog(null, "4");
		}else if (dia.equalsIgnoreCase("quinta")) {
			JOptionPane.showMessageDialog(null, "5");
		}else if (dia.equalsIgnoreCase("sexta")) {
			JOptionPane.showMessageDialog(null, "6");
		}else if (dia.equalsIgnoreCase("sábado")) {
			JOptionPane.showMessageDialog(null, "7");
		}else {
			JOptionPane.showMessageDialog(null, "Dia Inválido!");
		}
		
    }		
}