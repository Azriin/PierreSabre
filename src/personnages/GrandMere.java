package personnages;

public class GrandMere extends Humain{

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < 5) {
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		} else {
			System.out.println("Oh ma t�te ! Je ne peux plus retenir le nom d'une personne suppl�mentaire !");
			for (int i = 1; i < 5; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance-1] = humain;
		}
	}
	
	private enum TypeHumain{
		COMMERCANT("Commer�ant"), RONIN("Ronin");
		
	}
	
	private void String humainHasard() {
		
	}
}
