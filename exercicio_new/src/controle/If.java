package controle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class If {
	
	public static void main(String[] args) {
		
		/*String valor1 = JOptionPane.showInputDialog("Digite a 1� nota:");	
		String valor2 = JOptionPane.showInputDialog("Digite a 2� nota:");	
		String valor3 = JOptionPane.showInputDialog("Digite a 3� nota:");	
	
		double nota1 = Double.parseDouble(valor1);
		double nota2 = Double.parseDouble(valor2);
		double nota3 = Double.parseDouble(valor3);
		
		double media = (int)((nota1 + nota2 + nota3) / 3);
		
		
		if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Voc� est� Aprovado!" );			
		} else if(media >= 5.0 && media <=6.9){
			JOptionPane.showMessageDialog(null, "Voc� est� em Recupera��o!");			
		} else {
			JOptionPane.showMessageDialog(null, "Voc� est� Reprovado!");
		}*/

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		entrada.close();
	}

}
