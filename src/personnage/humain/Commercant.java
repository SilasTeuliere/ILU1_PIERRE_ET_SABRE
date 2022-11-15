package personnage.humain;

import personnage.Humain;

public class Commercant extends Humain{
    public Commercant(int argent,String nom){
        super(argent, "thé", nom);
    }
    
    public int seFaireExtorquer() {
    	int perdu = getArgent();
    	perdreArgent(perdu);
        this.parler("Mon argent ! Ce monde est trop injuste !");
        return perdu;
    }
    
    public void recevoir(int argent) {
    	ajouterArgent(argent);
        this.parler("*Se met à genoux* Je te remercie généreux donateur, pour les "+argent+" yens !");
    }
}
