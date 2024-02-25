package ESTUDIANTE;

import javax.swing.JOptionPane;

public class Usar_Estudiante {

    public static void main(String[] args) {

        Estudiantes alumno = new Estudiantes();

        // Corrección: Cambié el nombre del método establece_nombre
        alumno.establecerNombre(JOptionPane.showInputDialog("Introduce el nombre"));
        System.out.println(alumno.obtenerNombre());

        // Corrección: Convertí la entrada de edad a entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
        alumno.establecerEdad(edad);
        System.out.println(alumno.obtenerEdad());

        // Corrección: Convertí la entrada de grado a entero
        int grado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el grado"));
        alumno.establecerGrado(grado);
        System.out.println(alumno.obtenerGrado());
    }
}
