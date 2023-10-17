package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles på.
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til å
 * representere kortene som er i de to bunker på border.
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;

	/**
	 * Metoden oppretter to bunker, til- og fra-bunken Alle kortene legges til
	 * fra-bunken.
	 */
	public Bord() {

		// TODO - START
		bunkeFra = new KortSamling();
		bunkeTil = new KortSamling();
		bunkeFra.leggTilAlle();

//		throw new UnsupportedOperationException(TODO.constructor("Bord"));
		// TODO - END
	}

	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public KortSamling getBunkeTil() {

		return bunkeTil;

	}

	/**
	 * Gir peker/referanse til fra-bunken.
	 * 
	 * @return referanse/peker til fra-bunken.
	 */
	public KortSamling getBunkeFra() {

		return bunkeFra;

	}

	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {

		// TODO - START
//		if (bunkeTil.erTom()) {
//			return true;
//		}
//		return false;
//		// TODO - END
		return bunkeTil.erTom();
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {

//		// TODO - START
//
//		if (bunkeFra.erTom()) {
//			return true;
//		}
//		return false;
//		// TODO - END
		return bunkeFra.erTom();

	}

	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {

		// TODO - START
		return bunkeFra.getAntalKort();

		// TODO - END
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {

		// TODO - START
		return bunkeTil.getAntalKort();

		// TODO - END
	}

	/**
	 * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	public void vendOversteFraBunke() {

		// TODO - START
		bunkeTil.leggTil(taOversteFraBunke());
		// TODO - END

	}

	/**
	 * Tar øverste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */

	public Kort taOversteFraBunke() {

		// TODO - START
//		Kort takort = bunkeFra.getSamling()[antallBunkeFra()-1];
//		// skal man fjerne kortet?
//		bunkeFra.fjern(takort);
//		return takort;
		return bunkeFra.taSiste();

		// TODO - END
	}

	/**
	 * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
	 * øverst i til-bunken etter at metoden er utført.
	 * 
	 * @return peker/referanse til øverste kortet i til-bunken.
	 */
	public Kort seOversteBunkeTil() {

		// TODO - START
//		return bunkeTil.getSamling()[0];
		return bunkeTil.seSiste();
		// TODO - END
	}

	/**
	 * Når fra-bunken blir tom, tar man vare på kortet pÂ toppen av til-bunken.
	 * Deretter legges alle den andre kortene i til-bunken over i fra-bunken. Denne
	 * stokkes og kortet som man har tatt vare pÂ legges tilbake i til-bunken. Det
	 * vil nå være det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		if (bunkeTil.getAntalKort() <= 1) {
			throw new IllegalArgumentException(" du kan ikke gjøre om bunken");
		}
		// ta vare på øverste til kort og fjerner fra bunketiil
		Kort overst = bunkeTil.taSiste();

		// må stokke kortet til -> fra
		while (bunkeTil.getAntalKort() != 0) {
			bunkeFra.leggTil(bunkeTil.taSiste());

			
			
 		}

		// legger tilbake øverste kort i den tomme til bunken
		bunkeTil.leggTil(overst);
		KortUtils.stokk(bunkeFra);

		// TODO - END
	}

	/**
	 * Metode som legger et kort i til-bunken.
	 * 
	 * @param k kort som skal legges ned.
	 * 
	 */
	public void leggNedBunkeTil(Kort k) {

		// TODO - START
		// skal det leges på en spesiell måte?
		bunkeTil.leggTil(k);
		// TODO - END

	}
}
