package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
	AreaCirc a1 = new AreaCirc(10);
//	a1.PI = 10;	
	System.out.println(a1.area());
	
	AreaCirc a2 = new AreaCirc(5);
//	a2.PI = 5;	
	System.out.println(a2.area());
	
	System.out.println(AreaCirc.PI);
	System.out.println(Math.PI);
		
	}

}
