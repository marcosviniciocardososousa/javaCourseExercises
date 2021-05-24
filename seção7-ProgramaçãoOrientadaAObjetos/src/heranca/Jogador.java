package heranca§a;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	public boolean atacar (Jogador oponente) {
		
		int deltax = Math.abs(x - oponente.x);
		int deltay = Math.abs(y - oponente.y);
		
		if(deltax == 0 && deltay == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltax == 1 && deltay == 0){
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao){
		switch (direcao) {
		case NORTE:	y--;break;
			
		case SUL:  	y++;break;
			
		case LESTE:	x++;break;
			
		case OESTE: x--;break;
			}
		
		return true;
		}

	
	
	
	
	
}
