package commandesEnLigne;

import java.util.List;


public class CommandeLivraison extends Commande {

	String adresse;
	
	public CommandeLivraison(Utilisateur_itf c, Restaurant_itf r, List<PlatPerso_itf> p, String a) {
		super(c, r, p);
		adresse = a;
	}
	public void setAdresse(String a) {
		adresse = a;
	}
	
	public String getAdresse() {
		return adresse;
	}
	@Override
	public int getType() {
		
		return Commande_itf.LIVRAISON;
	}

}
