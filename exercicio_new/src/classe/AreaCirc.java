package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.141592653589793;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}

}
