package personnage.humain.ronin.samourai;

import personnage.Humain;
import personnage.humain.Commercant;
import personnage.humain.ronin.Samourai;

public class Traitre extends Samourai{
	private int traitrise;

	public Traitre(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom, seigneur);
		this.traitrise = 0;
	}
	
	public void ranconner(Commercant commercant, int rancon) {
		if (traitrise < 3) {
			traitrise++;
			commercant.perdreArgent(rancon);
			ajouterArgent(rancon);
			parler("Merci d'avoir payer votre dû à moi et mon seigneur "+ getSeigneur() + ".");
		}
		else {
			parler("Je vous aurez, un jour je vous aurez!");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis un traitre de niveau " + traitrise + ".");
	}
	
	public void faireLeGentil(Humain humain, int don) {
		parler("Tiens " + humain.getNom() + ", voilà " + don + " yens.");
		humain.ajouterArgent(don);
		perdreArgent(don);
		traitrise -= don/10;
		if (traitrise < 0) {
			traitrise = 0;
		}
	}
}
