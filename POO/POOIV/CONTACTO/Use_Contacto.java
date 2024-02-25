package CONTACTO;

import javax.swing.JOptionPane;

public class Use_Contacto {

	public static void main(String[] args) {
		
		Contacto [] menu= new Contacto[50];
		
		while(true) {
		
		int opciones=Integer.parseInt(JOptionPane.showInputDialog("MENU DE CONTACTOS\n OPCIONES\n 1:Añadir contacto\n 2: Buscar contacto\n 3:Mostrar contactos"));
		
		switch(opciones) {
		
		case 1:

			for (int i = 0; i < menu.length; i++) {
				if (menu[i] == null) {
					String nombre;
					String telefono;
					String email;
					menu[i] = new Contacto(nombre = JOptionPane.showInputDialog("Ingrese el nombre: "),
							telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono: "),
							email = JOptionPane.showInputDialog("Ingrese la dirección de email: "));
					break;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Contacto añadido con éxito");

		
		
		case 2:

			String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre:");
			String contactoEncontrado = "CONTACTO";

			for (int i = 0; i < menu.length; i++) {
				if (menu[i].getNombreContacto().equalsIgnoreCase(buscarNombre)) {
					contactoEncontrado += "\nNOMBRE: " + menu[i].getNombreContacto() + "\nNUMERO: "
							+menu[i].getNumeroTelefono() + "\nMAIL: " + menu[i].getEmailContacto();

					JOptionPane.showMessageDialog(null, contactoEncontrado);

					break;

				} else if (i > menu.length) {
					JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
					break;
				}
			}

		case 3:

			String agendaCompleta = "MENU";

			for (int i = 0; i < menu.length; i++) {
				if (menu[i] != null) {
					agendaCompleta += "\nNOMBRE: " + menu[i].getNombreContacto() + "\nNUMERO: " + menu[i].getNumeroTelefono()
							+ "\nMAIL: " + menu[i].getEmailContacto() + "\n___________________________________________";
				}
			}
			JOptionPane.showMessageDialog(null, agendaCompleta);

			break;

		case 4:

			JOptionPane.showMessageDialog(null, "Saliendo del programa.");
			System.exit(0);

		default:
			JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			break;
		}

	}
}
	}

