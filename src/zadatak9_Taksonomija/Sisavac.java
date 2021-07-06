package zadatak9_Taksonomija;

public class Sisavac extends Zivotinja{

	private int brojZubi;
	private String vrijemeDojenja;	

	public Sisavac() {
		
	}
	
	public Sisavac(String vrstaHrane, String tezina, int brojZubi, String vrijemeDojenja) {
		super(vrstaHrane, tezina);
		this.brojZubi = brojZubi;
		this.vrijemeDojenja = vrijemeDojenja;
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
	
}
