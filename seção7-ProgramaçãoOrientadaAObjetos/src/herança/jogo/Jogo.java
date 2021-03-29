package herança.jogo;

import herança.Direcao;
import herança.Heroi;
import herança.Jogador;
import herança.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(10,10);
		Jogador monstro = new Monstro(10,11);
		
		System.out.println("jogador 1 : "+heroi.vida);
		System.out.println("jogador 2 : "+monstro.vida);
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Vida Heroi   : "+heroi.vida);
		System.out.println("Vida Monstro : "+monstro.vida);
		
		
		
	}

}
