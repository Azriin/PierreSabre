package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public int getHonneur() {
		return honneur;
	}
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (getArgent()*0.10);
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		beneficiaire.recevoirArgent(don);
	}
	
}
