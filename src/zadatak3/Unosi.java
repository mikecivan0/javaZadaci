package zadatak3;

import java.util.Scanner;

public class Unosi {

	Scanner ulaz = new Scanner(System.in); // scanner se ne zatvara u ovoj metodi jer onda bude greška kod unosa drugog broja
	
	public int preuzmiBroj() {
		int a;
		

		System.out.println("Unesi prvi broj");	
		
		for(;;) {
			a = this.ulaz.nextInt();
			
			if(a<=1000 && a>0) {
				break;
			}
			System.out.println("Najmanji maoguæi unos je 1, a najveæi 1000");
		}		
		
		return a;
	}
	
	public int preuzmiBroj(int a) {
		
		int b, najveciDopusteniBroj;
		
		najveciDopusteniBroj = 1000/a;
		
		

		System.out.println("Unesi drugi broj");	
		
		for(;;) {
			b = this.ulaz.nextInt();
			
			if(b<=najveciDopusteniBroj && b>0) {
				break;
			}
			System.out.println("Najmanji moguæi unos je 1 a najveæi je " + najveciDopusteniBroj);
		}		
		
		return b;
		
	}
	
	public void zatvoriUlaz() {
		this.ulaz.close();
	}
	
	
	
	
}
