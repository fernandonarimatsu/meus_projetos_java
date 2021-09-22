package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if(...) sentença; ou {}
		//while(...) sentença; ou {}
		//for (...;...;...) sentença; ou {}
		
		//do {} while(...); --- sentença antes ou depois do while.
		
		//17 de abr. de 2021
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Você precisa dizer " + "\nas palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");

		entrada.close();
		
	
	}

}
