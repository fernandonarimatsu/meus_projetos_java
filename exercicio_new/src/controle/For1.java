package controle;

public class For1 {
	
	public static void main(String[] args) {
		
				
		for (int contador = 0; contador <=30 ; contador += 3) {
			System.out.printf("contador = %d\n", contador);
		}
		
		int x = 0;
		for(; x <= 10;) {
			System.out.println("x = " + x);
			x ++;
		}
		int y = 10;
		for(; y >= 0;) {
			System.out.println("y = " + y);
			y -= 2;
		}
	}

}
