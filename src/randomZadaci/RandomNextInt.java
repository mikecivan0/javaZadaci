package randomZadaci;

import java.util.Random;

public class RandomNextInt {

	public RandomNextInt() {
		
		// prikazivanje sluèajno generiranog int broja
		Random broj = new Random();
		System.out.println(broj.nextInt());
		
		// prikazivanje sluèajno generiranog broja
		// imeðu 0 i zadane vrijednosti		
		System.out.println(broj.nextInt(10));
	}

	public static void main(String[] args) {
		new RandomNextInt();

	}

}
