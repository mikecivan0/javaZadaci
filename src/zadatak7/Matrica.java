package zadatak7;

public class Matrica {

	/**
	 * ideja je da se kreira normalna spiralna matrica gdje se 1 nalazi na poziciji
	 * matrica[0][0] i ide u smjeru kazaljke zatim se ta matrica dijagonalno obrne
	 * na naèin da se obrne redoslijed redova u matrici i takoðer se obrnu
	 * vrijednosti unutar svakoga reda
	 */

	private static int COUNTER = 1;
	private int redovi;
	private int stupci;
	private int[][] obicnaSpiralnaMatrica;
	private int[][] dijagonalnoZrcalnaSpiralnaMatrica;

	// dojeljivanje vrijednosti koje je korisnik unio
	// preko konstruktora klase
	public Matrica(int redovi, int stupci) {
		this.redovi = redovi;
		this.stupci = stupci;
	}

	// metoda koja se poziva u Start klasi
	public void ispisiSpiralnuMatricu() {
		kreirajObicnuSpiralnuMatricu();
		kreirajDijagonalnoZrcalnuSpiralnuMatricu();
		ispisiMatricu(dijagonalnoZrcalnaSpiralnaMatrica);
	}

	// kreiranje obiène spiralne matrice gjde se 
	// vrijednost 1 nalazi gore lijevo
	public void kreirajObicnuSpiralnuMatricu() {		
		obicnaSpiralnaMatrica = new int[redovi][stupci];
		int minRedovi = 0;
		int maxRedovi = redovi - 1;
		int minStupci = 0;
		int maxStupci = stupci - 1;

		// rapored for petlji u while petlji
		// je rapored punjenja matrice
		while (COUNTER <= redovi * stupci) {
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci; i <= maxStupci; i++) {
				obicnaSpiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
			}

			// ispis stupca od gore prema dolje
			for (int i = minRedovi + 1; i <= maxRedovi; i++) {
				obicnaSpiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
			}

			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci - 1; i >= minStupci; i--) {
				obicnaSpiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
			}

			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi + 1; i--) {
				obicnaSpiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
			}

			// na kraju ispisa svakog okvira smanjiti 
			// velièinu okvira za 1 sa svake strane
			// kako bi se sljedeæi brojevi ispisivali u
			// unutarnjem okviru
			minRedovi++;
			minStupci++;
			maxRedovi--;
			maxStupci--;
		}
	}

	// kreiranje dijagonalno obrnute spiralne matrice
	// gdje se vrijednost 1 nalazi dolje desno
	private void kreirajDijagonalnoZrcalnuSpiralnuMatricu() {

		dijagonalnoZrcalnaSpiralnaMatrica = new int[redovi][stupci];
		int zadnjiIndexReda = redovi - 1;

		// obrtanje rasporeda redova i stupaca
		for (int i = 0; i <= redovi - 1; i++) {
			dijagonalnoZrcalnaSpiralnaMatrica[zadnjiIndexReda] = obrniRedoslijedVrijednostiNiza(
					obicnaSpiralnaMatrica[i]);
			zadnjiIndexReda--;
		}

	}

	// ispis matrice u konzoli
	private void ispisiMatricu(int[][] matrica) {

		for (int i = 0; i < redovi; i++) {
			for (int j = 0; j < stupci; j++) {
				System.out.print(matrica[i][j] + "\t");
			}

			System.out.println();
		}
	}

	// pomoæna metoda obrtanja rasporeda vrijednosti u svakom redu
	private int[] obrniRedoslijedVrijednostiNiza(int[] niz) {

		for (int i = 0; i < niz.length / 2; i++) {
			int temp = niz[i];
			niz[i] = niz[niz.length - i - 1];
			niz[niz.length - i - 1] = temp;
		}

		return niz;
	}
}