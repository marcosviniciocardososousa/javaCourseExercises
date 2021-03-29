package composição1para1;

public class Motor {
	
	Carro carro = new Carro();
	boolean ligado = false;
	double fatorInjecao = 1;
	
	public void setFatorInjecao(double fatorInjecao) {
		this.fatorInjecao = fatorInjecao;
	}



	public int giros() {
		if(ligado) {
			if(fatorInjecao >= 0)return (int)Math.round(fatorInjecao * 3000);
			else {
				return (int) (fatorInjecao = 0);
			}
			
		}else {
			return 0;
		}
		
	}
	
	
}
