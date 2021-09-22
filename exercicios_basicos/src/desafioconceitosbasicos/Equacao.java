package desafioconceitosbasicos;

import javax.swing.JOptionPane;

public class Equacao {
	
	public static void main(String[] args) {
		
//		Utilizar formila de Baskara
		
		String valor1 = JOptionPane.showInputDialog("Digite o valor de 'A':");
		String valor2 = JOptionPane.showInputDialog("Digite o valor de 'B':");
		String valor3 = JOptionPane.showInputDialog("Digite o valor de 'C':");
				
		int a = Integer.parseInt(valor1);
		int b = Integer.parseInt(valor2);
		int c = Integer.parseInt(valor3);
		
		var delta = (b * b) - 4 * a * c;
		var x1 = (int)(-b + Math.sqrt(delta)) / 2 * a;
		var x2 = (int)(-b - Math.sqrt(delta)) / 2 * a;
		
		JOptionPane.showMessageDialog(null, "O valor de delta é " + delta + "\n O valor de X¹ é " + x1 + "\nO valor de x² é " + x2 );
		
		/*System.out.println("O valor do delta é " + delta);
		System.out.println("O valor de X¹ é " + x1);
		System.out.println("O valor de X² é " + x2);*/
		
	}

}
