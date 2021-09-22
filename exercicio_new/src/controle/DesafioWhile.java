package controle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
//		String nota = JOptionPane.showInputDialog("Digite a sua nota");
		//17 de abr. de 2021
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota !=-1) {
			System.out.print("Informe a nota ou -1 para sair!"); 
			nota = entrada.nextDouble(); 
						
			if (nota <= 10 && nota >=0) {
				total += nota;
				quantidadeDeNotas ++;
			} else if(nota !=-1){
				System.out.println("Nota Inválida");
			}
		
		}
		double media = total / quantidadeDeNotas;
		System.out.println("Média: " + media);
			
				
		entrada.close();
			
		}

}
