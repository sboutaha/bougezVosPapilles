package commandesEnLigne;


public class QI_Stock extends QuantiteIngredient {
	
	Restaurant_itf restaurant;
	
	public Restaurant_itf getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant r){
		restaurant = r;
	}

}
