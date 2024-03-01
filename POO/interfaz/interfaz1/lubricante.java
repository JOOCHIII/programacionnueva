package interfaz1;

import javax.swing.JOptionPane;

import interfaz1.GestionDeInventarios.interfaz;


public class lubricante implements interfaz {
	public static int cantidad =67;

	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + lubricante.cantidad);

	}

	public void actualizarStock() {
		lubricante.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese cantidad actualizada"));

	}

}