package zadatak9_Taksonomija_1;

public class Start {
	
	// Kreirati tri razine nasljeđivanja
	// u domeni biljnog i životinjskog svijeta
	// flora i fauna, pojam "porodica"
	// ali tako da svaka klasa ima dva svojstva

	public Start() {
		
		Pas pas = new Pas(15.5, "Smeđa", new Sisavac(22, "2 tjedna", new Zivotinja("Meso", "15g")));		
		pas.detalji();
		
	}

	public static void main(String[] args) {
		new Start();

	}

}
