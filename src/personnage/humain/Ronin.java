package personnage.humain;

import personnage.Humain;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(int argent, String boisson, String nom) {
		super(argent, boisson, nom);
		this.honneur = 1;
	}
	
	public void donner(int don, Commercant commercant) {
		parler("Tiens " + commercant.getNom() + ", voilà " + don + " yens.");
		commercant.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza yakuza) {
		if(honneur*2 > yakuza.getReputation()) {
			ajouterArgent(yakuza.perdre());
			honneur++;
			parler("C'est ainsi une victoire de plus pour moi le Grand " + getNom());
		}
		else {
			honneur--;
			yakuza.gagner();
			parler("J'ai glissé voilà la cause de ma defaite");
		}
	}
}
