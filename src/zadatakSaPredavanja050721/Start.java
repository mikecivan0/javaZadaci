package zadatakSaPredavanja050721;

public class Start {

	// Klasa dokument ima svojstva: ID, iznos, datum
	// Klasa Racun naslje�uje Dokument i dodaje svojstvo: Kupac
	// Kupac ima ID, naziv i adresu
	// Klasa Primka naslje�uje Dokumnet i dodaje svojstvo: otpremnica

	// kreirati po jednu instancu klasa Ra�un i Primka

	public Start() {
		Racun racun = new Racun(1, 4.20, "2021-10-10", new Kupac(1, "Trgovina", "Ulica 23"));		
		Primka primka = new Primka(1, 4.20, "2021-10-11", "Dostava na ruke");
		
		System.out.println(racun);
		System.out.println(primka);
		
	}

	public static void main(String[] args) {

		new Start();
	}

}
