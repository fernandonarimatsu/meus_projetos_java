package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if(...) senten�a; ou {}
		//while(...) senten�a; ou {}
		//for (...;...;...) senten�a; ou {}
		
		//do {} while(...); --- senten�a antes ou depois do while.
		
		//17 de abr. de 2021
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Voc� precisa dizer " + "\nas palavras m�gicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");

		entrada.close();
		
	
	}

}
