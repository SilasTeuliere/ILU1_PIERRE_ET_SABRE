package personnage.humain;

import java.util.Random;

import personnage.Humain;
import personnage.humain.ronin.samourai.Traitre;

public class GrandMere extends Humain {
	private Humain [] memoire ;
	private int nbConnaissance;

	public GrandMere(int argent, String nom) {
		super(argent, "tisane", nom);
		this.memoire = new Humain [30];
		this.nbConnaissance = 0;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		if (nbConnaissance < 30) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	private String humainHasard() {
		int r = new Random().nextInt(4);
		switch(r) {
		case 0:
			return "Commerçant";
		case 1:
			return "Ronin";
		case 2:
			return "Yakuza";
		default:
			return "Samourai";
		}
	}
	
	public void ragoter() {
		if (nbConnaissance > 0){
			for(int i =0; i < nbConnaissance; i++) {
				if (memoire[i] instanceof Traitre) {
					parler("je sais que " + memoire[i].getNom() + " est un traître !");
				}
				else {
					parler("je crois que " + memoire[i].getNom() + " est un " + humainHasard() + ".");
				}
			}
		}
		else {
			parler("Oh pauvre damné que je suis, je ne connais personne !" );
		}
	}
	
	
}
