package zadatak2;

public class ZadatakArray {
	public static void main(String[] args) {

		String[] mjesta = { "Osijek", "Valpovo", "�epin", "Osijek", "Lug", "Beli��e", "�epin", "Osijek", "Lug" };

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
		// program ispisuje broj pojava odre�enog grada u stringu

		String mjestaString = "Osijek,Valpovo,�epin,Osijek,Lug,Beli��e,�epin,Osijek,Lug";

		Alati.countOccurrancesInString(mjestaString);

	}
}
