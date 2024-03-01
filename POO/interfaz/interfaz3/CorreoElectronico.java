package interfaz3;

import javax.swing.JOptionPane;

import interfaz3.SistemadeNoificaciones.Noti;

public class CorreoElectronico implements Noti {

	@Override
	public void enviarNotificacion() {
		JOptionPane.showMessageDialog(null, "\nGmail: tu entrada de shoko ");

	}

}
