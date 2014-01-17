package commandesEnLigne;


public class Ingredient implements Ingredient_itf, MetierElement{

	String nom;
	
	public Ingredient() {
		this(new String());
	}
	
	public Ingredient(String _nom) {
		nom = _nom;
	}
	
	@Override
	public void setNom(String _nom) {
		
		nom = _nom;
	}

	@Override
	public String getNom() {
	
		return nom;
	}

}
