package rekurzija;

public class Izracun {

	private static int ITERATOR=0;
	private static int ZBROJ;
	public void izracunajZbroj() {
		
		ITERATOR++;
		if(ITERATOR<=100) {
			ZBROJ+=ITERATOR;
			izracunajZbroj();
		}else {
			System.out.println(ZBROJ);
		}
		
	}
}
