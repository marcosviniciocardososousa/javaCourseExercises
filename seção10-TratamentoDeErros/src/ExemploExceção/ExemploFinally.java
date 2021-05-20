package ExemploExceção;

import java.util.Scanner;

public class ExemploFinally {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		try {
			System.out.println(7 / input.nextInt());
			input.close();//Sem o finally este recurso ficará aberto 
						  //em caso de divisão por zero
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			//independente se houver erros ou não o finally será chamado
			//se não houver erro ele será chamado da mesma forma
			System.out.println("Finally 1 ...");
		}
		
		
		//o finally também pode ser usado em caso de erro.
		try {
			System.out.println(7 / input.nextInt());
			input.close();	  
		} finally {
			System.out.println("Fechando scanner ...");
			input.close();
		}
		
		
	}

}
