package zadatak9_Taksonomija_1;

public class Sisavac extends Zivotinja {

	private int brojZubi;
	private String vrijemeDojenja;
	private Zivotinja zivotinja;

	public Sisavac() {

	}

	public Sisavac(int brojZubi, String vrijemeDojenja, Zivotinja zivotinja) {
		this.brojZubi = brojZubi;
		this.vrijemeDojenja = vrijemeDojenja;
		this.zivotinja = zivotinja;
	}

	public int getBrojZubi() {
		return brojZubi;
	}

	public void setBrojZubi(int brojZubi) {
		this.brojZubi = brojZubi;
	}

	public String getVrijemeDojenja() {
		return vrijemeDojenja;
	}

	public void setVrijemeDojenja(String vrijemeDojenja) {
		this.vrijemeDojenja = vrijemeDojenja;
	}

	public Zivotinja getZivotinja() {
		return zivotinja;
	}

	public void setZivotinja(Zivotinja zivotinja) {
		this.zivotinja = zivotinja;
	}
	
	@Override
	public String toString() {
		return getZivotinja() + "\nBroj zubi ovog sisavca " + getBrojZubi() + " a svoje mlade doji " + getVrijemeDojenja();
	}

}
