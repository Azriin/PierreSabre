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
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			honneur += 1;
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			honneur -= 1;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}
	
}
