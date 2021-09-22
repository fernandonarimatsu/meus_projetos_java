package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por alunos? ");
		int qtdNotas = entrada.nextInt();
		
		double total = 0;
		double[] [] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.printf("A média da turma é: %.1f\n", media);
		
		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}	
		
		entrada.close();	
		
	}

}
