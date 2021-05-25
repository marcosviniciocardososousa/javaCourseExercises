package projetoCalculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import projetoCalculadora.modelo.Memoria;
import projetoCalculadora.modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador{
	private static final long serialVersionUID = 1L;
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().addObservador(this); //notifica a memoria, sempre  que houver uma alteração esta classe deseja ser notificada
		label = new JLabel(Memoria.getInstancia().getTextoAtual()); 
		
		setBackground(new Color(46, 49, 50));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));//posiciona as letras dentro do display, os outros 2 parametros são o alinhamento vertical e horizontal
		label.setForeground(Color.WHITE);//define a cor das letras do label como brancas
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		add(label);//adicionando JLabel ao JPanel e consecutivamente a tela
	
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
