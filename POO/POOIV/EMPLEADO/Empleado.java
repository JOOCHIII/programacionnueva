package EMPLEADO;

public class Empleado {

	private String nombre_empleado;
	private double horas_hechas;
	private double tarifa;

	public Empleado(String nombre, double horasTrabajadas, double tarifa) {

		nombre_empleado = nombre;
		horas_hechas = horasTrabajadas;
		tarifa = tarifa;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public double getHoras_hechas() {
		return horas_hechas;
	}

	public void setHoras_hechas(double horas_hechas) {
		this.horas_hechas = horas_hechas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double salario_ganado) {
		this.tarifa = tarifa;
	}

	public double salario() {
		return horas_hechas * tarifa;
	}
}



