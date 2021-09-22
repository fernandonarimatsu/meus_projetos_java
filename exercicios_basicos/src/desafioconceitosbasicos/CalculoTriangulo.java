package desafioconceitosbasicos;

import javax.swing.JOptionPane;

public class CalculoTriangulo {
	
	public static void main(String[] args) {
		
//		a medida da base e multiplicamos pela sua altura, dividimos o resultado desse produto por 2.
		
		String b = JOptionPane.showInputDialog("Digite o valor da base do triângulo");
		String h = JOptionPane.showInputDialog("Digite o valor da altura do triângulo");
		
		int calculo1 = Integer.parseInt(b);
		int calculo2 = Integer.parseInt(h);
		
		
		var calbasequad = calculo1 / 2; // (b²)
		var calbase = calbasequad * calbasequad; // (b / 2)²
		var calalt = calculo2 * calculo2; // (h²)
		var cal1 = calalt - calbase;
		int cal2 = (int)Math.sqrt(cal1);
		
		var resultado = (calculo1 * cal2) / 2;
		
		System.out.println("A área do triângulo é " + resultado + " cm².");
	}

}
