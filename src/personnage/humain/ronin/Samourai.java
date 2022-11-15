package personnage.humain.ronin;

import personnage.humain.Ronin;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom);
		this.seigneur = seigneur;
	}
	
    //Polymorphisme de la methode boire d'humain
    public void boire(String boisson) {
        parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
    
	public void direBonjour() {
		super.direBonjour();
		parler("Mon seigneur est " + seigneur + ".");
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
}
