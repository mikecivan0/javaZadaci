package mathZadaci;

public class MathHypot {

	public MathHypot() {
		
		double a = 3, b = 4;
		double c = Math.hypot(a, b);
		
		System.out.println("Ako je jedna stranica trokuta duga�ka " + a + " a"
				+ " druga stranica duga�ka " + b + " tada je"
				+ " tre�a stranica duga�ka " + c);
		
	}

	public static void main(String[] args) {
		new MathHypot();

	}

}
