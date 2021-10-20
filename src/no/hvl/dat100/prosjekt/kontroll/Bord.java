package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;


/**
 * Klasse som implementerer bordet som spilles på. 
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til å representere 
 * kortene som er i de to bunker på border. 
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;
	
	/**
	 * Metoden oppretter to bunker, til- og fra-bunken
	 * Alle kortene legges til fra-bunken. 
	 */
	public Bord() {

		bunkeTil = new KortSamling();
		bunkeFra = new KortSamling();
		bunkeFra.leggTilAlle();
		// TODO - START
		//opprette to til- og fra-bunke
		//metoden getAlleKort for � legge de i bunkeFra?
		

		
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
		//return 

		return bunkeTil.erTom();
	
//		boolean tom=false;
//		if (bunkeTil==null) {
//			tom=true;
//		}
//		return tom;	
//		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {
		
		// TODO - START
		return bunkeFra.erTom();
	
//		throw new UnsupportedOperationException(TODO.method());
	
		// TODO - END
		
	}
	
	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {
		
		// TODO - START
		
		return bunkeFra.getAntalKort();
		
//		throw new UnsupportedOperationException(TODO.method());

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
		
		
//		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}
	
	/**
	 * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	public void vendOversteFraBunke() {
		
		// TODO - START
		
		//fjern fra
		//leggtil til
		Kort v = bunkeFra.taSiste();
		
		bunkeTil.leggTil(v);
		
//		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
		
	}
		
	/**
	 * Tar øverste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */
	
	public Kort taOversteFraBunke() {
		
		// TODO - START
		return bunkeFra.taSiste();
		
//		throw new UnsupportedOperationException(TODO.method());

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
		
		return bunkeTil.seSiste();
		
//		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
//		Kort k = bunkeTil.taSiste();//lagrer det siste kortet i bunkeTil i "Kort k"
	}
	
	/**
	 * Når fra-bunken blir tom, tar man vare på kortet pÂ toppen av til-bunken.
	 * Deretter legges alle de andre kortene i til-bunken over i fra-bunken.
	 * Denne stokkes og kortet som man har tatt vare pÂ legges tilbake i
	 * til-bunken. Det vil nå være det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		Kort v = bunkeTil.taSiste(); //tar det �verste fra bunkeTil og lagrer det i "Kort v"
		int ant = bunkeTil.getAntalKort();//lagrer antall kort i bunkeTil i "int ant"

		for (int i = 0; i < ant; i++) {
			bunkeFra.leggTil(bunkeTil.taSiste());//tar det �verste kortet i bunkeTil og 
			                                     //legger det inn i bunkeFra
		}
		KortUtils.stokk(bunkeFra);//stokker bunkeFra
		bunkeTil.leggTil(v);//legger "Kort v" til i bunkeTil
	}
		
	/**
	 * Metode som legger et kort i til-bunken. 
	 * 
	 * @param k
	 * 			kort som skal legges ned. 
	 * 	
	 */
	public void leggNedBunkeTil(Kort k) {
		
		bunkeTil.leggTil(k);

				
	}
}
