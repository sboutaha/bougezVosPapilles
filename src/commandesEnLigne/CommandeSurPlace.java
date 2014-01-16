package commandesEnLigne;

import java.util.List;


public class CommandeSurPlace extends Commande {

	int nbPlaces;
	Creneau_itf creneau;
	
	public CommandeSurPlace(Utilisateur_itf c, Restaurant_itf r, List<PlatPerso_itf> p, int n, Creneau_itf heure) {
		super(c, r, p);
		nbPlaces = n;
		creneau = heure;
	}
	
	public void setNbPlaces(int n) {
		nbPlaces = n;
	}
	
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	public void setCreneau(Creneau_itf c) {
		creneau = c;
	}
	
	public Creneau_itf getCreneau() {
		return creneau;
	}
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Commande_itf.SUR_PLACE;
	}
	
}