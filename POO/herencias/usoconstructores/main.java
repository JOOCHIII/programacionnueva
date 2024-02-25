package usoconstructores;

import javax.swing.JOptionPane;



public class main {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu edad"));
		String carrera = JOptionPane.showInputDialog("Ingrese la carrera");

		estudiante est = new estudiante (nombre, edad,carrera);
	
		String mensaje = "resumen:\n" +
				"la edad : "+est.getEdad()+"\n"+
				"el nombre " +est.getNombre()+"\n"+
				"el carrera " +est.getCarrera()+"\n";
		JOptionPane.showMessageDialog(null,mensaje);
	}

}
