package interfaz4;

import javax.swing.JOptionPane;

import interfaz4.Exportables.Exportable;

public class CSV implements Exportable {

	@Override
	public void exportarDatos() {		JOptionPane.showMessageDialog(null, "\ntoma exportado" + "\nFormato: CSV");

	}

}
