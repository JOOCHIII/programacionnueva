package conntadorinstancias;

public class contadorinstancias {
    private static int contadorInstancias = 0;

    public contadorinstancias() {
        contadorInstancias++;
    }

    public static int obtenerNumeroInstancias() {
        return contadorInstancias;
    }

    public static void main(String[] args) {
    	contadorinstancias instancia1 = new contadorinstancias();

        System.out.println("ahora hay : " + contadorinstancias.obtenerNumeroInstancias() + " instancia");
    }
}