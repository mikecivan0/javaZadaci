package arrayZadaci;

import java.util.Arrays;

public class ArraySort {

	public ArraySort() {
		
		// metoda Arays.sort() je tipa vodi pa ju ne treba dodjeljivati novoj varijabli
		
		int[] intArray = {5,86,51,-52,3,25,1,4,0}; 
		String[] stringArray = {"jedan","drvo","cigla","ime","otorinolaringologija","pas"};
	
		System.out.print("Kada se niz " + Arrays.toString(intArray) + " sortira bude ovakav ");
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		System.out.print("Kada se niz " + Arrays.toString(stringArray) + " sortira bude ovakav ");
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		
	}

	public static void main(String[] args) {
		new ArraySort();

	}

}
