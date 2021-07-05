package arrayZadaci;

import java.util.Arrays;

public class ArraysFill {

	// za razliku od Arrays.setAll() ova metoda
	// može postaviti sve elemente niza
	// samo na jednu zadanu vrijednost
	public ArraysFill() {
		// u ovom se primjeru svakom elementu niza
		// postavlja vrijednost 2	
		int[] niz = new int[10];
		Arrays.fill(niz, 2);
		System.out.println(Arrays.toString(niz));
	}

	public static void main(String[] args) {
		new ArraysFill();

	}

}
