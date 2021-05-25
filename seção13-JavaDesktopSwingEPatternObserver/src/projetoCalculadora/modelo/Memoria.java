package projetoCalculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, SINAL;
	};
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores = 
			new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textobuffer = "";
	
	private Memoria() {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void addObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public void processaComando(String valor) {
		TipoComando tipoComando = detectarTipoComando(valor);
	
		if(tipoComando == null) {
			return;
		}else if(tipoComando == TipoComando.SINAL && textoAtual.contains("-")){
			textoAtual = textoAtual.substring(1);
			
		}else if(tipoComando == TipoComando.SINAL && !textoAtual.contains("-")){
			textoAtual = "-" + textoAtual;
			
		}else if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textobuffer = "";
			substituir = false;
			ultimaOperacao = null;
		}else if(tipoComando == TipoComando.NUMERO
			  || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? valor : textoAtual + valor;
			substituir = false;
		}else {
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textobuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
		
	}

	private String obterResultadoOperacao() {
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(textobuffer.replace(",", "."));
		double numeroAtual  = Double.parseDouble(textoAtual.replace(",", "."));
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		}else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		}else if(ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		}

		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
	}

	private TipoComando detectarTipoComando(String valor) {
		
		if(textoAtual.isEmpty() && valor == "0") {//filtra os zeros a esquerda
			return null;
		}
		
		try {
			Integer.parseInt(valor);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			//Quando não for número...
			if("AC".equals(valor)) {
				return TipoComando.ZERAR;
			}else if("/".equals(valor)) {
				return TipoComando.DIV;
			}else if("*".equals(valor)) {
				return TipoComando.MULT;
			}else if("+".equals(valor)) {
				return TipoComando.SOMA;
			}else if("-".equals(valor)) {
				return TipoComando.SUB;
			}else if("=".equals(valor)) {
				return TipoComando.IGUAL;
			}else if(",".equals(valor) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}else if("±".equals(valor)) {
				return TipoComando.SINAL;
			}
			
		}
		
		return null;
	}
	
}
