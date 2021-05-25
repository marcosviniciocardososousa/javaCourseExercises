package projetoCalculadora.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculadora extends JFrame{
	private static final long serialVersionUID = 1L; //serial default

	public Calculadora() {
		organizarLayout(); //serve para organizar os bot�es e o display
		
		setSize(232,322); //define o tamanho da calculadora
		setLocationRelativeTo(null);//a aplica��o vai abrir no centro da tela...
		setDefaultCloseOperation(EXIT_ON_CLOSE);//tamb�m pode ser o DISPOSE_ON_CLOSE
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout()); //o layout vai ser posicionado usando como referencia a borda
		
		Display display = new Display();
		Teclado teclado = new Teclado();
		add(display, BorderLayout.NORTH);//O M�TODO ADD FOI PASSADO POR HERAN�A DO JFRAME
		add(teclado, BorderLayout.CENTER);
		
		display.setPreferredSize(new Dimension(233,60));//ALTERA AS DIMENS�ES DO DISPLAY
		
	}

	public static void main(String[] args) {
		
		new Calculadora();//--Inst�ncia o construtor...
		
	}
	
}
