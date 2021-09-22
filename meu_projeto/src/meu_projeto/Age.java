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

			System.out.print("Dia em que voc� nasceu: ");			
			int diaNasc = entrada.nextInt();						
			if (diaNasc < 0)  {
				System.out.println("Dia Inv�lido!");
			}else if (diaNasc >31){
				System.out.println("Dia Inv�lido!");
			}else {
				System.out.print("M�s em que voc� nasceu: ");			
				int mesNasc = entrada.nextInt();						
				if (mesNasc < 0)  {
					System.out.println("M�s Inv�lido!");
				}else if (mesNasc >13){
					System.out.println("M�s Inv�lido!");
				}else {						
					System.out.print("M�s em que voc� nasceu: ");			
					int anoNasc = entrada.nextInt();						

					
					if((mesNasc <= mesAtual)) {
						System.out.println("Voc� tem " + (anoAtual - anoNasc) + " anos.");
					}else if(mesNasc >= mesAtual) {
						System.out.println("Voc� tem " + ((anoAtual - anoNasc) - 1) + " anos.");
					}else {
						System.out.println("nulo");
					}
					
					if(diaAtual == diaNasc) {
						System.out.println("Hoje � seu anivers�rio!");
						System.out.println("Parab�ns!!!");
					}
															
				}

			}

			entrada.close();
		}
	}
