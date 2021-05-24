package br.com.marcos.campoMinado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.marcos.campoMinado.excecao.ExplosaoException;
import br.com.marcos.campoMinado.excecao.SairException;
import br.com.marcos.campoMinado.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner input = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			while(continuar) {
				cicloDoJogo();
				
				System.out.println("Outra Partida? (S/N) ");
				String resposta = input.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				}else {
					tabuleiro.reiniciar();
				}
			}
			
		}catch (SairException e) {
			System.out.println("Tchau!!!");
		}finally {
			input.close();
		}
	}

	private void cicloDoJogo() {

		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (X,Y): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
				 	.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
				
			}
			System.out.println(tabuleiro );
			System.out.println("Você ganhou!!!");
		}catch(ExplosaoException e){
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!!!");
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = input.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
	
	
	
	
}
