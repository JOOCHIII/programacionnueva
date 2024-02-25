package CALIFICACIONES;

public class Curso {

	private String nombre_curso;
	private double calificacion;
	
public Curso() {
	
	nombre_curso="Grado en psicología ";
	calificacion=9;
}

public String getNombre_curso() {
	return nombre_curso;
}

public void setNombre_curso(String nombre_curso) {
	this.nombre_curso = nombre_curso;
}

public double getCalificacion() {
	return calificacion;
}

public void ObtenerCalificacion(String string) {
	
	int calificaciones = 5;
	switch(calificaciones){
		case 1:
		case 2:
			System.out.println("A");
			break;
		case 3:
		case 4:
			System.out.println("B");
			break;
		case 5:
		case 6:
			System.out.println("C");
			break;
		case 7:
		case 8:
			System.out.println("D");
			break;
		case 9:
		case 10:
			System.out.println("E");
			
	

}
}
}
