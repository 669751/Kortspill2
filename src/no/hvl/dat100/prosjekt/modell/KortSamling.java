package no.hvl.dat100.prosjekt.modell;

//import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene.
 * Når programmet er ferdig settes denne til 13, men under utvikling / testing
 * kan det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {

		samling = new Kort[MAKS_KORT];

		// hvorfor null? Fordi vi lager tom samling først med 0 antall. Husk å bruk
		// antall som pos
		antall = 0;

	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være full.
	 * Kortene ligger sammenhengende fra starten av tabellen. Kan få tilgang til
	 * antallet ved å bruke metoden getAntallKort(). Metoden er først og fremst ment
	 * å brukes i testklasser. Om man trenger kortene utenfor, anbefales metoden
	 * getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {

		return samling;
	}

	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {

		return antall;
	}

	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		boolean tom = false;
		if (this.antall == 0) {
			tom = true;
		}
		return tom;
//		return antall ==0;
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
//		if(har(kort)) {
//			
//		}
		if (antall < samling.length) {
//		if (har(kort)) {
//			System.out.println("Samlingen har kortet allerede!");
//		} else {
			samling[antall] = kort;
			antall++;

		}
//		else {
//			System.out.println("går ikke!");
//		}
//		}
	}

	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {

		antall = 0;
//		fjernAlle();
		for (Kortfarge f : Kortfarge.values()) {
			for (int v = 1; v <= Regler.MAKS_KORT_FARGE; v++) {
				leggTil(new Kort(f, v));
			}

		}
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {

		samling = new Kort[MAKS_KORT];
		antall = 0;

//		for (Kort k : samling) {
//			k = null;
////			antall--;
//		}
//		antall=0;
	}

	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga
	 *         er tom, returneres null.
	 */
	public Kort seSiste() {
		if (erTom()) {
			return null;
		} else {
			return this.samling[getAntalKort() - 1];
		}
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres null.
	 */
	public Kort taSiste() {
		Kort siste;
		if (getAntalKort() == 0) {
			return null;
		} else {
			int sistepos = getAntalKort() - 1;
			siste = samling[sistepos];
			samling[sistepos] = null;
			antall--;
		}
		return siste;

	}

	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		boolean harkort = false;
		int j = 0;
		if(erTom()) {
//			throw new IllegalArgumentException("samlingen er tom");
			return harkort;
		}

		while (j < antall && !harkort) {
			if (/* samling[j].equals(kort) && */ samling != null && kort != null
					&& samling[j].getFarge() == kort.getFarge() && samling[j].getVerdi() == kort.getVerdi()) {
				harkort = true;
			}
			j++;
		}

		return harkort;

	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga, skjer
	 * ingenting med samilingen
	 * 
	 * @param kort kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *             ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */

	public boolean fjern(Kort kort) {

//		boolean Fjernet = false;
//		for (int e = 0; e < MAKS_KORT; e++) {
//			if (samling[e] != null && kort == samling[e]) {
//				samling[e] = null;
//				Fjernet = true;
//				antall--;
//				return Fjernet;
//			}
//		}
//		return Fjernet;
//	}

	// kan også bruke har()
//		if(har(kort)) {

//		for (Kort k : samling) {
//			if (k == kort) {
//				k = null;
//				antall--;
//				return true;
//			}
//			else {
//				System.out.println("Kortet du ønsker å fjerne finnes ikke i kortsamlingen");
//			}
//		
//		}
//		return false;
//
//	}
		boolean fjern = false;
		
//		int teller =0;
//		
//		while(teller< antall) {
//			if(samling[teller] == kort && !fjern) {
//				int teller2 = teller;
//				
//				while(teller2< antall-1) {
//					samling[teller2]=samling[teller2+1];
//					teller2++;
//					teller++;
//				}
//				
//				
//			}
//		}
		
		for (int i = 0; i < antall; i++) {
			

			if (samling[i] == kort && !fjern) {

				samling[i] =null;
				
//				if (i < antall - 1) {
//					
//					//kanskje det kødder til her med blidet på kort?
//					samling[i] = samling[i + 1];
//				} else {
//					samling[i] = null;
//				
//				}
				while(i<antall-1) {
					samling[i]=samling[i+1];
					i++;
				}
				antall--;
				fjern=true;
				return fjern;
				
//				antall--;
//				fjern = true;
//				return fjern;
			}

		}
//		KortUtils.sorter(this);
//		if(fjern==true) {
//			antall--;
//		}
		return fjern;
	}

	// TODO - END

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {

		// Må kanskje flytte getSamling koden hit
		// TODO - START
		int samlengde = getAntalKort();
		Kort[] gsamling = new Kort[samlengde];
		for (int i = 0; i < samlengde; i++) {
			gsamling[i] = samling[i];
		}
		return gsamling;

		// TODO - END

	}
	

}
