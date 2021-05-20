package introdu��oAThreads;

public class Threads {

	public Threads(Runnable trabalho1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Runnable trabalho1 = new Trabalho1(); 
		Runnable trabalho2 = new Runnable() {
			//Runnable é uma interface do java que cria uma nova thread
			//Runnable cria uma classe anônima (a classe não existe).
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("Tarefa #02");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
					
				}
				
			}
		};
		
		//multi paralelismo em interfaces funcionais
		//criando uma interface Runnable usando os conceitos de programação funcional
		Runnable trabalho3 = () -> {
			for(int i = 0; i < 100; i++) {
				System.out.println("Tarefa #03");
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
				
			}
		};
		
		Runnable trabalho4 = Threads::trabalho4;
		

		
		
		//Thread recebe como parâmetro uma interface Runnable.
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);
		
		//iniciando a thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
	static void trabalho4() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Tarefa #04");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
			
		}
	}
	
	
	
}
