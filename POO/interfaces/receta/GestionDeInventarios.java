package receta;

public class GestionDeInventarios {

	public interface Inventariable {//interfaz//
		public static int cantidad = 0;

		public void obtenerStock();

		public void actualizarStock();

	}
}
