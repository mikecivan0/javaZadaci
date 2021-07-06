package zadatak9_Taksonomija;

public class Start {
	
	// Kreirati tri razine nasljeðivanja
	// u domeni biljnog i životinjskog svijeta
	// flora i fauna, pojam "porodica"
	// ali tako da svaka klasa ima dva svojstva

	public Start() {
		
		Pas pas = new Pas("Meso", "5kg", 20, "2-4 tjedna", 23, "Šarena");
		pas.detalji();
	}

	public static void main(String[] args) {
		new Start();

	}

}
