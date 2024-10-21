package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yaku);
	}

}
