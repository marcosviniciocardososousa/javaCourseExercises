package ExemploObserverSwing;

import java.awt.FlowLayout;


import javax.swing.*;

public class Observador {

	public static void main(String[] args) {
		/**
		 * LISTENER = QUEM ESCUTA
		 * OBSERVER = QUEM OBSERVA
		 */

		JFrame janela = new JFrame("Observador");//o par�metro passado � o titulo da janela
		
		//faz com que o padr�o ao clicar em fechar a janela seja matar a aplica��o
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setLayout(new FlowLayout());//o bot�o deixa de ocupar a tela inteira
		janela.setLocationRelativeTo(null);//centralizar relativo a tela do computador
		janela.setSize(600,200);//define o tamanho da janela
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao); //por padr�o o bot�o ocupa a tela inteira!
		
		//--------------------------------------------------
		botao.addActionListener(e -> {
			System.out.println("---*** Evento ocorreu ***---");
		});
		
//		botao.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				/**
//				 * foi criada uma classe an�nima, ela diz o que acontece quando o evento ocorrer
//				 */
//				System.out.println("---*** Evento ocorreu ***---");
//			}
//		});
//		//--------------------------------------------------
		
		janela.setVisible(true);//a janela foi definida como visivel
		
		
	}

}
