package añobisiesto;

import javax.swing.JOptionPane;

public class añobisiesto {

	public static void main(String[] args) {
		int año = Integer.parseInt(JOptionPane.showInputDialog("mete un año:"));

		final int divisible4 = 4;
		final int divisible100 = 100;
		final int divisible400 = 400;

		if ((año % divisible4 == 0 && año % divisible100 != 0) || (año % divisible400 == 0)) {
			JOptionPane.showMessageDialog(null, año + " es un año bisiesto.");
		} else {
			JOptionPane.showMessageDialog(null, año + " no es un año bisiesto.");
		}
	}
}
