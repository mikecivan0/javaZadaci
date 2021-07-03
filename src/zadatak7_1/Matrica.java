package zadatak7_1;

public class Matrica {

	/**
	 * druga verzija bez obrtanja redoslijeda
	 */

	private static int COUNTER = 1;
	private int redovi;
	private int stupci;
	private int[][] obicnaSpiralnaMatrica;

	// dojeljivanje vrijednosti koje je korisnik unio
	// preko konstruktora klase
	public Matrica(int redovi, int stupci) {
		this.redovi = redovi;
		this.stupci = stupci;
	}

	// metoda koja se poziva u Start klasi
	public void ispisiSpiralnuMatricu() {
		kreirajSpiralnuMatricu();
		ispisiMatricu(obicnaSpiralnaMatrica);
	}

	// kreiranje obiène spiralne matrice gjde se 
	// vrijednost 1 nalazi gore lijevo
	public void kreirajSpiralnuMatricu() {		
		obicnaSpiralnaMatrica = new int[redovi][stupci];
		int minRedovi = 0;
		int maxRedovi = redovi - 1;
		int minStupci = 0;
		int maxStupci = stupci - 1;

		// rapored for petlji u while petlji
		// je rapored punjenja matrice
		while (COUNTER <= redovi * stupci) {
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci; i >= minStupci; i--) {
				obicnaSpiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
			}
			
			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi; i--) {
				obicnaSpiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci+1; i <= maxStupci; i++) {
				obicnaSpiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
			}

			// ispis stupca od gore prema dolje
			for (int i = minRedovi + 1; i <= maxRedovi-1; i++) {
				obicnaSpiralnaMatrica[i][maxStupci] = COUNTER;
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


	// ispis matrice u konzoli
	private void ispisiMatricu(int[][] matrica) {

		for (int i = 0; i < redovi; i++) {
			for (int j = 0; j < stupci; j++) {
				System.out.print(matrica[i][j] + "\t");
			}

			System.out.println();
		}
	}

	
}