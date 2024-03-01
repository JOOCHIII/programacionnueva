package interfaz1;

import javax.swing.JOptionPane;

public class Uso_deInterfaces {

	public static void main(String[] args) {

		int x = 0;

		condones durex = new condones();
		lubricante hacendado = new lubricante();

		int producto = Integer.parseInt(JOptionPane.showInputDialog("\n1)condones" + "\n2)lubricante"));

		switch (producto) {

		case 1:
			while (x < 3) {
				int opcion = Integer
						.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion) {
				case 1:
					durex.obtenerStock();
					break;
				case 2:
					durex.actualizarStock();
					break;

				case 3:
					x = 3;
					break;
				}
			}

			break;

		case 2:
			int y = 3;
			while (y < 3) {
				int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion2) {
				case 1:
					hacendado.obtenerStock();
					break;
				case 2:
					hacendado.actualizarStock();
					break;

				case 3:
					y = 3;
					break;
				}
			}
			break;
		}
	}

}
