package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a); // implícita

//		float b = 1.0F;
		float b = (float) 1.12345788888; //explicíta (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c; //explicíta (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //explicíta (CAST)
		System.out.println(f);
	}

}
