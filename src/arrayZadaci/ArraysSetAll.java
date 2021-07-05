package arrayZadaci;

import java.util.Arrays;

public class ArraysSetAll {

	// za razliku od Arrays.fill() ova metoda
	// može za svaki element niza
	// postaviti drugu vrijednost
	public ArraysSetAll() {

		// setAll postavlja sve vrijednosti u nizu
		// konkretno u ovom sluèaju svakom elementu u nizu
		// postavlja vrijednost njegovog indexa
		int[] niz = new int[10];
		Arrays.setAll(niz, (index) -> index);
		System.out.println(Arrays.toString(niz));

		// u ovom se primjeru svakom elementu niza
		// postavlja vrijednost 5
		Arrays.setAll(niz, (index) -> 5);
		System.out.println(Arrays.toString(niz));

		// u ovom se primjeru svakom elementu niza
		// postavlja vrijednost index+1
		Arrays.setAll(niz, (index) -> index+1);
		System.out.println(Arrays.toString(niz));
	}

	public static void main(String[] args) {
		new ArraysSetAll();
	}

}
