package zadatak9_Taksonomija;

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
	
}
