package zadatak1;

public class provjeraVrijednosti {

	public static boolean provjeriUnos(int i, int najmanje, int najvise) {
		if(i>=najmanje && i<=najvise) {
			return true;
		}else {
			return false;
		}
	}
}
