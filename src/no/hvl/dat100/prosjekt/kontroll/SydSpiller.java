package no.hvl.dat100.prosjekt.kontroll;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;
import no.hvl.dat100.prosjekt.kontroll.spill.Handling;
import no.hvl.dat100.prosjekt.kontroll.spill.HandlingsType;
import no.hvl.dat100.prosjekt.kontroll.spill.Spillere;
import no.hvl.dat100.prosjekt.modell.Kort;
import no.hvl.dat100.prosjekt.modell.KortSamling;

/**
 * Klasse som for å representere en vriåtter syd-spiller. Strategien er å lete
 * gjennom kortene man har på hand og spille det første som er lovlig.
 *
 */
public class SydSpiller extends Spiller {

	/**
	 * Konstruktør.
	 * 
	 * @param spiller
	 *            posisjon for spilleren (nord eller syd).
	 */
	public SydSpiller(Spillere spiller) {
		super(spiller);
	}

	/**
	 * Metode for å implementere strategi. Strategien er å spille det første
	 * kortet som er lovlig (også en åtter selv om man har andre kort som også
	 * kan spilles). Dersom man ikke har lovlige kort å spille, trekker man om
	 * man ikke allerede har trukket maks antall ganger. I så fall sier man
	 * forbi.
	 * 
	 * @param topp
	 *            kort som ligg øverst på til-bunken.
	 */
	@Override
	public Handling nesteHandling(Kort topp) {
		
		Handling nesteh = null;
		Kort[] handen =getHand().getAllekort();
		Kort lovlig = null;
        for (Kort kort : handen) {
            if (Regler.kanLeggeNed(kort, topp)) {
                lovlig = kort;
                break;
            }
        }

        if (lovlig != null) {
            nesteh = new Handling(HandlingsType.LEGGNED, lovlig);
            
        } else if (getAntallTrekk() < Regler.maksTrekk()) {
            nesteh = new Handling(HandlingsType.TREKK, null);
            
        } else {
            nesteh = new Handling(HandlingsType.FORBI, null);
        }
    	return nesteh;

    }


		// TODO - START
		/* first-fit strategi */
		
		
//		Kort [] hand = getHand().getAllekort();
//		KortSamling lov = new KortSamling();
//		KortSamling attere = new KortSamling();
//		
////		sjekker og legger til hvilke kort vi kan spille
//		for(Kort k: hand) {
//			if(Regler.kanLeggeNed(k, topp)) {
//				if(Regler.atter(k)) {
//					attere.leggTil(k);
//				}
//				else {
//					lov.leggTil(k);
//				}
//			}
//		}
//		
//		Kort spill = null;
//		Kort[] kanSpilles = null;
//
//		if (!lov.erTom()) {
//			kanSpilles = lov.getAllekort();
//		} else if (!attere.erTom())  {
//			kanSpilles = attere.getAllekort();
//		}
//
//		Handling handling = null;
//		
//		if (kanSpilles != null) {
//			
//			Random rand = new Random();
//			int p = rand.nextInt(kanSpilles.length);
//			spill = kanSpilles[p];
//			handling = new Handling(HandlingsType.LEGGNED, spill);
//			// setAntallTrekk(0);
//			
//		} else if (getAntallTrekk() < Regler.maksTrekk()) {
//			handling = new Handling(HandlingsType.TREKK, null);
//		} else {
//			handling = new Handling(HandlingsType.FORBI, null);
//			// setAntallTrekk(0);
//		}
//
//		return handling;
		
	
	
		// TODO - END
	}
	
//}
