package projetoCalculadora.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import projetoCalculadora.modelo.Memoria;

public class Teclado extends JPanel implements ActionListener{//actionListener implementa as funcionalidades necessárias para o funcionamento do display
	private static final long serialVersionUID = 1L;
	
	//cores dos botões
	private final Color COR_CINZA_ESCURO  = new Color(68,68,68);
	private final Color COR_CINZA_CLARO   = new Color(99,99,99);
	private final Color COR_LARANJA = new Color(243,163,60);
	
	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);//o teclado terá 5 linhas e 4 colunas
		
		c.fill = GridBagConstraints.BOTH; //preenche automaticamente os espaços vazios
		c.weightx = 1; //configura quantos espaços um botão ocupará
		c.weighty = 1;
		
		//Linha 1
		c.gridwidth = 2;
		adicionarBotao("AC",COR_CINZA_ESCURO, c, 0,0);
		c.gridwidth = 1;
		adicionarBotao("±",COR_CINZA_ESCURO, c, 2,0);
		adicionarBotao("/",COR_LARANJA, c, 3,0);
		
		//Linha 2
		adicionarBotao("7",COR_CINZA_CLARO, c, 0,1);
		adicionarBotao("8",COR_CINZA_CLARO, c, 1,1);
		adicionarBotao("9",COR_CINZA_CLARO, c, 2,1);
		adicionarBotao("*",COR_LARANJA, c, 3,1);
		
		//Linha 3
		adicionarBotao("4",COR_CINZA_CLARO, c, 0,2);
		adicionarBotao("5",COR_CINZA_CLARO, c, 1,2);
		adicionarBotao("6",COR_CINZA_CLARO, c, 2,2);
		adicionarBotao("-",COR_LARANJA, c, 3,2);
		
		//Linha 4
		adicionarBotao("1",COR_CINZA_CLARO, c, 0,3);
		adicionarBotao("2",COR_CINZA_CLARO, c, 1,3);
		adicionarBotao("3",COR_CINZA_CLARO, c, 2,3);
		adicionarBotao("+",COR_LARANJA, c, 3,3);
		
		//Linha 5
		c.gridwidth = 2;
		adicionarBotao("0",COR_CINZA_CLARO, c, 0,4);
		c.gridwidth = 1;
		adicionarBotao(",",COR_CINZA_CLARO, c, 2,4);
		adicionarBotao("=",COR_LARANJA, c, 3,4);
		
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);
		botao.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processaComando(botao.getText());
		}
		
	}

}
