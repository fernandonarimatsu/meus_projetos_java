package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		// for (int i = 0 ; i < 10 ; i ++ ); Exemplo de laço de repetição for.
		//caso queira usar a variavel (i) em outros momentos deve-se duplicar a variavél
		//(i) fora do "for" entre {}.
		
		for (int i = 0 ; i < 10 ; i ++) {
			for (int j = 0 ; j < 10 ; j ++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
				
			
		}
//			System.out.println(i);
//		}
//		int i = 10;
//
//		System.out.println(i + " Saiu do for...");
//
//		for (int j = 9 ; j > -1 ; j --) {
//			System.out.println(j);
//		}
	}

}
