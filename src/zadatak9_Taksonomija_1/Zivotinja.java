package zadatak9_Taksonomija_1;

public class Zivotinja {
	private String vrstaHrane;
	private String tezina;
	
	public Zivotinja() {
		
	}
	
	public Zivotinja(String vrstaHrane, String tezina) {
		this.vrstaHrane = vrstaHrane;
		this.tezina = tezina;
	}
	
	public String getVrstaHrane() {
		return vrstaHrane;
	}
	public void setVrstaHrane(String vrstaHrane) {
		this.vrstaHrane = vrstaHrane;
	}
	public String getTezina() {
		return tezina;
	}
	public void setTezina(String tezina) {
		this.tezina = tezina;
	}
	
	@Override
	public String toString() {
		return "Hrana ove životinje je " + getVrstaHrane() + " a životinja je teška " + getTezina();
	}
	
	
}
