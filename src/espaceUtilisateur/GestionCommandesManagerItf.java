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

	Hashtable<Integer, Restaurant_itf> getTableRestaurants();
	Restaurant_itf getRestaurant(int id);
	
	void addRestaurant(Restaurant_itf r);
	void initRestaurant();
	void choisirRestaurant(int id);

}