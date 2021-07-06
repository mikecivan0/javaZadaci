package zadatak9_Taksonomija_1;

public class Pas extends Sisavac {

	private double duzinaRepa;
	private String bojaKrzna;
	private Sisavac sisavac;	

	public Pas() {

	}

	public Pas(double duzinaRepa, String bojaKrzna, Sisavac sisavac) {
		this.duzinaRepa = duzinaRepa;
		this.bojaKrzna = bojaKrzna;
		this.sisavac = sisavac;
	}	

	public double getDuzinaRepa() {
		return duzinaRepa;
	}

	public void setDuzinaRepa(double duzinaRepa) {
		this.duzinaRepa = duzinaRepa;
	}

	public String getBojaKrzna() {
		return bojaKrzna;
	}

	public void setBojaKrzna(String bojaKrzna) {
		this.bojaKrzna = bojaKrzna;
	}

	public Sisavac getSisavac() {
		return sisavac;
	}

	public void setSisavac(Sisavac sisavac) {
		this.sisavac = sisavac;
	}

	public void detalji() {
		System.out.println(getSisavac() + "\nDužina repa psa je " + getDuzinaRepa() + "cm a boja krzna mu je " + getBojaKrzna());
	}

}
