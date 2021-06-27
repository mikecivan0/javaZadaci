package zadatak3;

public class Tablica {

	public static void ispisiTablicu(int a, int b) {
		int umnozak;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				umnozak = i * j;
				if (umnozak < 10) {
					System.out.print(umnozak + "    ");
				} else if (umnozak >= 10 && umnozak < 100) {
					System.out.print(umnozak + "   ");
				} else if (umnozak >= 100 && umnozak < 1000) {
					System.out.print(umnozak + "  ");
				} else {
					System.out.println(umnozak + " ");
				}
			}
			System.out.println();
		}
	}
}
