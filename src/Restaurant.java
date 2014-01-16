import java.util.ArrayList;
import java.util.List;


public class Restaurant implements Restaurant_itf, MetierElement {

	int id;
	String nom;
	String telephone;
	Adresse_itf adresse;
	int nbPlaces;
	List<Gerant_itf> gerants;
	
	public Restaurant() {
		this(-1, new String(), new String(), new Adresse(), 0);
	}
	
	public Restaurant(int _id) {
		this();
		id = _id;
	}
	public Restaurant(int _id,	String _nom, String tel, Adresse_itf adr, int n) {
		id = _id;
		nom = _nom;
		telephone = tel;
		adresse = adr;
		nbPlaces = n;
		gerants = new ArrayList<Gerant_itf>();
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int _id) {
		// TODO Auto-generated method stub
		id = _id;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public void setNom(String _nom) {
		// TODO Auto-generated method stub
		nom = _nom;
	}

	@Override
	public String getTelephone() {
		// TODO Auto-generated method stub
		return telephone;
	}

	@Override
	public void setTelephone(String _telephone) {
		// TODO Auto-generated method stub
		telephone = _telephone;
	}

	@Override
	public Adresse_itf getAdresse() {
		// TODO Auto-generated method stub
		return adresse;
	}

	@Override
	public void setAdresse(Adresse_itf _adresse) {
		// TODO Auto-generated method stub
		adresse = _adresse;
	}

	@Override
	public int getNbPlaces() {
		// TODO Auto-generated method stub
		return nbPlaces;
	}

	@Override
	public void setNbPlaces(int n) {
		// TODO Auto-generated method stub
		nbPlaces = n;
	}

	@Override
	public List<Gerant_itf> getGerants() {
		// TODO Auto-generated method stub
		return gerants;
	}

	@Override
	public void setGerants(List<Gerant_itf> u) {
		// TODO Auto-generated method stub
		gerants = u;
	}

	@Override
	public boolean addGerant(Gerant_itf p) {
		// TODO Auto-generated method stub
		return gerants.add(p);
	}

	@Override
	public boolean removeGerant(Gerant_itf p) {
		// TODO Auto-generated method stub
		return gerants.remove(p);
	}

}
