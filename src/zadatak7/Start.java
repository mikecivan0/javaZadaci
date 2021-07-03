package zadatak7;

import alati.Unosi;

public class Start {
	
	Vrijednosti vrijednosti = new Vrijednosti();
	Matrica matrica;;

	public Start() {
		
		/** metoda Unosi.JOPDialogInt() se nalazi u paketu alati
		* kojeg se mo�e na�i u ovom repozitoriju
		* metoda je kreirana sa razlogom da se pojednostavi 
		* kod za unos podataka od strane korisnika
		* ukoliko se ne �eli koristiti ta metoda
		* tada se 
		* Unosi.JOPDialogInt("poruka") 
		* mogu slobodno zamijeniti sa 
		* Integer.parseInt(JOptionPane.showInputDialog("poruka"));
		*/
		
		vrijednosti.setRedovi(Unosi.JOPDialogInt("Koliko �e redova imati tablica?"));
		vrijednosti.setStupci(Unosi.JOPDialogInt("Koliko �e stupaca imati tablica"));
	
		matrica = new Matrica(vrijednosti.getRedovi(), vrijednosti.getStupci());
		matrica.ispisiSpiralnuMatricu();
	
	}
	
	
	public static void main(String[] args) {	
		new Start();
	}
	
	

}
