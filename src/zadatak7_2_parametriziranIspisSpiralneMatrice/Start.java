package zadatak7_2_parametriziranIspisSpiralneMatrice;

import javax.swing.JOptionPane;

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
		
		for(;;) {
			int redovi = Unosi.JOPDialogInt("Koliko �e redova imati tablica?");
			
			if(redovi>1) {
				vrijednosti.setRedovi(redovi);
				break;
			}
			poruka("Nakon �to klikne� na 'OK' molim unesi broj ve�i od 0");
			
		}
		
		for(;;) {
			int stupci = Unosi.JOPDialogInt("Koliko �e stupaca imati tablica");
			
			if(stupci>1) {
				vrijednosti.setStupci(stupci);
				break;
			}
			poruka("Nakon �to klikne� na 'OK' molim unesi broj ve�i od 0");
			
		}
		
		for(;;) {
			int smjer = Unosi.JOPDialogInt("Na koji na�in �e se ispisati spiralna matrica?\n\n"
					+ "Unesi 1 ako �eli� da se ispi�e u smjeru kazaljke na satu\n"
					+ "Unesi 2 ako �eli� da se ispi�e u suprotnom smjeru");
			if(smjer==1 || smjer==2) {
				vrijednosti.setSmjer(smjer);
				break;
			}
			
			poruka("Nakon �to klikne� na 'OK' molim unesi 1 ili 2");
		}
		
		for(;;) {
			int pocetak = Unosi.JOPDialogInt("Na koji na�in �e se ispisati spiralna matrica?\n\n"
					+ "Unesi 1 ako �eli� da po�ne od gore lijevo\n"
					+ "Unesi 2 ako �eli� da po�ne od gore desno\n"
					+ "Unesi 3 ako �eli� da po�ne od dolje lijevo\n"
					+ "Unesi 4 ako �eli� da po�ne od dolje desno");
			if(pocetak>0 && pocetak<5) {
				vrijednosti.setPocetak(pocetak);
				break;
			}
			
			poruka("Nakon �to klikne� na 'OK' molim unesi 1, 2, 3 ili 4");
		}
		
	
		matrica = new Matrica(vrijednosti.getRedovi(), vrijednosti.getStupci(),vrijednosti.getSmjer(),vrijednosti.getPocetak());
		matrica.ispisiSpiralnuMatricu();
	
	}
	
	
	public static void main(String[] args) {	
		new Start();
	}
	
	// pomo�na funkcija za ispis poruke	
	private void poruka(String poruka) {
		JOptionPane.showInternalMessageDialog(null, poruka);
	}
	

}
