package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class OppgaveO1 {

	public static void main(String[] args) {
		int inntektT1 = 184800;
		int inntektT2 = 260100;
		int inntektT3 = 651250;
		int inntektT4 = 1021500;
        
		double trinn0 = 0.0;
		double trinn1 = 0.017;
	    double trinn2 = 0.03;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		double totalskatt = 0;
		
		String oppgittinntekt = showInputDialog("Bruttoinntekt? ");
		double inntekt = Double.parseDouble(oppgittinntekt);
		
		if (inntekt <=inntektT1) {
			totalskatt = (inntekt*trinn0);
		}
		else if (inntekt >inntektT1 && inntekt <= inntektT2) {
			totalskatt = (inntekt - inntektT1)*trinn1;
		}
		
		else if (inntekt >inntektT2 && inntekt <= inntektT3) {
			totalskatt = ((inntektT2 - inntektT1)*trinn1) + ((inntekt - inntektT1)*trinn2);
		}
		
		else if (inntekt >inntektT3 && inntekt <= inntektT4) {
			totalskatt = ((inntektT2 - inntektT1)*trinn1) + ((inntektT3 - inntektT2)*trinn2) + ((inntekt - inntektT3)*trinn3);
		}
		
		else {
			totalskatt = ((inntektT2 - inntektT1)*trinn1) + ((inntektT3 - inntektT2)*trinn2) + ((inntektT4 - inntektT3)*trinn3) + ((inntekt-inntektT4)*trinn4);
		}
		System.out.println("Skatt: " + totalskatt);
		
		
	}

}

