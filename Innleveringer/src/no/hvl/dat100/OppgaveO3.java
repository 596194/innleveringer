package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String tallInn = showInputDialog("Heltall: ");
		int tall = parseInt(tallInn);
		int total = 1;
		
		for (int i = 1; i <= tall; i++) {
			total = total*i;
				
		}
		System.out.println(total);
		
		}
	
	}