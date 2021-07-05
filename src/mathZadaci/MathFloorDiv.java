package mathZadaci;

public class MathFloorDiv {
	public MathFloorDiv() {
	
		int a = 100, b = 3;
		int c = Math.floorDiv(a, b);
		
		System.out.println("Kada se " + a + " podijeli sa " + b + " i kada se "
				+ "taj broj zaokruži na najbliži manji cijeli broj "
				+ "dobije se " + c);
		
		
	}

	public static void main(String[] args) {
		new MathFloorDiv();

	}

}
