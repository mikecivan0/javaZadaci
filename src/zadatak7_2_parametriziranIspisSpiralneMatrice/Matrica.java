package zadatak7_2_parametriziranIspisSpiralneMatrice;

public class Matrica {

	/*********************************************************************************
	 * treæa verzija sa potpuno parametriziranim pristupom gdje korisnik može birati *
	 * broj stupaca, broj redova, smjer i poziciju za poèetak ispisa                 *
	 *********************************************************************************/

	private static int COUNTER = 1;
	private int redovi;
	private int stupci;
	private int smjer;
	private int pocetak;
	private int minRedovi;
	private int maxRedovi;
	private int minStupci;
	private int maxStupci;
	private int umnozak;
	private int[][] spiralnaMatrica;

	// dojeljivanje vrijednosti koje je korisnik unio
	// preko konstruktora klase
	// i dodjeljivanje ostalih parametara potrebnih za ispis matrice
	public Matrica(int redovi, int stupci, int smjer, int pocetak) {
		this.redovi = redovi;
		this.stupci = stupci;
		this.smjer = smjer;
		this.pocetak = pocetak;
		this.minRedovi = 0;
		this.maxRedovi = redovi - 1;
		this.minStupci = 0;
		this.maxStupci = stupci - 1;
		this.umnozak = redovi*stupci;
		this.spiralnaMatrica = new int[redovi][stupci];
	}

	// metoda koja se poziva u Start klasi
	public void ispisiSpiralnuMatricu() {
		// ako je u smjeru kazaljke na satu
		if (smjer == 1) {
			switch (pocetak) {
			case 1:
				kreirajSpiralnuMatricuClockwisePozicija1();
				break;
			case 2:
				kreirajSpiralnuMatricuClockwisePozicija2();
				break;

			case 3:
				kreirajSpiralnuMatricuClockwisePozicija3();
				break;

			case 4:
				kreirajSpiralnuMatricuClockwisePozicija4();
				break;
			}

		// ako je u suprotnom smjeru
		} else {
			switch (pocetak) {
			case 1:
				kreirajSpiralnuMatricuCounterClockwisePozicija1();
				break;
			case 2:
				kreirajSpiralnuMatricuCounterClockwisePozicija2();
				break;

			case 3:
				kreirajSpiralnuMatricuCounterClockwisePozicija3();
				break;

			case 4:
				kreirajSpiralnuMatricuCounterClockwisePozicija4();
				break;
			}
		}

		ispisiMatricu(spiralnaMatrica);
	}
	
	


	/**********************************************************************
	 * POÈETAK metoda za ispis matrica koje idu U SMJERU kazaljke na satu *
	 **********************************************************************/
	
