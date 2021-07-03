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
		
		vrijednosti.setRedovi(Unosi.JOPDialogInt("Koliko �e redova imati tablica?"));
		vrijednosti.setStupci(Unosi.JOPDialogInt("Koliko �e stupaca imati tablica"));
		
		for(;;) {
			int smjer = Unosi.JOPDialogInt("Na koji na�in �e se ispisati spiralna matrica?\n\n"
					+ "Unesi 1 ako �eli� da se ispi�e u smjeru kazaljke na satu\n"
					+ "Unesi 2 ako �eli� da se ispi�e u suprotnom smjeru");
			if(smjer==1 || smjer==2) {
				vrijednosti.setSmjer(smjer);
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Nakon �to klikne� na 'OK' molim unesi 1 ili 2");
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
			
			JOptionPane.showInternalMessageDialog(null, "Nakon �to klikne� na 'OK' molim unesi 1, 2, 3 ili 4");
		}
		
	
		matrica = new Matrica(vrijednosti.getRedovi(), vrijednosti.getStupci(),vrijednosti.getSmjer(),vrijednosti.getPocetak());
		matrica.ispisiSpiralnuMatricu();
	
	}
	
	
	public static void main(String[] args) {	
		new Start();
	}
	
	

}
