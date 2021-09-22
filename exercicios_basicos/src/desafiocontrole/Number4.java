package desafiocontrole;

import javax.swing.JOptionPane;

public class Number4 {
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

		if (contadorDeDivisores == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
		}

	}

}