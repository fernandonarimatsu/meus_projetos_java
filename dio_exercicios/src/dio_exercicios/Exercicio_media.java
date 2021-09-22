package dio_exercicios;

import java.util.Scanner;

public class Exercicio_media {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você irá digitar? ");
		int qtd = entrada.nextInt();
		
		System.out.println();
		
		double soma = 0;
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite a " + (i + 1) +  "ª nota: ");
			soma = entrada.nextDouble() + soma;
		}
		System.out.println();
				
		double media = soma / qtd;
		System.out.printf("A média das notas é: %.1f", media);
			
		
		entrada.close();
	}
	
}


















