package usoconstructores;

public class estudiante extends persona {
	String carrera;

	public estudiante() {

	}

	public estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
