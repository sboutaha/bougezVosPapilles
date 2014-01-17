package commandesEnLigne;

import java.util.List;


public interface Restaurant_itf{
	
	public int getId();
	public void setId(int _id);
	
	public String getNom();
	public void setNom(String _nom);
	
	public String getTelephone();
	public void setTelephone(String _telephone);
	
	public String getAdresse();
	public void setAdresse(String _adresse);
	
	public String getVille();
	public void setVille(String _adresse);
	
	public int getNbPlaces();
	public void setNbPlaces(int n);
	
	public String getDescription();
	public void setDescription(String description);

	public List<Gerant_itf> getGerants();
	public void setGerants(List<Gerant_itf> u);
	public boolean addGerant(Gerant_itf p);
	public boolean removeGerant(Gerant_itf p);
	
	
	
	public List<PlatPerso_itf> getCarte();
	public void setCarte(List<PlatPerso_itf> carte);
	
	public List<QI_Stock> getStock();
	public void setStock(List<QI_Stock> stock);
	public boolean addStockItem(QI_Stock q);
	public boolean removeStockItem(QI_Stock q);
	
	public List<Creneau_itf> getOuvertA();
	public void setOuvertA(List<Creneau_itf> ouvertA);
	
	public List<Commande_itf> getCommandes();
	public void setCommandes(List<Commande_itf> commandes);	
}
