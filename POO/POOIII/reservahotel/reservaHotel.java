package reservahotel;

public class reservaHotel {

	private int numerohabitacion;
	private String tipodehabitacion;
	private Boolean libre = true;
	private int ocupadas[] = new int[10];
	private String tipoOcupadas[] = new String[10];

	public void habitacion(int numerohabitacion, String habiTipo) {
		this.numerohabitacion = numerohabitacion;
		this.tipodehabitacion = tipodehabitacion;
		this.setLibre(false);
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == 0) {
				ocupadas[i] = numerohabitacion;
				tipoOcupadas[i] = tipodehabitacion;
				break;
			} else if (ocupadas[i] == this.numerohabitacion) {
				System.out.println("ESTA HABITACION YA ESTA OCUPADA");
				break;
			}
		}

	}

	public void verHabi(int numerohabitacion) {
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == this.numerohabitacion) {
				System.out.println("HABITACION OCUPADA");
			} else {
				System.out.println("HABITACION LIBRE");
			}
		}
	}

	public void cancela(int numerohabitacion) {
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == this.numerohabitacion) {
				ocupadas[i] = 0;
				System.out.println("RESERVA CANCELADA");
				break;
			} else {
				System.out.println("RESERVA NO ENCONTRADA");
				break;
			}
		}
	}

	public void disponibilidad() {
		System.out.println("ESTAS SON LAS HABITACIONES OCUPADAS");
		for (int i = 0; i < ocupadas.length; i++) {
			System.out.print(ocupadas[i] + " "+ tipoOcupadas[i]);
		}
	}

	public String resumen() {
		return "Has reservado la habitacion numero " + numerohabitacion + " del tipo " + tipodehabitacion;
	}

	public Boolean getLibre() {
		return libre;
	}

	public void setLibre(Boolean libre) {
		this.libre = libre;
	}

}
