package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		//if(boolean)
		//while(boolean)
		//for(;boolean)
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Qual é a cor da sua faixa?");
		String faixa = entrada1.nextLine();		
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Preta");
		case "marrom":
			System.out.println("Marrom");
		case "roxa":
			System.out.println("Roxa");
		case "azul":
			System.out.println("Azul");
		case "branca":
			System.out.println("Branca\n");
//		default:
//			System.out.println("Estou iniciando");
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Qual é o grau da sua faixa?");
		String grau = entrada2.nextLine();		
		
		switch (grau) {
		case "4":
			System.out.println("4 graus.");
		case "3":
			System.out.println("3 graus.");
		case "2":
			System.out.println("2 graus.");
		case "1":
			System.out.println("1 grau.");
			
			break;

		default:
			System.out.println("Não tem grau");
			break;
		}	
		
		System.out.println("FIm!");
			
		entrada2.close();
		}
		entrada1.close();
	}

}
