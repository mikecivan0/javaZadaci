package rekurzija;

import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
		unos();
		ispis();
	}
	
	static int[] NIZ = new int[20];
	static int ITERATOR = 0;
	
	private static void unos() {
		if (ITERATOR < NIZ.length) {
			if (ITERATOR < 2) {
				NIZ[ITERATOR] = 1;
			} else {
				NIZ[ITERATOR] = NIZ[ITERATOR - 1] + NIZ[ITERATOR - 2];
			}
			ITERATOR++;
			unos();
		}

	}

	private static void ispis() {
		System.out.println(Arrays.toString(NIZ));
	}	

}
