package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
//		System.out.println("2" == "2");
		
//		String s = new String("2");
//		System.out.println("2" == s);
//		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tem trabalho na Terça?");
		String ter = entrada.nextLine();
		System.out.println("Tem trabalho na Quinta?");
		String qui = entrada.nextLine();
		
		if(ter.equals("Sim") && (qui.equals("Sim"))) {
			System.out.println("Iremos ao shopping tomar sorvete ");
		}else if (ter.equals("Sim") ^ (qui.equals("Sim"))) {
			System.out.println("Iremos ao shopping tomar sorvete");
		}else {
			System.out.println("Ficaremos em casa!");			
		}
		
		if(ter.equals("Sim") && (qui.equals("Sim"))) {
			System.out.println("Também compraremos uma TV 50\"");	
		}else if (ter.equals("Sim") ^ (qui.equals("Sim"))){
			System.out.println("Também compraremos uma TV 32\"");			
		}else {
			System.out.println("Não compraremos nada!");
		}
		
		
		entrada.close();
		
		
	}

}
