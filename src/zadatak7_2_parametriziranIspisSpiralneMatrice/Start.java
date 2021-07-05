package zadatak7_2_parametriziranIspisSpiralneMatrice;

import javax.swing.JOptionPane;

import alati.Unosi;

public class Start {
	
	Vrijednosti vrijednosti = new Vrijednosti();
	Matrica matrica;;

	public Start() {
		
		/** metoda Unosi.JOPDialogInt() se nalazi u paketu alati
		* kojeg se može naæi u ovom repozitoriju
		* metoda je kreirana sa razlogom da se pojednostavi 
		* kod za unos podataka od strane korisnika
		* ukoliko se ne želi koristiti ta metoda
		* tada se 
		* Unosi.JOPDialogInt("poruka") 
		* mogu slobodno zamijeniti sa 
		* Integer.parseInt(JOptionPane.showInputDialog("poruka"));
		*/
		
		for(;;) {
			int redovi = Unosi.JOPDialogInt("Koliko æe redova imati tablica?");
			
			if(redovi>1) {
				vrijednosti.setRedovi(redovi);
				break;
			}
			poruka("Nakon što klikneš na 'OK' molim unesi broj veæi od 0");
			
		}
		
		for(;;) {
			int stupci = Unosi.JOPDialogInt("Koliko æe stupaca imati tablica");
			
			if(stupci>1) {
				vrijednosti.setStupci(stupci);
				break;
			}
			poruka("Nakon što klikneš na 'OK' molim unesi broj veæi od 0");
			
		}
		
		for(;;) {
			int smjer = Unosi.JOPDialogInt("Na koji naèin æe se ispisati spiralna matrica?\n\n"
					+ "Unesi 1 ako želiš da se ispiše u smjeru kazaljke na satu\n"
					+ "Unesi 2 ako želiš da se ispiše u suprotnom smjeru");
			if(smjer==1 || smjer==2) {
				vrijednosti.setSmjer(smjer);
				break;
			}
			
			poruka("Nakon što klikneš na 'OK' molim unesi 1 ili 2");
		}
		
		for(;;) {
			int pocetak = Unosi.JOPDialogInt("Na koji naèin æe se ispisati spiralna matrica?\n\n"
					+ "Unesi 1 ako želiš da poène od gore lijevo\n"
					+ "Unesi 2 ako želiš da poène od gore desno\n"
					+ "Unesi 3 ako želiš da poène od dolje lijevo\n"
					+ "Unesi 4 ako želiš da poène od dolje desno");
			if(pocetak>0 && pocetak<5) {
				vrijednosti.setPocetak(pocetak);
				break;
			}
			
			poruka("Nakon što klikneš na 'OK' molim unesi 1, 2, 3 ili 4");
		}
		
	
		matrica = new Matrica(vrijednosti.getRedovi(), vrijednosti.getStupci(),vrijednosti.getSmjer(),vrijednosti.getPocetak());
		matrica.ispisiSpiralnuMatricu();
	
	}
	
	
	public static void main(String[] args) {	
		new Start();
	}
	
	// pomoæna funkcija za ispis poruke	
	private void poruka(String poruka) {
		JOptionPane.showInternalMessageDialog(null, poruka);
	}
	

}
