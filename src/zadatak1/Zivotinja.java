package zadatak1;

import java.util.Scanner;

public class Zivotinja {

	public static void main(String[] args) {
		
		int indexZivotinje;
		Scanner zivotinja = new Scanner(System.in);		
		System.out.println("Kako bi saznao koja se �ivotinja kako glasa unesi");
		System.out.println("1 za ma�ku");
		System.out.println("2 za psa");
		System.out.println("3 za kravu");
		System.out.println("4 za koko�");
		
		for(;;) {
			indexZivotinje = zivotinja.nextInt();
			
			if(provjeraVrijednosti.provjeriUnos(indexZivotinje, 1, 4)){
				zivotinja.close();
				break;
			}
			
			System.out.println("Unesi neku od ponu�enih vrijednosti");
		}
		
		
		System.out.println(Glasanje.glasanje(indexZivotinje));	
		
		
	}
	
	
	
	
}
