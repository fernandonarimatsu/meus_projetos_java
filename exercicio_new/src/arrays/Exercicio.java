package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notaAlunoA = new double[4];
		System.out.println(Arrays.toString(notaAlunoA));
		System.out.println("-------------------------");
		
		notaAlunoA[0] = 7.9;
		notaAlunoA[1] = 8;
		notaAlunoA[2] = 6.7;
		notaAlunoA[3] = 9.7;
		
		System.out.println("Notas " + Arrays.toString(notaAlunoA));
		double totalAlunoA = 0;
		for (int i = 0; i < notaAlunoA.length; i++) {
			totalAlunoA += notaAlunoA[i];
		}
		double mediaA = totalAlunoA / notaAlunoA.length;
		System.out.printf("A média do Aluno A é %.2f\n", mediaA);
		
		if (mediaA >= 8.0) {
			System.out.println("Parabéns você está \nAPROVADO!");
		}else if (mediaA < 7.9 && mediaA >= 5.0){
			System.out.println("RECUPERAÇÃO!");
		}else {
			System.out.println("REPROVADO!");
		}
			
		System.out.println("-------------------------");
		
		double [] notaAlunoB = {5.9 , 7.9, 5.5, 10};       // Menos comum
		System.out.println("Notas " + Arrays.toString(notaAlunoB));
		
		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];			
		}
		double mediaB = totalAlunoB / notaAlunoB.length;
		System.out.printf("A média do Aluno B é %.2f\n", mediaB);
		
		if (mediaB >= 8.0) {
			System.out.println("Parabéns você está APROVADO!");
		}else if (mediaB < 7.9 && mediaB >= 5.0){
			System.out.println("RECUPERAÇÃO!");
		}else {
			System.out.println("REPROVADO!");
		}
		System.out.println("-------------------------");
	}

}
