package mathZadaci;

public class MathCeil {
	
	public MathCeil() {
	
		double a  = 4.85865;
		double b =  Math.ceil(a);
		
		System.out.println("Prvi cijeli broj veæi od " + a + " je " + (int)b);
	}

	public static void main(String[] args) {
		new MathCeil();

	}

}
