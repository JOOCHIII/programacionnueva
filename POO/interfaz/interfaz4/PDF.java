package interfaz4;

import javax.swing.JOptionPane;

import interfaz4.Exportables.Exportable;

public class PDF implements Exportable {

	@Override
	public void exportarDatos() {		JOptionPane.showMessageDialog(null, "\nahi esta exportado" + "\nFormato: PDF");

	}

}
