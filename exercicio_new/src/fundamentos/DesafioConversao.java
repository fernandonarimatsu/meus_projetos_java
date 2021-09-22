package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	// Scanner 3 Strings v�o receber 3 ultimos salarios - Funcionar com "ponto " ou "Virgula". Somar os 3 e resuiltar m�dia.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu �tlimo sal�rio ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu pen�ltimo sal�rio ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu antepen�ltimo sal�rio ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1 + salario2 + salario3);
		double media = (soma / 3);
		System.out.println("A soma � :" + soma);
		System.out.println("A m�dia dos sal�rios � " + media);		
			
		entrada.close();
		
		}

}
