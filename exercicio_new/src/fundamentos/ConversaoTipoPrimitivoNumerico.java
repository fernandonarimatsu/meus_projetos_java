package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a); // impl�cita

//		float b = 1.0F;
		float b = (float) 1.12345788888; //explic�ta (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c; //explic�ta (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //explic�ta (CAST)
		System.out.println(f);
	}

}
