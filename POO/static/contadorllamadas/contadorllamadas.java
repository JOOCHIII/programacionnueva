package contadorllamadas;

public class contadorllamadas {
	 private static int contadorLlamadas = 0;

	    public static void realizarOperacion() {
	        System.out.println("Realizando operación...");
	        contadorLlamadas++;
	    }

	    public static int obtenerContadorLlamadas() {
	        return contadorLlamadas;
	    }

	    public static void main(String[] args) {
	        realizarOperacion();
	        realizarOperacion();
	        realizarOperacion();

	        System.out.println("Número de llamadas al método: " + obtenerContadorLlamadas());
	    }
	}

