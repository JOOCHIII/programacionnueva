package Sobrecarga;

import javax.swing.JOptionPane;

public class Estudiante {

	public static void main(String[] args) {
		
		Estudiante hada = new Estudiante(JOptionPane.showInputDialog(null, "Nombre: "),
				JOptionPane.showInputDialog(null, "Apellido: "),
				Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: ")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio academico: ")));

		JOptionPane.showMessageDialog(null, "\nNombre: " + hada.getNombre() + "\nApellido: " + hada.getApellido()
		+ "\nEdad: " + hada.getEdad() + "\nPromedio: " + hada.getPromedioA());
	}
	
	private String nombre;
	private String apellido;
	private int edad;
	private double promedioA;

	public Estudiante(String nombre, String apellido, int edad, double promedioA) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.promedioA = promedioA;
	}

	public Estudiante(String nombre, int edad, double promedioA) {

		this.nombre = nombre;
		this.edad = edad;
		this.promedioA = promedioA;
	}

	public Estudiante(int edad, double promedioA, String nombre) {

		this.nombre = nombre;
		this.edad = edad;
		this.promedioA = promedioA;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPromedioA() {
		return promedioA;
	}

	public void setPromedioA(double promedioA) {
		this.promedioA = promedioA;
	}

}
