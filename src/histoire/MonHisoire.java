package histoire;

import personnage.Humain;
import personnage.humain.Commercant;
import personnage.humain.GrandMere;
import personnage.humain.Ronin;
import personnage.humain.Yakuza;
import personnage.humain.ronin.samourai.Traitre;

public class MonHisoire {

	public static void main(String [] args) {    
	
	  Humain humain = new Humain(10, "Porto", "Prof");
	
	  humain.direBonjour ();
	  humain.boire ();
	
	  Commercant commercant = new Commercant(35, "Marchand");
	
	  commercant.direBonjour ();
	
	  Yakuza yakusa = new Yakuza(42, "biere", "Yaku␣le␣noir", "WarSong");
	
	  yakusa.direBonjour();
	
	  yakusa.extorquer(commercant);
	
	  Ronin ronin = new Ronin(61, "sake", "Roro");
	
	  ronin.donner (10, commercant );
	  ronin.provoquer(yakusa);
	  ronin.direBonjour ();
	  
	  GrandMere mereGrand = new GrandMere(100000, "Friteuse");
	  Traitre traitre = new Traitre(100, "eau", "Trai", "Jus Dis KL");
	  commercant.direBonjour ();
	  traitre.direBonjour();
	  commercant.direBonjour ();
	  traitre.ranconner(commercant, 10);
	  commercant.direBonjour ();
	  traitre.faireLeGentil(commercant, 50);
	  commercant.direBonjour ();
	  mereGrand.faireConnaissanceAvec(humain);
	  mereGrand.faireConnaissanceAvec(traitre);
	  mereGrand.faireConnaissanceAvec(commercant);
	  mereGrand.faireConnaissanceAvec(yakusa);
	  mereGrand.faireConnaissanceAvec(ronin);
	  mereGrand.ragoter();
	  
	}
}
