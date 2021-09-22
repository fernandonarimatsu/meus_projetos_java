package desafiocontrole;

import javax.swing.JOptionPane;

public class Number5 {
	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite o valor.");
		int numero = Integer.parseInt(valor);
		int contadorDeDivisores = 0;


		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores ) {
		case 0: 		
			JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
			break;
			
		default: 
			JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
			
		}

	}

}