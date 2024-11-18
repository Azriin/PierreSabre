package personnages;

import java.util.Iterator;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain [] memoire = new Humain [30];
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	protected void parler(String parole) {
		System.out.println("("+nom+")" + " - " + parole);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		}
		
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		repondre(autreHumain);
		autreHumain.memoriser(this);		
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < 30) {
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		} else {
			for (int i = 1; i < 30; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance-1] = humain;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String parole = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i < nbConnaissance; i++) {
			parole += memoire[i].getNom();
			if (i < nbConnaissance-1) {
				parole += ", ";
			}
		parler(parole);
		}
	}
}

