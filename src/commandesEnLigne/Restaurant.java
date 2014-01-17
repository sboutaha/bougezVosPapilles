package commandesEnLigne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Restaurant implements Restaurant_itf, MetierElement, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String nom;
	String telephone;
	String adresse;
	String ville;
	int nbPlaces;
	String description;
	@OneToMany
	List<Gerant_itf> gerants;
	@OneToMany
	List<PlatPerso_itf> carte;
	@OneToMany
	List<QI_Stock> stock;
	@OneToMany
	List<Creneau_itf> ouvertA;
	@OneToMany
	List<Commande_itf> commandes;
	
	
	public Restaurant() {
		gerants = new ArrayList<Gerant_itf>();
		carte = new ArrayList<PlatPerso_itf>() ;
		stock = new ArrayList<QI_Stock>() ;
		ouvertA = new ArrayList<Creneau_itf>() ;
		commandes = new ArrayList<Commande_itf>();
	}
	
	public Restaurant(int _id, String _nom) {
		this();
		id = _id;
		nom= _nom;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int _id) {
		id = _id;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String _nom) {
		nom = _nom;	
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

	@Override
	public void setTelephone(String _telephone) {
		telephone = _telephone;
	}

	@Override
	public String getAdresse() {
		return adresse;
	}

	@Override
	public void setAdresse(String _adresse) {
		adresse = _adresse;
	}

	@Override
	public int getNbPlaces() {
		
		return nbPlaces;
	}

	@Override
	public void setNbPlaces(int n) {
		nbPlaces = n;
		
	}
	
	@Override
	public String getVille() {
		return ville;
	}
	
	@Override
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	@Override
	public List<PlatPerso_itf> getCarte() {
		return carte;
	}
	
	@Override
	public void setCarte(List<PlatPerso_itf> carte) {
		this.carte = carte;
	}
	
	@Override
	public List<QI_Stock> getStock() {
		return stock;
	}

	@Override
	public void setStock(List<QI_Stock> stock) {
		this.stock = stock;
	}
	
	@Override
	public boolean addStockItem(QI_Stock q) {
		return stock.add(q);
	}

	@Override
	public boolean removeStockItem(QI_Stock q) {
		return stock.remove(q);
	}

	@Override
	public List<Creneau_itf> getOuvertA() {
		return ouvertA;
	}
	
	@Override
	public void setOuvertA(List<Creneau_itf> ouvertA) {
		this.ouvertA = ouvertA;
	}
	
	@Override
	public List<Commande_itf> getCommandes() {
		return commandes;
	}
	
	@Override
	public void setCommandes(List<Commande_itf> commandes) {
		this.commandes = commandes;
	}
	
	@Override
	public void setDescription(String description) {
		description = description;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public List<Gerant_itf> getGerants() {
		return gerants;
	}

	@Override
	public void setGerants(List<Gerant_itf> u) {
		gerants = u;
	}

	@Override
	public boolean addGerant(Gerant_itf p) {
		return this.getGerants().add(p);
	}

	@Override
	public boolean removeGerant(Gerant_itf p) {
		
		return gerants.remove(p);
	}


	public String toString(){
		return "Restaurant "+ nom + "\n"+ 
			"Situé à l'adresse : "+adresse + " "+ville + "\n" +
			" Numéro de Téléphone : "+ telephone +"\n"+
			" Nombre de places : " + nbPlaces;
	}

}
