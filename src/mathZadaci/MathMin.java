package mathZadaci;

import java.util.Arrays;

public class MathMin {

	public MathMin(){
		int min;
		int[] brojevi = {1,2,3,4};		
		min = Math.min(brojevi[0],
				Math.min(brojevi[1],
						Math.min(brojevi[2], brojevi[3])
						)
				);
		System.out.println("Najmanji broj od " + Arrays.toString(brojevi) + " je " + min);
	}
	
	public static void main(String[] args) {
		new MathMin();
	}
	
}
