package commandesEnLigne;

import javax.persistence.*;

@Entity
public class Gerant extends Utilisateur implements Gerant_itf, MetierElement{

	@OneToOne
	Restaurant_itf restaurant;
	
	public String toString() {
		return "Gerant restaurant: " + getRestaurant() + "identifiant " + getIdentifiant();
	}
	@Override
	public void setRestaurant(Restaurant_itf r) {
		
		restaurant = r;
	}

	@Override
	public Restaurant_itf getRestaurant() {
		
		return restaurant;
	}

}
