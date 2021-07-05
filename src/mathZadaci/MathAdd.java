package mathZadaci;

public class MathAdd {
	
	public MathAdd() {
		
		int a = 55, b=-4, zbroj;
		zbroj = Math.addExact(a, b);
		
		System.out.println("Zbroj " + a + " i " + b + " daje " + zbroj);
	}

	public static void main(String[] args) {
		new MathAdd();

	}

}
