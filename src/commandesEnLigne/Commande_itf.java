package commandesEnLigne;

import java.util.List;


public interface Commande_itf {
	static int A_EMPORTER = 0;
	static int SUR_PLACE = 1;
	static int LIVRAISON = 2;
	
	public void setPlats(List<PlatPerso_itf> lesPlats);
	public List<PlatPerso_itf> getPlats();
	public boolean addPlat(PlatPerso_itf p);
	public boolean removePlat(PlatPerso_itf p);
	public int getType();
	public Utilisateur_itf getClient();
	public void setClient(Utilisateur_itf leClient);
}
