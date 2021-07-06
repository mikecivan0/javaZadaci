package zadatakSaPredavanja050721;

public class Racun extends Dokument{

	private Kupac kupac;
		
	public Racun() {
		
	}
	
	public Racun(int id, double iznos, String datum, Kupac kupac) {
		super(id, iznos, datum);
		this.kupac = kupac;
	}	

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Raèun: \tid: " + Integer.toString(getId()) + "\n\tDatum: " + getDatum() + "\n\t" + getKupac();
	}

}
