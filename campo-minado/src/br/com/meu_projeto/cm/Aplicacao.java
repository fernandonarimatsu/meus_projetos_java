package br.com.meu_projeto.cm;

import br.com.meu_projeto.cm.modelo.Tabuleiro;
import br.com.meu_projeto.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);		
		new TabuleiroConsole(tabuleiro);		
	}

}
