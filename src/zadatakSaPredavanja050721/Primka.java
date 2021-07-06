package zadatakSaPredavanja050721;

public class Primka extends Dokument{

	private String otpremnica;
	
	public Primka() {
		
	}

	public Primka(int id, double iznos, String datum, String otpremnica) {
		super(id, iznos, datum);
		this.otpremnica = otpremnica;
	}

	public String getOtpremnica() {
		return otpremnica;
	}

	public void setOtpremnica(String otpremnica) {
		this.otpremnica = otpremnica;
	}

	@Override
	public String toString() {
		return "Primka: id: " + getId() + "\n\tDatum: " + getDatum() + "\n\tOtpremnica: " + getOtpremnica();
	}

	
	
}
