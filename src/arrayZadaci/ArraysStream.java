package arrayZadaci;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStream {

	public ArraysStream() {
		
		// stream vra�a sekvencu objekata koje generira od izvora
		
		int[] niz = {5,1,2,3,8,7,4,5};
		System.out.println(Arrays.stream(niz).average()); // vra�anje aritmeti�ke sredine
		
		System.out.println(Arrays.stream(niz).sum()); // vra�anje zbroja 		
		
		// kroz stream se iterira sa forEach
        String[] arr = { "Java", "programming", "rocks!" };
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(str -> System.out.print(str + " "));
        
        System.out.println();
        
        // budu�i da stream radi samo sa primitivnim tipovima
        // potebno je objekt Integer prebaciti u 
        // primitivni oblik int prije nego se izvr�ava
        // neka operacija na njemu
        Integer[] niz2 = { 1, 2, 3};
        System.out.println(Arrays.stream(niz2).mapToInt(Integer::intValue).sum());
        
	}

	public static void main(String[] args) {
		new ArraysStream();

	}

}
