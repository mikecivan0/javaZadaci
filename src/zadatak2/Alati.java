package zadatak2;

import java.util.Arrays;

public class Alati {

	public static void countOccurrancesInString(String mjesta) {
		
		int index;
		// zabijanje stringa u niz
		String[] mjestaArray = mjesta.split(",");
		
		String distinctMjesta = "";

		// pravljenje stringa distinct mjesta meðusobno odvojenih zarezom
		for (int i = 0; i < mjestaArray.length; i++) {
			if (!distinctMjesta.contains(mjestaArray[i])) {
				distinctMjesta += mjestaArray[i] + ",";
			}
		}

		// kreiranje niza sa distinct mjestima
		String[] distinctMjestaArray = distinctMjesta.split(",");
		
		// kreiranje niza za brojanje svakog elementa u nizu distinct mjesta
		int[] countArray = new int[distinctMjestaArray.length];
		// popuni sva mjesta sa 1 jer se svaki element pojavljuje barem jednom
		Arrays.fill(countArray, 0);
		
		// za svaki elenet cijelog niza mjesta naði index tog elementa u nizu distinct mjesta i tu vrijednost uveæaj za 1
		for(int i=0;i<mjestaArray.length;i++) {
			index = Arrays.asList(distinctMjestaArray).indexOf(mjestaArray[i]);
			countArray[index] += 1;
		}
		
		for(int j=0; j<distinctMjestaArray.length;j++) {
			System.out.println("Mjesto " + distinctMjestaArray[j] + " se pojavljuje " + countArray[j] + " puta");
		}
	}

}
