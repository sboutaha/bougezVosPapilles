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
	
	public List<Gerant_itf> getGerants();
	public void setGerants(List<Gerant_itf> u);
	public boolean addGerant(Gerant_itf p);
	public boolean removeGerant(Gerant_itf p);
}
