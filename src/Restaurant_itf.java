import java.util.List;


public interface Restaurant_itf {
	
	public int getId();
	public void setId(int _id);
	
	public String getNom();
	public void setNom(String _nom);
	
	public String getTelephone();
	public void setTelephone(String _telephone);
	
	public Adresse_itf getAdresse();
	public void setAdresse(Adresse_itf _adresse);
	
	public int getNbPlaces();
	public void setNbPlaces(int n);
	
	public int getGerants();
	public void setGerants(List<Utilisateur_itf> u);
	public boolean addGerant(Utilisateur_itf p);
	public boolean removePlat(Utilisateur_itf p);
}
