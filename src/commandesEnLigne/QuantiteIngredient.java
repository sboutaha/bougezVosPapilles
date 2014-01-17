package commandesEnLigne;


public abstract class QuantiteIngredient implements QuantiteIngredient_itf, MetierElement {

	int quantite;
	Ingredient_itf ing;
	
	@Override
	public int getQuantite() {
	
		return quantite;
	}

	@Override
	public void setQuantite(int q) {
		
		quantite = q;
	}

	@Override
	public Ingredient_itf getIngredient() {

		return ing;
	}

	@Override
	public void setIngredient(Ingredient_itf _ing) {
		
		ing = _ing;
	}

}
