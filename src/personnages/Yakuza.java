package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public int getReputation() {
		return reputation;
	}
	
	public String getClan() {
		return clan;
	}
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J�ai piqu� les " + gain + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		this.reputation += 1;	
	}
	
	public int perdre() {
		reputation -= 1;
		int perte = getArgent();
		perdreArgent(perte);
		parler("J�ai perdu mon duel et mes " + perte + " sous, snif... J'ai d�shonor� le clan de " + clan);
		return perte;
	}
	
	public void gagner(int gain) {
		reputation += 1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai d�pouill� de ses "+ gain +" sous.");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
}
