package interfaz2;

import javax.swing.JOptionPane;

public class Uso_declases {

	public static void main(String[] args) {
		Caixa jochi = new Caixa();
		Santander sofi = new Santander();

		JOptionPane.showMessageDialog(null, "\nCuenta de jochi");
		jochi.realizarPago();
		jochi.reembolsarPago();

		JOptionPane.showMessageDialog(null, "\nCuenta de sofi");
		sofi.realizarPago();
		sofi.reembolsarPago();

	}
}
