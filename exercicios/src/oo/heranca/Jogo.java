package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(); 
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11); 
		//heroi.x = 10;
		//heroi.y = 11; Não vai precisa já esta lá em cima.
		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
		
		monstro.atacar(heroi);
		monstro.atacar(monstro);
		
		monstro.atacar(heroi);
		monstro.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		monstro.atacar(monstro);

		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
	}

}
