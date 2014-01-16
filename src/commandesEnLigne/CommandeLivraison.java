import java.util.List;


public class CommandeLivraison extends Commande {

	Adresse adresse;
	
	public CommandeLivraison(Utilisateur_itf c, Restaurant_itf r, List<PlatPerso_itf> p, Adresse a) {
		super(c, r, p);
		adresse = a;
	}
	public void setAdresse(Adresse a) {
		adresse = a;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Commande_itf.LIVRAISON;
	}

}
