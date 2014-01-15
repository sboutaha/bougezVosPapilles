
public class Gerant extends Utilisateur implements Gerant_itf, MetierElement{

	Restaurant_itf restaurant;
	
	public String toString() {
		return "Gerant restaurant: " + getRestaurant() + "identifiant " + getNom();
	}
	@Override
	public void setRestaurant(Restaurant_itf r) {
		// TODO Auto-generated method stub
		restaurant = r;
	}

	@Override
	public Restaurant_itf getRestaurant() {
		// TODO Auto-generated method stub
		return restaurant;
	}

}
