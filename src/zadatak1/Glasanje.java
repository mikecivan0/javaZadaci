package zadatak1;



public class Glasanje {
	
	public static String glasanje(int i) {

		String glas = "";
		switch (i) {
		case 1:
			glas = "Maèka kaže mijau";
			break;

		case 2:
			glas = "Pas kaže vau-vau";
			break;

		case 3:
			glas = "Krava kaže muuuuu";
			break;

		case 4:
			glas = "Koka kaže kokodak";
			break;
		}

		return glas;

	}
}
