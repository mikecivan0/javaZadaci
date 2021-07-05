package mathZadaci;

public class MathHypot {

	public MathHypot() {
		
		double a = 3, b = 4;
		double c = Math.hypot(a, b);
		
		System.out.println("Ako je jedna stranica trokuta dugaèka " + a + " a"
				+ " druga stranica dugaèka " + b + " tada je"
				+ " treæa stranica dugaèka " + c);
		
	}

	public static void main(String[] args) {
		new MathHypot();

	}

}
