package desafiocontrole;

import javax.swing.JOptionPane;

public class Number3 {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite a primeira nota");
		String valor2 = JOptionPane.showInputDialog("Digite a segunda nota");
		
		double nota1 = Double.parseDouble(valor1);
		double nota2 = Double.parseDouble(valor2);
		
		double soma = nota1 + nota2;
		double media = (soma / 2);
		
		if (media >= 7.0 && media <=10.0) {
			JOptionPane.showMessageDialog(null, "A sua média é " + media + "\nVocê está APROVADO!");
		} else if (media >= 4.0 && media <= 6.9) {
			JOptionPane.showMessageDialog(null, "A sua média é " + media + "\nVocê está em RECUPERAÇÃO!");
		} else {
			JOptionPane.showMessageDialog(null, "A sua média é " + media + "\nVocê está REPROVADO!");
		}
		
		JOptionPane.showMessageDialog(null, "Fim.");
		
		
	}

}
 