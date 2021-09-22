package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
//		fila.remove("Ana");
		
		System.out.println(fila.peek()); //Retorna NULO caso a fila esteja vazia.
		System.out.println(fila.peek()); //Retorna uma "Exception".
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains(...)		
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna NULO caso a fila esteja vazia.
		
//		System.out.println(fila.remove()); //Retorna uma "Exception".
	}

}
