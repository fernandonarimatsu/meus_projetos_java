package desafioconceitosbasicos;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
//		IMC = kg � (alt � alt) = kg/m2 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double valor1 = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double valor2 = entrada.nextDouble();
		
		double resultado = valor1 / (valor2 * valor2);
		
		System.out.println();
		System.out.printf("Seu IMC � %.1f ", resultado);
		System.out.println();
		
		if(resultado < 17) {
			System.out.println("Voc� est� muito abaixo do peso!");			
		}else if(resultado >= 17 && resultado <= 18.49) {
			System.out.println("Voc� est� abaixo do peso!");
		}else if(resultado >= 18.50 && resultado <= 24.99) {
			System.out.println("Seu peso est� normal!");
		}else if(resultado >= 25 && resultado <= 29.99) {
			System.out.println("Voc� est� acima do peso!");
		}else if(resultado >= 30 && resultado <= 34.99) {
			System.out.println("Voc� est� com Obesidade Grau I.");
		    System.out.println("Cuidado! ");
		}else if(resultado >= 35 && resultado <= 39.99) {
			System.out.println("Voc� est� com Obesidade Grau II.");
		    System.out.println("Muito Cuidado!");
		}else if(resultado >= 40) {
			System.out.println("Aten��o!! ");
			System.out.println("Voc� est� com Obesidade Grau III.");
		}else {
			
		}
		
		entrada.close();
	}


}


/*Abaixo de 17	     Muito abaixo do peso
Entre 17 e 18,49	 Abaixo do peso
Entre 18,50 e 24,99	 Peso normal
Entre 25 e 29,99	 Acima do peso
Entre 30 e 34,99	 Obesidade I
Entre 35 e 39,99	 Obesidade II (severa)
Acima de 40	Obesidade III (m�rbida)*/