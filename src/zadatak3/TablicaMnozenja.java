package zadatak3;


public class TablicaMnozenja {

	public static void main(String[] args) {
		// ispis tablice mno�enja do 1000 prema une�enim brojevima
		
		Unosi unos = new Unosi();
		
		int a = unos.preuzmiBroj();
		
		int b = unos.preuzmiBroj(a);
		
		unos.zatvoriUlaz();

		Tablica.ispisiTablicu(a, b);
	}
}
