package AUTOMOVIL;

public class AUTOMOVIL {
    private String marca;
    private String modelo;

    // Setter
    public void establecerMarca() {
        marca = "Mercedes";
    }

    // Getter
    public String obtenerMarca() {
        return "Mi coche es un " + marca;
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
