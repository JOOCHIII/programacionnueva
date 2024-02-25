package CLASEESTUDIANTE;

public class ClaseEstudiante {
	
	private String nombre;
	private int edad;
	private double calificacion;
	
	
	public void establece_edad() {
		
		edad=18;	
	}
	
	public void establece_nombre() {
		
		nombre="Sofía";
	}
	
	public void establece_calificacion(){
		
		calificacion=8;
	}
	public String dime_edad() {
		
		return "La alumna "+nombre+ " tiene un edad de "+edad+" y una calificacion de "+calificacion+" en programación";
	}

}

