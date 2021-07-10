package ljubavniKalkulator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import alati.Unosi;

public class LjubavniKalkulator {

	public LjubavniKalkulator() {

		String ona, on;
		String sveZajednoBezRazmaka;
		// ovdje �e se pohraniti po�etni niz znakova
		// kako bi se iz njega dobio proj pojava svakog znaka
		List<Character> nizSvihZnakova = new ArrayList<Character>();
		// ovdje �e se pohranjivati brojevi za izra�un
		List<Integer> pocetniNizBrojeva = new ArrayList<Integer>();

		// unos imena i micanje razmaka
		ona = Unosi.JOPDialogStringIsEmpty("Unesi njeno ime", "Unos ne mo�e biti prazan").replaceAll("\\s", "");
		on = Unosi.JOPDialogStringIsEmpty("Unesi njegovo ime", "Unos ne mo�e biti prazan").replaceAll("\\s", "");

		sveZajednoBezRazmaka = ona + on;

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

	private static void zbroji(List<Integer> nizBrojeva) {

		// privjera ima li u nizu broj ve�i od 10 pa da se razlomi na 2
		List<Integer> provjereniNizBrojeva = new ArrayList<Integer>();

		for (int brojZaProvjeru : nizBrojeva) {
			if (brojZaProvjeru > 9) {
				provjereniNizBrojeva.add(brojZaProvjeru / 10);
				int ostatak = brojZaProvjeru % 10;
				if (ostatak != 0) {
					provjereniNizBrojeva.add(ostatak);
				}
			} else {
				provjereniNizBrojeva.add(brojZaProvjeru);
			}
		}

		// veli�ina niza za provjeru kao uvjet izlaska iz rekurzije
		int velicinaNiza = provjereniNizBrojeva.size();

		// ako je veli�ina niza 3 ili manje
		// prvo provjeri je li broj ve�i od 100
		// ako je 100 ili manje
		// ispi�i rezultat
		if (velicinaNiza < 3 && jeLiManjiOd100(provjereniNizBrojeva)) {

			System.out.print(listToInt(provjereniNizBrojeva));

		} else { // u suprotnom zavrti opet

			// novi niz koji �e se vra�ati u rekurziju ili na kraju u ispis
			List<Integer> noviNiz = new ArrayList<Integer>();

			// ako je paran broj elemenata u nizu
			if (velicinaNiza % 2 == 0) {

				iterirajParno(velicinaNiza, provjereniNizBrojeva, noviNiz);

			} else { // ako je neparan broj elemenata u nizu

				iterirajNeparno(velicinaNiza, provjereniNizBrojeva, noviNiz);

			}
			zbroji(noviNiz);
		}

	}

	// metoda za iteriranje niza ako on sadr�i neparan broj elemenata
	private static void iterirajNeparno(int velicinaNiza, List<Integer> provjereniNizBrojeva, List<Integer> noviNiz) {
		// iteriraj do polovice veli�ine niza
		int breakpoint = velicinaNiza / 2;

		for (int i = 0; i <= breakpoint; i++) {

			int zadnji = (velicinaNiza - i) - 1;

			if (i == zadnji) {
				// ako je index i isti kao i index zadnji
				// zna�i da je ostao samo jedan broj u nizu
				// koji nije obra�en i onda samo njega dodaj u novi niz
				noviNiz.add(provjereniNizBrojeva.get(i));

			} else {
				// u suprotnom zbroji vanjske i dodaj u niz
				noviNiz.add(provjereniNizBrojeva.get(i) + provjereniNizBrojeva.get(zadnji));

			}

		}

	}

	// metoda za iteriranje niza ako on sadr�i paran broj elemenata
	private static void iterirajParno(int velicinaNiza, List<Integer> provjereniNizBrojeva, List<Integer> noviNiz) {
		// iteriraj do polovice veli�ine niza -1
		int breakpoint = (velicinaNiza / 2) - 1;

		for (int i = 0; i <= breakpoint; i++) {
			int zadnji = (velicinaNiza - i) - 1;
			// zbroji vanjske i dodaj u niz
			noviNiz.add(provjereniNizBrojeva.get(i) + provjereniNizBrojeva.get(zadnji));

		}

	}

	// metoda za provjeru je li rezultat manji manji od 100
	private static boolean jeLiManjiOd100(List<Integer> nizBrojeva) {

		// pretvaranje liste u broj
		int ukupno = listToInt(nizBrojeva);

		if (ukupno <= 100) {
			return true;
		} else {
			return false;
		}

	}

	// metoda za pretvaranje liste brojeva u jedan broj
	private static int listToInt(List<Integer> nizBrojeva) {

		int brojKojegSeVraca = 0;
		for (Integer broj : nizBrojeva) {
			brojKojegSeVraca = (brojKojegSeVraca * 10) + broj;
		}

		return brojKojegSeVraca;
	}

	// metoda za prebrojavanje pojava odre�enog znaka u nizu
	private static int prebrojiZnakove(char znak, List<Character> nizZnakova) {
		int brojPojava = 0;
		for (char pojediniZnak : nizZnakova) {
			if (pojediniZnak == znak) {
				brojPojava++;
			}
		}
		return brojPojava;
	}

	public static void main(String[] args) {
		try {
			new LjubavniKalkulator();
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Ups! Dogodila se pogre�ka");
		}
		
	}

}
