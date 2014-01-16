package commandesEnLigne;

import java.util.ArrayList;
import java.util.List;


public abstract class Commande implements Commande_itf, MetierElement {

	Utilisateur_itf client;
	Restaurant_itf restaurant;
	List<PlatPerso_itf> plats;
	
	public Commande() {	
	}
	
	public Commande(Utilisateur_itf c, Restaurant_itf r, List<PlatPerso_itf> p) {
		client = c;
		restaurant = r;
		plats = p;
	}
	
	public Commande(Utilisateur_itf c, Restaurant_itf r) {
		this(c, r, new ArrayList<PlatPerso_itf>());
	}
	
	@Override
	public void setPlats(List<PlatPerso_itf> lesPlats) {
		// TODO Auto-generated method stub
		plats = lesPlats;
	}

	@Override
	public List<PlatPerso_itf> getPlats() {
		// TODO Auto-generated method stub
		return plats;
	}

	@Override
	public boolean addPlat(PlatPerso_itf p) {
		// TODO Auto-generated method stub
		return plats.add(p);
	}

	@Override
	public boolean removePlat(PlatPerso_itf p) {
		// TODO Auto-generated method stub
		return plats.remove(p);
	}

	@Override
	public abstract int getType(); 
	
	@Override
	public Utilisateur_itf getClient() {
		// TODO Auto-generated method stub
		return client;
	}

	@Override
	public void setClient(Utilisateur_itf leClient) {
		// TODO Auto-generated method stub
		client = leClient;
	}

}
