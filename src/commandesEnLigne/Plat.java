package commandesEnLigne;

import java.util.ArrayList;
import java.util.List;


public class Plat implements Plat_itf, MetierElement {

	String nom;
	List<PlatPerso_itf> persos;
	
	public Plat() {
		this(new String(),new ArrayList<PlatPerso_itf>());
	}
	
	public Plat(String _nom) {
		this(_nom, new ArrayList<PlatPerso_itf>());
	}
	
	public Plat(String _nom, List<PlatPerso_itf> p) {
		nom = _nom;
		persos = p;
	}
	
	@Override
	public void setNom(String _nom) {
		
		nom = _nom;
	}

	@Override
	public String getNom() {
		
		return nom;
	}

	@Override
	public void setPersos(List<PlatPerso_itf> ps) {
	
		persos = ps;
	}

	@Override
	public List<PlatPerso_itf> getPersos() {
		
		return persos;
	}

	@Override
	public boolean addPerso(PlatPerso_itf p) {
		
		return persos.add(p);
	}

	@Override
	public boolean removePerso(PlatPerso_itf p) {
		
		return persos.remove(p);
	}
	


}
