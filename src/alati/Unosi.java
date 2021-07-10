package alati;

import javax.swing.JOptionPane;

/*****************************************************************
 * alat za lakši naèin preuzimanja unosa od korisnika primjer upotrebe: int a =
 * Unosi.JOPDialogInt("Unesi prvi broj");
 *****************************************************************/

public class Unosi {

	// unosi bez provjere
	public static int JOPDialogInt(String poruka) {
		int i = Integer.parseInt(JOptionPane.showInputDialog(poruka));

		return i;
	}

	public static float JOPDialogFloat(String poruka) {
		float f = Float.parseFloat(JOptionPane.showInputDialog(poruka));

		return f;
	}

	public static double JOPInputDialogDouble(String poruka) {
		double d = Double.parseDouble(JOptionPane.showInputDialog(poruka));

		return d;
	}

	public static String JOPDialogString(String poruka) {
		String s = JOptionPane.showInputDialog(poruka);

		return s;
	}

	// unosi sa provjerom

	// int - je li unos int
	public static int JOPDialogInt(String poruka, String greska) {
		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// int - je li unos int i je li broj manji od limita
	public static int JOPDialogIntMinValue(String poruka, String greska, int minValue) {
		while (true) {
			try {
				int i = Integer.parseInt(JOptionPane.showInputDialog(poruka));

				if (i >= minValue) {
					return i;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// int - je li unos int i je li broj veæi od limita
	public static int JOPDialogIntMaxValue(String poruka, String greska, int maxValue) {
		while (true) {
			try {
				int i = Integer.parseInt(JOptionPane.showInputDialog(poruka));

				if (i <= maxValue) {
					return i;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// int - je li unos int i je li broj van okvira
	public static int JOPDialogInt(String poruka, String greska, int minValue, int maxValue) {
		while (true) {
			try {
				int i = Integer.parseInt(JOptionPane.showInputDialog(poruka));

				if (i >= minValue && i <= maxValue) {
					return i;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// float - je li unos float
	public static float JOPDialogFloat(String poruka, String greska) {
		while (true) {
			try {
				return Float.parseFloat(JOptionPane.showInputDialog(poruka));

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// float - je li unos float i je li broj manji od limita
	public static float JOPDialogFloatMinValue(String poruka, String greska, int minValue) {
		while (true) {
			try {
				float f = Float.parseFloat(JOptionPane.showInputDialog(poruka));

				if (f >= minValue) {
					return f;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// float - je li unos float i je li broj veæi od limita
	public static float JOPDialogFloatMaxValue(String poruka, String greska, int maxValue) {
		while (true) {
			try {
				float f = Float.parseFloat(JOptionPane.showInputDialog(poruka));

				if (f <= maxValue) {
					return f;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// float - je li unos float i je li broj van okvira
	public static float JOPDialogFloat(String poruka, String greska, int minValue, int maxValue) {
		while (true) {
			try {
				float f = Float.parseFloat(JOptionPane.showInputDialog(poruka));

				if (f >= minValue && f <= maxValue) {
					return f;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// double - je li unos double
	public static double JOPDialogDouble(String poruka, String greska) {
		while (true) {
			try {
				return Double.parseDouble(JOptionPane.showInputDialog(poruka));

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// double - je li unos double i je li broj manji od limita
	public static double JOPDialogDoubleMinValue(String poruka, String greska, int minValue) {
		while (true) {
			try {
				double d = Double.parseDouble(JOptionPane.showInputDialog(poruka));

				if (d >= minValue) {
					return d;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// double - je li unos double i je li broj veæi od limita
	public static double JOPDialogDoubleMaxValue(String poruka, String greska, int maxValue) {
		while (true) {
			try {
				double d = Double.parseDouble(JOptionPane.showInputDialog(poruka));

				if (d <= maxValue) {
					return d;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// double - je li unos double i je li broj van okvira
	public static double JOPDialogDouble(String poruka, String greska, int minValue, int maxValue) {
		while (true) {
			try {
				double d = Float.parseFloat(JOptionPane.showInputDialog(poruka));

				if (d >= minValue && d <= maxValue) {
					return d;
				}

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// string - je li prazan
	public static String JOPDialogStringIsEmpty(String poruka, String greska) {
		while (true) {
			try {
				String unos = JOptionPane.showInputDialog(poruka);
				if (unos.length() > 0) {
					return unos;
				}
				throw new Exception();

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

	// string - ima li više od n znakova
	public static String JOPDialogStringMinValue(String poruka, String greska, int limitMin) {
		while (true) {
			try {
				String unos = JOptionPane.showInputDialog(poruka);
				if (unos.length() >= limitMin) {
					return unos;
				}
				throw new Exception();

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}
	
	// string - ima li manje od n znakova
		public static String JOPDialogStringMaxValue(String poruka, String greska, int limitMax) {
			while (true) {
				try {
					String unos = JOptionPane.showInputDialog(poruka);
					if (unos.length() <= limitMax) {
						return unos;
					}
					throw new Exception();

				} catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, greska);
				}
			}
		}

	// string - je li dužina stringa unutar zadanih okvira
	public static String JOPDialogString(String poruka, String greska, int limitMin, int limitMax) {
		while (true) {
			try {
				String unos = JOptionPane.showInputDialog(poruka);
				if (unos.length() > limitMin && unos.length() <= limitMax) {
					return unos;
				}
				throw new Exception();

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, greska);
			}
		}
	}

}
