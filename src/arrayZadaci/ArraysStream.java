package arrayZadaci;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStream {

	public ArraysStream() {
		
		// stream vraæa sekvencu objekata koje generira od izvora
		
		int[] niz = {5,1,2,3,8,7,4,5};
		System.out.println(Arrays.stream(niz).average()); // vraæanje aritmetièke sredine
		
		System.out.println(Arrays.stream(niz).sum()); // vraæanje zbroja 		
		
		// kroz stream se iterira sa forEach
        String[] arr = { "Java", "programming", "rocks!" };
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(str -> System.out.print(str + " "));
        
        System.out.println();
        
        // buduæi da stream radi samo sa primitivnim tipovima
        // potebno je objekt Integer prebaciti u 
        // primitivni oblik int prije nego se izvršava
        // neka operacija na njemu
        Integer[] niz2 = { 1, 2, 3};
        System.out.println(Arrays.stream(niz2).mapToInt(Integer::intValue).sum());
        
	}

	public static void main(String[] args) {
		new ArraysStream();

	}

}
