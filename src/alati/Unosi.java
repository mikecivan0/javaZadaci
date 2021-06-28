package alati;

import javax.swing.JOptionPane;

 /*****************************************************************
 * alat za lakši naèin preuzimanja 
 * unosa od korisnika
 * primjer upotrebe: int a = Unosi.JOPDialogInt("Unesi prvi broj");
 *****************************************************************/

public class Unosi {

	public static int JOPDialogInt(String poruka) {
		int i = Integer.parseInt(
					JOptionPane.showInputDialog(poruka)
				);
		
		return i;
	}
	
	public static float JOPDialogFloat(String poruka) {
		float f = Float.parseFloat(
					JOptionPane.showInputDialog(poruka)
				);
		
		return f;
	}
	
	public static double JOPInputDialogDouble(String poruka) {
		double d = Double.parseDouble(
					JOptionPane.showInputDialog(poruka)
				);
		
		return d;
	}
	
	public static String JOPDialogString(String poruka) {
		String s = JOptionPane.showInputDialog(poruka);
		
		return s;
	}	
	
}
