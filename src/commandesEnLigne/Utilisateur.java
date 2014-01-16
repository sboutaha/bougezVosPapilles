package commandesEnLigne;


public class Utilisateur implements Utilisateur_itf, MetierElement{

	String nom;
	String prenom;
	String email;
	String identifiant;
	String motDePasse;
	
	public Utilisateur() {
		this(new String(), new String(), new String(), new String(), new String());
	}
	
	public Utilisateur(String _nom, String _prenom, String mail, String id, String mdp) {
		nom = _nom;
		prenom = _prenom;
		email = mail;
		identifiant = id;
		motDePasse = mdp;
	}
	
	@Override
	public void setNom(String toto) {
		// TODO Auto-generated method stub
		nom = toto;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public void setPrenom(String toto) {
		// TODO Auto-generated method stub
		prenom = toto;
	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return prenom;
	}

	@Override
	public void setEmail(String mail) {
		// TODO Auto-generated method stub
		email = mail;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public void setIdentifiant(String id) {
		// TODO Auto-generated method stub
		identifiant = id;
	}

	@Override
	public String getIdentifiant() {
		// TODO Auto-generated method stub
		return identifiant;
	}

	@Override
	public void setMotDePasse(String mdp) {
		// TODO Auto-generated method stub
		motDePasse = mdp;
	}

	@Override
	public String getMotDePasse() {
		// TODO Auto-generated method stub
		return motDePasse;
	}

}
