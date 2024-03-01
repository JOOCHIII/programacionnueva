package interfaz3;

import javax.swing.JOptionPane;

import interfaz3.SistemadeNoificaciones.Noti;

public class SMS implements Noti {

	@Override
	public void enviarNotificacion() {
		JOptionPane.showMessageDialog(null, "\nSMS: mutua madrileña ");

	}

}
