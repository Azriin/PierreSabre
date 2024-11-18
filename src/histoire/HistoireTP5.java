package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);

		
//		marco.direBonjour();
//		roro.direBonjour();
//		marco.faireConnaissanceAvec(roro);
//		yaku.direBonjour();
//		marco.faireConnaissanceAvec(yaku);
//		chonin.direBonjour();
//		marco.faireConnaissanceAvec(chonin);
//		kumi.direBonjour();
//		marco.faireConnaissanceAvec(kumi);
//		
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();

//		akimoto.direBonjour();
//		marco.faireConnaissanceAvec(akimoto);
//		akimoto.listerConnaissance();

//		akimoto.boire("the");
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.direBonjour();
		masako.direBonjour();
		masako.ranconner(kumi);
		masako.direBonjour();
		yaku.faireConnaissanceAvec(masako);
		masako.faireLeGentil();
		masako.direBonjour();
		roro.direBonjour();
	}

}
