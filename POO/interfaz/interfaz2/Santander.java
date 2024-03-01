package interfaz2;

import javax.swing.JOptionPane;

import interfaz2.pagos.Pago;

public class Santander implements Pago {
	public static double dinero = 1;
	String contra = "2002";
	double cantidad = 50;

	@Override
	public void realizarPago() {
		String pin = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");

		if (contra.equals(pin)) {
			JOptionPane.showMessageDialog(null,  "\nDinero en cuenta: "+ Santander.dinero);
			Santander.dinero = Santander.dinero - cantidad;
			JOptionPane.showMessageDialog(null,
					"\nCantidad de Transaccion: " + cantidad + "\nDinero en cuenta: " + Santander.dinero);
		} else {
			JOptionPane.showMessageDialog(null, "\n macho esta mal,espabila  un poco ");
		}

	}

	@Override
	public void reembolsarPago() {
		Santander.dinero=Santander.dinero + cantidad;
		 JOptionPane.showMessageDialog(null,"ahi esta tu dinero" +"\nDinero en cuenta: " + Santander.dinero+  " que locura estas forrado");

	}

}
