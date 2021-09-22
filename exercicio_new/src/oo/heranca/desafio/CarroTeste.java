package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c = new Civic();
		
		c.acelerar();
		
		c.acelerar();
		
		c.acelerar();
		System.out.println(c);
				

		Carro f = new Ferrari();
		
		f.acelerar();
		f.acelerar();
		System.out.println(f);
	}
}
