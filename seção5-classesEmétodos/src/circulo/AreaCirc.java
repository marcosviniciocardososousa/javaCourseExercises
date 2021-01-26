package circulo;

public class AreaCirc {
	double raio;
	static final double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
		
	}
	double area() {
		return raio * raio * pi;	
	}
	
}