	// 1.1 POÈETNA POZICIJA je GORE LIJEVO
	private void kreirajSpiralnuMatricuClockwisePozicija1() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci; i <= maxStupci; i++) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od gore prema dolje
			for (int i = minRedovi + 1; i <= maxRedovi; i++) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci - 1; i >= minStupci; i--) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi + 1; i--) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			smanjiOkvirMatrice();
		}
	}

	// 1.2 POÈETNA POZICIJA je GORE DESNO
	private void kreirajSpiralnuMatricuClockwisePozicija2() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi; i <= maxRedovi; i++) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci - 1; i >= minStupci; i--) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi + 1; i--) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci; i <= maxStupci-1; i++) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			smanjiOkvirMatrice();
		}		
	}

	// 1.3 POÈETNA POZICIJA je DOLJE LIJEVO
	private void kreirajSpiralnuMatricuClockwisePozicija3() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis stupca od dolje prema gore
			for (int i = maxRedovi; i >= minRedovi; i--) {
				System.out.println("[" + i + "][" + minStupci + "] (" + COUNTER + ")");
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci+1; i <= maxStupci; i++) {
				System.out.println("[" + minRedovi + "][" + i + "] (" + COUNTER + ")");
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi+1; i <= maxRedovi; i++) {
				System.out.println("[" + i + "][" + maxStupci + "] (" + COUNTER + ")");
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci - 1; i >= minStupci+1; i--) {
				System.out.println("[" + maxRedovi + "][" + i + "] (" + COUNTER + ")");
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			smanjiOkvirMatrice();
		}		
	}

	// 1.4 POÈETNA POZICIJA je DOLJE DESNO
	public void kreirajSpiralnuMatricuClockwisePozicija4() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci; i >= minStupci; i--) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi; i--) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci + 1; i <= maxStupci; i++) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od gore prema dolje
			for (int i = minRedovi + 1; i <= maxRedovi - 1; i++) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			smanjiOkvirMatrice();
		}
	}
	
	/*******************************************************************
	 * KRAJ metoda za ispis matrica koje idu U SMJERU kazaljke na satu *
	 *******************************************************************/
	
	
	
	/***********************************************************************************
	 * POÈETAK metoda za ispis matrica koje idu u smjeru SUPROTNOM od kazaljke na satu *
	 ***********************************************************************************/
	
	// 2.1 POÈETNA POZICIJA je GORE LIJEVO
	private void kreirajSpiralnuMatricuCounterClockwisePozicija1() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi; i <= maxRedovi; i++) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci + 1; i <= maxStupci; i++) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi; i--) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci-1; i >= minStupci+1; i--) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			smanjiOkvirMatrice();
		}		
	}
	
	// 2.2 POÈETNA POZICIJA je GORE DESNO
	private void kreirajSpiralnuMatricuCounterClockwisePozicija2() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci; i >= minStupci; i--) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi+1; i <= maxRedovi; i++) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci + 1; i <= maxStupci; i++) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi+1; i--) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}

			smanjiOkvirMatrice();
		}			
	}
	
	// 2.3 POÈETNA POZICIJA je DOLJE LIJEVO
	private void kreirajSpiralnuMatricuCounterClockwisePozicija3() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci; i <= maxStupci; i++) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od dolje prema gore
			for (int i = maxRedovi - 1; i >= minRedovi; i--) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci-1; i >= minStupci; i--) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi+1; i <= maxRedovi-1; i++) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			smanjiOkvirMatrice();
		}			
	}	

	// 2.4 POÈETNA POZICIJA je DOLJE DESNO
	private void kreirajSpiralnuMatricuCounterClockwisePozicija4() {
		
		petljaWhile:
		while (COUNTER <= umnozak) {
			
			// ispis stupca od dolje prema gore
			for (int i = maxRedovi; i >= minRedovi; i--) {
				spiralnaMatrica[i][maxStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa desne na lijevu stranu
			for (int i = maxStupci-1; i >= minStupci; i--) {
				spiralnaMatrica[minRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis stupca od gore prema dolje
			for (int i = minRedovi+1; i <= maxRedovi; i++) {
				spiralnaMatrica[i][minStupci] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			// ispis reda sa lijeve na desnu stranu
			for (int i = minStupci+1; i <= maxStupci-1; i++) {
				spiralnaMatrica[maxRedovi][i] = COUNTER;
				COUNTER++;
				if(COUNTER>umnozak) {
					break petljaWhile;
				}
			}
			
			smanjiOkvirMatrice();
		}	
	}
	
	/********************************************************************************
	 * KRAJ metoda za ispis matrica koje idu u smjeru SUPROTNOM od kazaljke na satu *
	 ********************************************************************************/

	
	
	// metoda za ispis matrice u konzoli
	private void ispisiMatricu(int[][] matrica) {

		for (int i = 0; i < redovi; i++) {
			for (int j = 0; j < stupci; j++) {
				System.out.print(matrica[i][j] + "\t");
			}

			System.out.println();
		}
	}
	
	// pomoæna metoda smanjenje kolièine koda
	private void smanjiOkvirMatrice() {
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