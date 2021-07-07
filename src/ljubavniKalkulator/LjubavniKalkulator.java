package ljubavniKalkulator;

import java.util.ArrayList;

import alati.Unosi;

public class LjubavniKalkulator {

	public LjubavniKalkulator() {

		String ona, on;
		String sveZajednoBezRazmaka;
		// ovdje �e se pohraniti po�etni niz znakova
		// kako bi se iz njega dobio proj pojava svakog znaka
		ArrayList<Character> nizSvihZnakova = new ArrayList<Character>();
		// ovdje �e se pohranjivati brojevi za izra�un
		ArrayList<Integer> pocetniNizBrojeva = new ArrayList<Integer>();

		// unos imena
		ona = Unosi.JOPDialogString("Unesi njeno ime");
		on = Unosi.JOPDialogString("Unesi njegovo ime");

		// micanje razmaka i spajanje u jedan string
		sveZajednoBezRazmaka = ona.replaceAll("\\s", "") + on.replaceAll("\\s", "");

		// pretvaranje u array list
		for (char znak : sveZajednoBezRazmaka.toCharArray()) {
			nizSvihZnakova.add(znak);
		}

		// prebrojavanje pojava i pravljenje po�etnog niza za zbrajanje
		for (char broj : nizSvihZnakova) {
			pocetniNizBrojeva.add(prebrojiZnakove(broj, nizSvihZnakova));
		}
		
		System.out.print(ona + " i " + on + " se vole ");
		zbroji(pocetniNizBrojeva);
		System.out.print("%");
		
	}

	private void zbroji(ArrayList<Integer> nizBrojeva) {

		
		// privjera ima li u nizu broj ve�i od 10 pa da se razlomi na 2
		ArrayList<Integer> provjereniNizBrojeva = new ArrayList<Integer>();
		
		for(int brojZaProvjeru : nizBrojeva) {
			if(brojZaProvjeru>9) {
				provjereniNizBrojeva.add(10);
				provjereniNizBrojeva.add(brojZaProvjeru-10);
			}else {
				provjereniNizBrojeva.add(brojZaProvjeru);
			}
		}
		
		// veli�ina niza za provjeru kao uvjet izlaska iz rekurzije
		int velicinaNiza = provjereniNizBrojeva.size();

		// ako je veli�ina niza 3 ili manje
		// prvo provjeri je li broj ve�i od 100
		// ako je 100 ili manje
		// ispi�i rezultat
		if (velicinaNiza<3 && jeLiManjiOd100(provjereniNizBrojeva)) {
			
			System.out.print(arrayListToInt(provjereniNizBrojeva));
			
		
		} else { // u suprotnom zavrti opet

			// novi niz koji �e se vra�ati u rekurziju ili na kraju u ispis
			ArrayList<Integer> noviNiz = new ArrayList<Integer>();

			// ako je paran broj elemenata u nizu
			if (velicinaNiza % 2 == 0) {
				
				// iteriraj do polovice veli�ine niza -1
				int breakpoint = (velicinaNiza / 2) - 1;
				
				for (int i=0; i <= breakpoint; i++) {
					int zadnji = (velicinaNiza - i) - 1;
					// zbroji vanjske i dodaj u niz
					noviNiz.add(provjereniNizBrojeva.get(i) + provjereniNizBrojeva.get(zadnji)); 
					
				}

			} else { // ako je neparan broj elemenata u nizu
				
				// iteriraj do polovice veli�ine niza
				int breakpoint = velicinaNiza/2;
				
				for (int i = 0; i < breakpoint / 2; i++) {
					
					int zadnji = (velicinaNiza - i) - 1;
				
					if(i==zadnji) {
						// ako je index i isti kao i index zadnji 
						// zna�i da je ostao samo jedan broj u nizu 
						// koji nije obra�en i onda samo njega dodaj u novi niz
						noviNiz.add(provjereniNizBrojeva.get(i));
						
					}else { 
						// u suprotnom zbroji vanjske i dodaj u niz
						noviNiz.add(provjereniNizBrojeva.get(i) + provjereniNizBrojeva.get(zadnji)); 
						
					}
					
				}
				
			}
			zbroji(noviNiz);
		}

	}

	private boolean jeLiManjiOd100(ArrayList<Integer> nizBrojeva) {
		
		// pretvaranje liste u broj
		int ukupno = arrayListToInt(nizBrojeva);			
		
		if (ukupno <= 100) {
			return true;
		}else {
			return false;
		}
		
	}

	
	// metoda za pretvaranje liste brojeva u jedan broj
	private int arrayListToInt(ArrayList<Integer> nizBrojeva) {
		
		int brojKojegSeVraca = 0;
		for(Integer broj : nizBrojeva) {
			brojKojegSeVraca = (brojKojegSeVraca*10) + broj;
		}
		
		return brojKojegSeVraca;
	}

	// metoda za prebrojavanje pojava odre�enog znaka u nizu
	private int prebrojiZnakove(char znak, ArrayList<Character> nizZnakova) {
		int brojPojava = 0;
		for (char pojediniZnak : nizZnakova) {
			if (pojediniZnak == znak) {
				brojPojava++;
			}
		}
		return brojPojava;
	}

	public static void main(String[] args) {
		new LjubavniKalkulator();
	}

}
