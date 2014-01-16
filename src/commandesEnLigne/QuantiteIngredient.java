package commandesEnLigne;


public abstract class QuantiteIngredient implements QuantiteIngredient_itf, MetierElement {

	int quantite;
	Ingredient_itf ing;
	
	@Override
	public int getQuantite() {
		// TODO Auto-generated method stub
		return quantite;
	}

	@Override
	public void setQuantite(int q) {
		// TODO Auto-generated method stub
		quantite = q;
	}

	@Override
	public Ingredient_itf getIngredient() {
		// TODO Auto-generated method stub
		return ing;
	}

	@Override
	public void setIngredient(Ingredient_itf _ing) {
		// TODO Auto-generated method stub
		ing = _ing;
	}

}
