package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	//Formula mais recomendada 
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}
	
	// Funciona somente em terminal 
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
