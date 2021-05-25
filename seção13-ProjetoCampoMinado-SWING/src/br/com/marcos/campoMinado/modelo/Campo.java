package br.com.marcos.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	private List<Campo> vizinhos = new ArrayList<>();
	
	private List<CampoObservador> observadores = new ArrayList<>();
	
	
	public Campo( int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	public void notificarObservador(CampoEvento evento) {
		observadores.stream()
			.forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	public boolean adicionarVizinho (Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = 	coluna != vizinho.linha;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
		
	}
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservador(CampoEvento.MARCAR);
			}else {
				notificarObservador(CampoEvento.DESMARCAR);
			}
		}
	}
	
	public boolean abrir () {
		if(!aberto && !marcado) {
			if(minado) {
				notificarObservador(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
		}else {
			return false;
		}
	}
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream()
				.noneMatch(v -> v.minado);
	}
	
	public void minar() {
		if(!minado) {
			minado = true;	
		} 
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	void setAberto (boolean aberto) {
		this.aberto = aberto;
		if(aberto) {
			notificarObservador(CampoEvento.ABRIR);
		}
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	public boolean isMarcado() {
		return marcado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido  = minado && marcado;
		return desvendado || protegido;
	}
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream()
				.filter(v -> v.minado)
				.count();
	}
	
	void reiniciar () {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservador(CampoEvento.REINICIAR);
	}
	
	
}
