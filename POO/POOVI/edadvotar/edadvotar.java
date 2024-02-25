package edadvotar;

import javax.swing.JOptionPane;

public class edadvotar {
	public static void main(String[] args) {
	
		//pongo el final para q sea fijo
		final int edadvoto=18;
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("mete tu edad: "));
		
		if (edad >= edadvoto) {
		JOptionPane.showMessageDialog(null, "Enohorabuena chaval puedes votar");
			
		} else {
			JOptionPane.showMessageDialog(null, "No  puedes votar menorcin");

		}
	
	}

}
