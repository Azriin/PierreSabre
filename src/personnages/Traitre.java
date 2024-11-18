package personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFav, int argent) {
		super(seigneur, nom, boissonFav, argent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauTraitrise +". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner +" sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami-ami avec personne car je ne connais personne! Snif.");
		} else {
			int don = getArgent() * 1 / 20;
			int indiceAmi = (int)(Math.random()*nbConnaissance);
			parler("Il faut absolument remonter ma cote de conance. Je vais faire ami ami avec " + memoire[indiceAmi].getNom());
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			perdreArgent(don);
			memoire[indiceAmi].gagnerArgent(don);
			memoire[indiceAmi].parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise --;
			}
		}
	}
}
