package controle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class If {
	
	public static void main(String[] args) {
		
		/*String valor1 = JOptionPane.showInputDialog("Digite a 1ª nota:");	
		String valor2 = JOptionPane.showInputDialog("Digite a 2ª nota:");	
		String valor3 = JOptionPane.showInputDialog("Digite a 3ª nota:");	
	
		double nota1 = Double.parseDouble(valor1);
		double nota2 = Double.parseDouble(valor2);
		double nota3 = Double.parseDouble(valor3);
		
		double media = (int)((nota1 + nota2 + nota3) / 3);
		
		
		if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Você está Aprovado!" );			
		} else if(media >= 5.0 && media <=6.9){
			JOptionPane.showMessageDialog(null, "Você está em Recuperação!");			
		} else {
			JOptionPane.showMessageDialog(null, "Você está Reprovado!");
		}*/

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		entrada.close();
	}

}
