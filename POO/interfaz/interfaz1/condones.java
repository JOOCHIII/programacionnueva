package interfaz1;

import javax.swing.JOptionPane;

import interfaz1.GestionDeInventarios.interfaz;

public class condones implements interfaz {
	public static int cantidad =56;

	@Override
	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + condones.cantidad);

	}

	@Override
	public void actualizarStock() {
		condones.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nhemos recargado mira "));

	}

}
