package CALCULADORADESCUENTOS;

import javax.swing.JOptionPane;

public class calculadoradescuentos {
	public static void main(String[] args) {
		final double descuento = 10.0;
		double preciounidad = Double.parseDouble(JOptionPane.showInputDialog("mete el precio por unidad "));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas has cogio "));
		double preciototal;

		if (cantidad > 5) {
			preciototal = preciounidad * cantidad * (1 - descuento / 100.0);

		} else {
			preciototal = preciounidad * cantidad;

		}
		JOptionPane.showMessageDialog(null, "precio total con descuento es: "+preciototal);

	}
}
