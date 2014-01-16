package espaceUtilisateur;

import commandesEnLigne.*;
import java.io.IOException;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ejb.*;

@Remote
public interface GestionCommandesManagerItf {

	Hashtable<Integer, Restaurant_itf> getListeRestaurants();
	Restaurant_itf getRestaurant(String nom);
	
	void addRestaurant(Restaurant_itf r);
	void initRestaurant();

}