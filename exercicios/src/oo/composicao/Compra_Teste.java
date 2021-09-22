package oo.composicao;

public class Compra_Teste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		Compra compra2 = new Compra();		
		compra2.adicionarItem(new Item("Lapiseira", 10, 5.58));
		compra2.adicionarItem(new Item("Grafite", 10, 1.75));
		compra2.adicionarItem(new Item("Papel Sulfite", 5, 17.63));
		
		System.out.println(compra1.itens.size());
		System.out.println("A sua compra n�mero 1 � " + compra1.obterValorTotal());
		
		
		System.out.println("A sua compra n�mero 2 � " + compra2.obterValorTotal());
		
		}

}
