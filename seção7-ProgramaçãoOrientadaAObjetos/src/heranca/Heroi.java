package heranca�a;

public class Heroi extends Jogador {
	
	//formas de sobrescrever um método herdado.	
	
		/**
		 boolean atacar (Jogador oponente) {
	
		int forcaAtaque = 20;
		int deltax = Math.abs(x - oponente.x);
		int deltay = Math.abs(y - oponente.y);
		
		if(deltax == 0 && deltay == 1) {
			oponente.vida -= forcaAtaque;
			return true;
		}else if(deltax == 1 && deltay == 0){
			oponente.vida -= forcaAtaque;
			return true;
		}else {
			return false;
		}
		
	}
		 */
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	//forma recomendada de sobreescrever
	public boolean atacar(Jogador oponente) {
		//super : chama algo do método pai
		boolean ataque1 = super.atacar(oponente);//chamamos 2x para dar o dobro de dano.
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}

	
}
