package interfaz3;

public class Uso_de_Sistema {

	public static void main(String[] args) {
				CorreoElectronico shoko = new CorreoElectronico();
		shoko.enviarNotificacion();
				SMS banco = new SMS();
		banco.enviarNotificacion();

	}

}
