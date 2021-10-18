package no.hvl.dat100.prosjekt.modell;

import java.util.Iterator;
import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. RekkefÃ¸lgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		int antallKort = samling.getAntalKort();
		Kort[] impTab = samling.getSamling();
//		for (int k = 0; k < antallKort; k++) {
//			System.out.println(impTab[k]);

//		}
//        for(int i=0; i<antallKort-1;i++) {
//        	int minPos=i;
//        	for (int j=i+1; j<antallKort)
//           

		for (int i = 0; i < antallKort - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < antallKort; j++) {
				if (impTab[j].compareTo(impTab[minPos]) < 0) {
					minPos = j;
				}
			}
//			Kort f = impTab[i];
//			impTab[i] = impTab[minPos];
//			impTab[minPos] = f;

			// her skal verdiene byttes om.
			Kort f = impTab[minPos]; // lagrer verdien i indeks[i] i variabelen k
//			System.out.println("");
//			System.out.println(f);
//			System.out.println("");

			impTab[minPos] = impTab[i]; // om

//			System.out.println(impTab[i]);
//			System.out.println("");

			impTab[i] = f; // setter k inn i index j
//
//			System.out.println(impTab[minPos]);
//			System.out.println("");
//			System.out.println("");

		}

//		System.out.println("");
//		for (int i = 0; i < impTab.length; i++) {
//			System.out.println(impTab[i]);
//		}

	}
//		throw new UnsupportedOperationException(TODO.method());
	// TODO - END

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {


		Random random = new Random(); // random nummer generator

		int antallKort = samling.getAntalKort(); // lengden på tabellen
		Kort[] kortstokk = samling.getSamling(); // tabellen samling, lagret i tabellen kortstokk

		for (int i = antallKort - 1; i > 0; i--) { //løkke fra bakerste index og frem
			int index = random.nextInt(i + 1); //lagrer en random int mellom 0 og antall kort, i  index
			Kort temp = kortstokk[index]; //lagrer kortet på den random indexen i  temp
			kortstokk[index] = kortstokk[i]; // setter kortet i index [i] inn i den randome indexen
			kortstokk[i] = temp; // setter det randome kortet inn i index [i]
		}
	}

}
