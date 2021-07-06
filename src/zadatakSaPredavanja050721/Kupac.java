package zadatakSaPredavanja050721;

public class Kupac {

	private int id;
	private String naziv;
	private String adresa;
	
	public Kupac() {
		
	}
	
	public Kupac(int id, String naziv, String adresa) {
		this.id = id;
		this.naziv = naziv;
		this.adresa = adresa;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	@Override
	public String toString() {
		return "Kupac:\tid: " + getId() + "\n\t\tNaziv: " + getNaziv() + "\n\t\tAdresa: " + getAdresa();
	}
	

}
