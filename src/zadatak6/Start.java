package zadatak6;

import javax.swing.JOptionPane;

public class Start {
	private Racunala[] kompovi;
	public Start() {
		kompovi = new Racunala[5];
		ucitajInformacije();
		ispisiRacunala();
	}
	private void ispisiRacunala() {
		for (Racunala komp : kompovi) {
			System.out.println(komp.getGodinaProizvodnje());
		}
	}
	private void ucitajInformacije() {
		Racunala komp;
		for (int i = 0; i < 5; i++) {
			komp = new Racunala();
			komp.setProizvodac(JOptionPane.showInputDialog("Daj mi ime proizvodaca GPU"));
			komp.setCpu(JOptionPane.showInputDialog("Unesi ime proizvodaca CPU"));
			komp.setGodinaProizvodnje(Integer.parseInt(JOptionPane.showInputDialog("Unesi godinu proizvodnje")));
			kompovi[i] =  komp;
			
		}
		
	}
	public static void main(String[] args) {
		new Start();
	}
}
