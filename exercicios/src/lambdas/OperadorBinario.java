package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		System.out.println("-----------");
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2 ) / 2;
			System.out.println("Sua media é: " + notaFinal);
			return notaFinal >= 7 ? "Aprovado!" : "Reprovado!";
		};
			
		System.out.println("Você está " + resultado.apply(8.1, 5.7));

	}
}
