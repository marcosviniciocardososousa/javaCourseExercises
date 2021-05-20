package ExemploExceção;

public class Causa {
	public static void main(String[] args) {
	
		try {
			metodoA(null);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
		
	}
	
	static void metodoA (Aluno aluno) {
		metodoB(aluno);
	}
	static void metodoB (Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nulo!!!");
		}
		System.out.println(aluno.nome);
	}
	
//	Exception in thread "main" java.lang.IllegalArgumentException: java.lang.NullPointerException: Aluno está nulo!!!
//	at ExemploExceção.Causa.main(Causa.java:9)
//Caused by: java.lang.NullPointerException: Aluno está nulo!!!
//	at ExemploExceção.Causa.metodoB(Causa.java:19)
//	at ExemploExceção.Causa.metodoA(Causa.java:15)
//	at ExemploExceção.Causa.main(Causa.java:7)
	
}
