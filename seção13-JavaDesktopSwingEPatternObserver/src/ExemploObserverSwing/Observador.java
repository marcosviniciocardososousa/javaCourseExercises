package ExemploObserverSwing;

import java.awt.FlowLayout;


import javax.swing.*;

public class Observador {

	public static void main(String[] args) {
		/**
		 * LISTENER = QUEM ESCUTA
		 * OBSERVER = QUEM OBSERVA
		 */

		JFrame janela = new JFrame("Observador");//o parâmetro passado é o titulo da janela
		
		//faz com que o padrão ao clicar em fechar a janela seja matar a aplicação
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setLayout(new FlowLayout());//o botão deixa de ocupar a tela inteira
		janela.setLocationRelativeTo(null);//centralizar relativo a tela do computador
		janela.setSize(600,200);//define o tamanho da janela
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao); //por padrão o botão ocupa a tela inteira!
		
		//--------------------------------------------------
		botao.addActionListener(e -> {
			System.out.println("---*** Evento ocorreu ***---");
		});
		
//		botao.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				/**
//				 * foi criada uma classe anônima, ela diz o que acontece quando o evento ocorrer
//				 */
//				System.out.println("---*** Evento ocorreu ***---");
//			}
//		});
//		//--------------------------------------------------
		
		janela.setVisible(true);//a janela foi definida como visivel
		
		
	}

}
