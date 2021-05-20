package ExemploExce��o;

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
			throw new NullPointerException("Aluno est� nulo!!!");
		}
		System.out.println(aluno.nome);
	}
	
//	Exception in thread "main" java.lang.IllegalArgumentException: java.lang.NullPointerException: Aluno est� nulo!!!
//	at ExemploExce��o.Causa.main(Causa.java:9)
//Caused by: java.lang.NullPointerException: Aluno est� nulo!!!
//	at ExemploExce��o.Causa.metodoB(Causa.java:19)
//	at ExemploExce��o.Causa.metodoA(Causa.java:15)
//	at ExemploExce��o.Causa.main(Causa.java:7)
	
}
