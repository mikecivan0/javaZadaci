package zadatak8;

public class BrojKojiNedostaje {

	public BrojKojiNedostaje() {
		
		int[] niz = {5,6,7,8,9,10,12,13};
		boolean mark = true;
		
		for(int i=0;i<niz.length-1;i++) {
			if(niz[i]!=niz[i+1]-1) {
				System.out.println("Broj koji nedostaje je " + (niz[i+1]-1));
				mark = false;
				break;
			}
		}
		
		if(mark) {
			System.out.println("Svi brojevi su tu");
		}
		
	}

	public static void main(String[] args) {
		new BrojKojiNedostaje();

	}

}
