package restaurant;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Singleton
public class GestionCommandesManager implements GestionCommandesManagerItf{
	
	@PersistenceContext
	EntityManager ent;
	
	@Override
	public List<Restaurant_itf> getListeRestaurants() {
		List<Restaurant_itf> lr = ent.createQuery("from restaurant.Restaurant_itf", Restaurant_itf.class).getResultList();
		return lr;	
	}
	public Restaurant_itf getRestaurant(String nom) {
		return null;
	}
	
	public void addRestaurant(Restaurant_itf r){
		ent.persist(r);
	}

}