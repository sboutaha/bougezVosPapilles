package espaceUtilisateur;

import commandesEnLigne.*;
import java.util.Hashtable;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateful
public class GestionCommandesManager implements GestionCommandesManagerItf{
	
	//@PersistenceContext
	//EntityManager ent;
	
	Hashtable<Integer,Restaurant_itf> tr;
	
	Restaurant_itf restaurant;

	//@Override
	public Hashtable<Integer, Restaurant_itf> getListeRestaurants() {
		//List<Restaurant_itf> tr = ent.createQuery("from restaurant.Restaurant_itf", Restaurant_itf.class).getResultList();
		return tr;	
	}
	public Restaurant_itf getRestaurant(int id) {
		return tr.get(id);
	}
	
	public void addRestaurant(Restaurant_itf r){
		//ent.persist(r);
		tr.put(r.getId(), r);
	}
	
	public void choisirRestaurant(int id){
		//ent.persist(r);
		restaurant = tr.get(id);
	}
	public void initRestaurant(){
		//ent.persist(r);
		tr = new Hashtable<Integer, Restaurant_itf>();
	}

}