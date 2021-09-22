package desafioconceitosbasicos;

import javax.swing.JOptionPane;

public class CalculoRaiz {
	
public static void main(String[] args) { 
	
	String ln1 = JOptionPane.showInputDialog("Informe o numero!"); 
	double n1 = Double.parseDouble(ln1); 
	JOptionPane.showMessageDialog(null, "A raiz de " + ln1 + "\n é \n"+ Math.sqrt(n1)); 
	
}

}