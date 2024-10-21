package histoire;

import personnages.Commercant;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Ronin ronin = new Ronin("Roro", "shochu", 60);
		ronin.donner(marco);
		
	}

}
