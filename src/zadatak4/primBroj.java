package zadatak4;

import alati.Unosi;

public class primBroj {
	public static void main(String[] args) {

		int a, b;

		a = Unosi.JOPDialogInt("Unesi prvi broj");

		b = Unosi.JOPDialogInt("Unesi drugi broj");

		primBrojevi(a, b);

	}

	public static void primBrojevi(int a, int b) {

		boolean primBroj;

		for (int i = a; i <= b; i++) {
			primBroj = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					primBroj = false;
					break;
				}

			}

			if (primBroj) {
				System.out.println(i);
			}

		}

	}
}
