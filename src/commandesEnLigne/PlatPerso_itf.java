package commandesEnLigne;

import java.util.List;


public interface PlatPerso_itf {
	public Plat_itf getPlat();
	public void setPlat(Plat p);
	
	public void setDescription(String d);
	public String getDescription();
	
	public int getPrix();
	public void setPrix(int p);
	
	public int getRestaurant();
	public void setRestaurant(Restaurant_itf r);
	
	public void setRecette(List<QuantiteIngredient_itf> laRecette);
	public List<QuantiteIngredient_itf> getRecette();
	public boolean addIngredient(QuantiteIngredient_itf qi);
	public boolean removeIngredient(QuantiteIngredient_itf qi);
	
	
}
