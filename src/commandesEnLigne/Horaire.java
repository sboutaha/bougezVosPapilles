package commandesEnLigne;


public class Horaire implements Horaire_itf, MetierElement {

	int heures;
	
	public Horaire() {	
	}
	
	public Horaire(int h) {
		assert(h>0 && h<24);
		heures = h;
	}
	
	public String toString() {
		return heures+"h";
	}
	
	@Override
	public int getHeures() {
		// TODO Auto-generated method stub
		return heures;
	}

	@Override
	public void setHeures(int h) {
		// TODO Auto-generated method stub
		heures = h;
	}

	@Override
	public int getMinutes() {
		// TODO Auto-generated method stub
		return heures;
	}

	@Override
	public void setMinutes(int h) {
		// TODO Auto-generated method stub
	}

}
