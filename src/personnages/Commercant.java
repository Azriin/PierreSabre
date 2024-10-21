package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		int sommePerdu = getArgent();
		perdreArgent(sommePerdu);
		return sommePerdu;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(getArgent() + " sous ! Je te remercie généreux donateur!");
	}
	
}
