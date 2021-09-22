package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	// Scanner 3 Strings vão receber 3 ultimos salarios - Funcionar com "ponto " ou "Virgula". Somar os 3 e resuiltar média.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu útlimo salário ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu penúltimo salário ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite seu antepenúltimo salário ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1 + salario2 + salario3);
		double media = (soma / 3);
		System.out.println("A soma é :" + soma);
		System.out.println("A média dos salários é " + media);		
			
		entrada.close();
		
		}

}
