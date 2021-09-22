package meu_projeto;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {

		Calendar cal = GregorianCalendar.getInstance();
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int anoAtual = cal.get(Calendar.YEAR);
		
		Scanner entrada = new Scanner(System.in);

			System.out.print("Dia em que você nasceu: ");			
			int diaNasc = entrada.nextInt();						
			if (diaNasc < 0)  {
				System.out.println("Dia Inválido!");
			}else if (diaNasc >31){
				System.out.println("Dia Inválido!");
			}else {
				System.out.print("Mês em que você nasceu: ");			
				int mesNasc = entrada.nextInt();						
				if (mesNasc < 0)  {
					System.out.println("Mês Inválido!");
				}else if (mesNasc >13){
					System.out.println("Mês Inválido!");
				}else {						
					System.out.print("Mês em que você nasceu: ");			
					int anoNasc = entrada.nextInt();						

					
					if((mesNasc <= mesAtual)) {
						System.out.println("Você tem " + (anoAtual - anoNasc) + " anos.");
					}else if(mesNasc >= mesAtual) {
						System.out.println("Você tem " + ((anoAtual - anoNasc) - 1) + " anos.");
					}else {
						System.out.println("nulo");
					}
					
					if(diaAtual == diaNasc) {
						System.out.println("Hoje é seu aniversário!");
						System.out.println("Parabéns!!!");
					}
															
				}

			}

			entrada.close();
		}
	}
