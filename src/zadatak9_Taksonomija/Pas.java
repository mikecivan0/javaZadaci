package zadatak9_Taksonomija;

public class Pas extends Sisavac{
	
	private float duzinaRepa;
	private String bojaKrzna;
	
	public Pas() {
		
	}	

	public Pas(String vrstaHrane, String tezina, int brojZubi, String vrijemeDojenja, float duzinaRepa,
			String bojaKrzna) {
		super(vrstaHrane, tezina, brojZubi, vrijemeDojenja);
		this.duzinaRepa = duzinaRepa;
		this.bojaKrzna = bojaKrzna;
	}

	public float getDuzinaRepa() {
		return duzinaRepa;
	}

	public void setDuzinaRepa(float duzinaRepa) {
		this.duzinaRepa = duzinaRepa;
	}

	public String getBojaKrzna() {
		return bojaKrzna;
	}

	public void setBojaKrzna(String bojaKrzna) {
		this.bojaKrzna = bojaKrzna;
	}	
	
	
	public void detalji() {
		System.out.println("Hrana ove �ivotinje je " + getVrstaHrane() + " a �ivotinja je te�ka " + getTezina() + 
				"\nBroj zubi ovog sisavca " + getBrojZubi() + " a svoje mlade doji " + getVrijemeDojenja() 
				+ "\nDu�ina repa psa je " + getDuzinaRepa() + "cm a boja krzna mu je " + getBojaKrzna());
	}

}
