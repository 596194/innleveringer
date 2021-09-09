package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		int karF = 39;
		int karE = 49;
		int karD = 59;
		int karC = 79;
		int karB = 89;
		int karA = 100;
		
		int i = 1;
		
		do {
			String poengInput = showInputDialog("Skriv inn score 0-100");
			int poeng = parseInt(poengInput);
			
			String karakter = null;
			
			if (poeng <= karF) {
				karakter = "F";
			}
			else if (poeng >karF && poeng <=karE) {
				karakter = "E";
			}
			else if (poeng >karE && poeng <=karD) {
				karakter = "D";
			}
			else if (poeng >karD && poeng <=karC) {
				karakter = "C";
			}
			else if (poeng >karC && poeng <=karB) {
				karakter = "B";
			}
			else if (poeng >karB && poeng <=karA) {
				karakter = "A";
			}
			else {
				karakter = "Gylding tall er 0-100";
			}
			System.out.println("Karakter: " + karakter);
			
			i++;
		}
		while (i <=10);

		}
}