package controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador ++;
		}
		
		int cont = 0;
		
		while(cont <= 20) {
			System.out.printf("i = %d\n", cont);
			cont += 2;
		}
	}

}
