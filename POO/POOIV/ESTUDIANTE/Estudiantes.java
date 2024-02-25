package ESTUDIANTE;

public class Estudiantes {

    private String nombre;
    private int edad;
    private int grado;

    // Constructor
    public Estudiantes() {
        nombre = "jooochii";
        edad = 18;
        grado = 2;
    }

    // Métodos setter y getter para el nombre
    public void establecerNombre(String nombreEstudiante) {
        nombre = nombreEstudiante;
    }

    public String obtenerNombre() {
        return "El nombre del estudiante es " + nombre;
    }

    // Métodos setter y getter para la edad
    public void establecerEdad(int edadEstudiante) {
        edad = edadEstudiante;
    }

    public String obtenerEdad() {
        return "La edad del estudiante es " + edad;
    }

    // Métodos setter y getter para el grado
    public void establecerGrado(int gradoEstudiante) {
        grado = gradoEstudiante;
    }

    public String obtenerGrado() {
        return "El grado del alumno es " + grado;
    }
}
