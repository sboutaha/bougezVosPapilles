
public class Adresse implements Adresse_itf, MetierElement {

	String ville;
	String voie;
	
	public Adresse() {
	}
	
	public Adresse(String _voie, String _ville) {
		voie = _voie;
		ville = _ville;
	}
	
	@Override
	public String getVille() {
		// TODO Auto-generated method stub
		return ville;
	}

	@Override
	public void setVille(String v) {
		// TODO Auto-generated method stub
		ville = v;
	}

	@Override
	public String getVoie() {
		// TODO Auto-generated method stub
		return voie;
	}

	@Override
	public void setVoie(String v) {
		// TODO Auto-generated method stub
		voie = v;
	}

}
