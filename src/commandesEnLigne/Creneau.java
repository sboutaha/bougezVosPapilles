package commandesEnLigne;


public class Creneau implements Creneau_itf, MetierElement {

	Horaire_itf heureDebut;
	Horaire_itf heureFin;
	
	public Creneau() {
	}
	
	public Creneau(Horaire_itf hD, Horaire_itf hF) {
		heureDebut = hD;
		heureFin = hF;
	}
	
	@Override
	public Horaire_itf getHeureDebut() {
		// TODO Auto-generated method stub
		return heureDebut;
	}

	@Override
	public void setHeureDebut(Horaire_itf h) {
		// TODO Auto-generated method stub
		heureDebut = h;
	}

	@Override
	public Horaire_itf getHeureFin() {
		// TODO Auto-generated method stub
		return heureFin;
	}

	@Override
	public void setHeureFin(Horaire_itf h) {
		// TODO Auto-generated method stub
		heureFin = h;
	}

}
