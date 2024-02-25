package clasebaseyderivadasbasicas;

public class claseautomovil extends clasevehiculo {
	private String tipodecombustible;

	public claseautomovil(String marca, String modelo, int año, String tipodecombustible) {
		super(marca, modelo, año);
		this.tipodecombustible = tipodecombustible;
	}

	public String getTipodecombustible() {
		return tipodecombustible;
	}

	public void setTipodecombustible(String tipodecombustible) {
		this.tipodecombustible = tipodecombustible;
	}

}
