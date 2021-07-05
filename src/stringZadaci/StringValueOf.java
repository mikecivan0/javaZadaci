package stringZadaci;

public class StringValueOf {

	public StringValueOf() {
		
		// pretvara razlièite tipove u string
		int a = 25;
		String b = "20 " + String.valueOf(a); 
		System.out.println(b);		
		
		// drugi primjer
		// kreæe od indexa 2 i ide tri mjesta dalje
		// ispisuje string sastavljen od tih znakova
		char[] c = {'1','2','3','4','5','6'};		
		System.out.println(String.valueOf(c, 2, 3)); 

	}
	
	public static void main(String[] args) {
		new StringValueOf();
	}

}
