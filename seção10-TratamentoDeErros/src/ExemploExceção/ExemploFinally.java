package ExemploExce��o;

import java.util.Scanner;

public class ExemploFinally {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		try {
			System.out.println(7 / input.nextInt());
			input.close();//Sem o finally este recurso ficar� aberto 
						  //em caso de divis�o por zero
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			//independente se houver erros ou n�o o finally ser� chamado
			//se n�o houver erro ele ser� chamado da mesma forma
			System.out.println("Finally 1 ...");
		}
		
		
		//o finally tamb�m pode ser usado em caso de erro.
		try {
			System.out.println(7 / input.nextInt());
			input.close();	  
		} finally {
			System.out.println("Fechando scanner ...");
			input.close();
		}
		
		
	}

}
