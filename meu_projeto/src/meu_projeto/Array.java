package meu_projeto;

public class Array {
	
	public static void main(String[] args) {
		
		int[] arrayBase;
		arrayBase = new int[20];
		System.out.printf("%s %10s \n", "Index", "valores");
		
		arrayBase[0] = 19;
		arrayBase[1] = 18;
		arrayBase[2] = 17;
		arrayBase[3] = 16;
		arrayBase[4] = 15;
		arrayBase[5] = 14;
		arrayBase[6] = 13;
		arrayBase[7] = 12;
		arrayBase[8] = 11;
		arrayBase[9] = 10;
		arrayBase[10] = 9;
		arrayBase[11] = 8;
		arrayBase[12] = 7;
		arrayBase[13] = 6;
		arrayBase[14] = 5;
		arrayBase[15] = 4;
		arrayBase[16] = 3;
		arrayBase[17] = 2;
		arrayBase[18] = 1;
		arrayBase[19] = 0;
		 
		for (int i = 0; i < arrayBase.length; i++) {
			System.out.printf("%3d %10d \n", i, arrayBase[i]);
			
		}
	}

}
