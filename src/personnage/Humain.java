package personnage;

public class Humain {
    private int argent;
    private String boisson;
    private String nom;
    
    
    /**
     * @param argent
     * @param boisson
     * @param nom
     */
    public Humain(int argent, String boisson, String nom) {
        super();
        this.argent = argent;
        this.boisson = boisson;
        this.nom = nom;
    }
    
    public int ajouterArgent(int valeur) {
        this.argent+=valeur;
        return this.argent;
    }
    
    public int perdreArgent(int valeur) {
        this.argent-=valeur;
        return this.argent;
    }
    
    public void boire() {
        parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
    }  
    
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + this.nom + ", j'aime boire du " + this.boisson + " et j'ai " + this.getArgent()+" yens sur moi");
    }
    
    
    public int getArgent() {
        return this.argent;
    }
    
    public String getBoisson() {
        return this.boisson;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void parler(String texte) {
        System.out.println( "(" + this.nom+") - " + texte);

    }

}
