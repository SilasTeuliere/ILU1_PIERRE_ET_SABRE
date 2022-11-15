package personnage.humain;

import personnage.Humain;

public class Yakuza extends Humain {
	private int reputation;
	private String clan;
	
	public Yakuza(int argent, String boisson, String nom, String clan) {
		super(argent, boisson, nom);
		this.reputation = 0;
		this.clan = clan;
	}
	public void extorquer(Commercant commercant) {
		ajouterArgent(commercant.seFaireExtorquer());
		reputation++;
		parler("J’ai piqué le fric de " + commercant.getNom() + " !");
	}
	public void gagner() {
		reputation++;
		parler("J’ai gagné mon duel sombre merde !!!! HAHAHHA!");	
	}
	
	public int perdre() {
		int perdu = getArgent();
		parler("J’ai perdu mon duel et mes " + perdu + " yens, snif...");
		perdreArgent(perdu);
		reputation--;
		return perdu;
	}
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + getClan() + ".");
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public String getClan() {
		return clan;
	}
	
}
