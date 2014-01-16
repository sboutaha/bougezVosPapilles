import java.util.List;


public interface Plat_itf {
	public void setNom(String _nom);
	public String getNom();
	public void setPersos(List<PlatPerso_itf> ps);
	public List<PlatPerso_itf> getPersos();
	public boolean addPerso(PlatPerso_itf p);
	public boolean removePerso(PlatPerso_itf p);
}
