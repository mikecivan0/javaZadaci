package mathZadaci;

public class MathCbrt {

	private MathCbrt() {
		
		double a = 9;
		double cbrt = Math.cbrt(a);
		
		System.out.println("Kubni korijen od " + a + " je " + cbrt);
		
	}
	
	public static void main(String[] args) {
		new MathCbrt();
	}

	
}
