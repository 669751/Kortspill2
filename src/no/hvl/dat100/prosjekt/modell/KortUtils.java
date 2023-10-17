package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START
//		Kort[] hentsamling = samling.getSamling();
		int hentant = samling.getAntalKort()-1;
//		KortSamling sotert = new KortSamling();

		for (int i = 0; i < hentant; i++) {
			if (samling.getSamling()[i].compareTo(samling.getSamling()[i + 1]) > 0 /* &&j<hentant-1 */) {
				Kort temp = samling.getSamling()[i];
				samling.getSamling()[i] = samling.getSamling()[i + 1];
				samling.getSamling()[i + 1] = temp;

//				sotert.leggTil(hentsamling[minstpos]);
//				System.out.println(hentsamling[minstpos].toString());

			}
			

		}
//		samling = sotert;

		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		//
		Random rand = new Random();
		for (int i = samling.getAntalKort() - 1; i > 0; i--) {
			int randplass = rand.nextInt(i + 1);

			Kort temp = samling.getSamling()[i];
			samling.getSamling()[i] = samling.getSamling()[randplass];
			samling.getSamling()[randplass] = temp;

		}

		// Kanskje med bruk av random og sjekke om posisjonen har noe objekt i en ny
		// bunke
//		if (samling.getAntalKort() <= 1) {
//			System.out.println("Stokker ikke, siden samlingen er ikke stort nokk");
//		} else {
//			KortSamling stokk = samling;
//			for (Kort k : stokk.getSamling()) {
//				k = null;
//			}
//			Random rand = new Random();
////		int hentantall = samling.getAntalKort();
//			for (int i = 0; i < samling.getAntalKort(); i++) {
//				int randomplass = rand.nextInt(samling.getAntalKort()-1);
//				while (/*stokk.getSamling()[randomplass] == samling.getSamling()[i]
//						&&*/ stokk.getSamling()[randomplass] != null) {
//					randomplass = rand.nextInt(samling.getAntalKort() - 1);
//					System.out.println(randomplass);
//				}
//				stokk.getSamling()[randomplass] = samling.getSamling()[i];
//			}
//			samling = stokk;
//		}
//		KortSamling stokk = new KortSamling();
//		for(int i=0; i<samling.getAntalKort();i++) {
//		int plassering = 0; /*(int) (Math.random()*(samling.getAntalKort()-1));*/
//		
//			while(stokk.getSamling()[plassering]!=null) {
//				plassering =(int) (Math.random()*(samling.getAntalKort()-1));
//			}
//			stokk.getSamling()[plassering]=samling.getSamling()[i];
//
//			
//		}
//		samling =stokk;
//
//			// TODO - END
//	}
	}
}
