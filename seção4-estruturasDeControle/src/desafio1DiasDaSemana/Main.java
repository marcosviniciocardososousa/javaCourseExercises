package desafio1DiasDaSemana;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Informe o dia da semana!");
		
		if(dia.equalsIgnoreCase("domingo")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 1");
		}else if(dia.equalsIgnoreCase("segunda")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 2");
		}else if(dia.equalsIgnoreCase("terça")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 3");
		}else if(dia.equalsIgnoreCase("quarta")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 4");
		}else if(dia.equalsIgnoreCase("quinta")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 5");
		}else if(dia.equalsIgnoreCase("sexta")) {
			JOptionPane.showInternalMessageDialog(null, "DIA: 6");
		}else if(dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			JOptionPane.showMessageDialog(null, "DIA: 7");
		}
		
		
		
	}

}
