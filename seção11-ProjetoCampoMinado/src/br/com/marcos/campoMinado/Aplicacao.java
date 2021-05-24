package br.com.marcos.campoMinado;

import br.com.marcos.campoMinado.modelo.Tabuleiro;
import br.com.marcos.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro  = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

}
