package correoelectronico;

public class Smartphone extends DispositivoElectronico{
	public Smartphone(String fabricante, int añoDeFabricacion) {
        super(fabricante, añoDeFabricacion);
    }

    public void llamar(String numero) {
        System.out.println("Llamando al número: " + numero);
    }

    public void recibirLlamadas() {
        System.out.println("Recibiendo llamadas :o");
    }

    public void instalarAplicacion(String aplicacion) {
        System.out.println("descargando : " + aplicacion+ ";)");
    }
}
