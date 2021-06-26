package zadatak2;

public class ZadatakArray {
	public static void main(String[] args) {

		String[] mjesta = { "Osijek", "Valpovo", "Èepin", "Osijek", "Lug", "Belišæe", "Èepin", "Osijek", "Lug" };

		// zadatak 1
		// program pronalazi i ispisuje duple vrijednosti u nizu
		String listaDuplihMjesta = "";

		for (int i = 0; i < mjesta.length; i++) {
			for (int j = i + 1; j < mjesta.length; j++) {
				if (mjesta[j] == mjesta[i] && !listaDuplihMjesta.contains(mjesta[j])) {
					listaDuplihMjesta += mjesta[j] + "\n";
				}
			}
		}

		System.out.println(listaDuplihMjesta);

		
		
		
		// zadatak 2
		// program ispisuje broj pojava odreðenog grada u stringu

		String mjestaString = "Osijek,Valpovo,Èepin,Osijek,Lug,Belišæe,Èepin,Osijek,Lug";

		Alati.countOccurrancesInString(mjestaString);

	}
}
