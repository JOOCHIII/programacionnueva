package CALIFICACIONES;

import javax.swing.JOptionPane;

public class Use_Curso {

	public static void main(String[] args) {
		Curso psicologia = new Curso();
		
		psicologia.setNombre_curso(JOptionPane.showInputDialog("Introduce el nombre del curso"));
		System.out.println(psicologia.getNombre_curso());
		psicologia.ObtenerCalificacion(JOptionPane.showInputDialog("Introduce la calificacion"));
		System.out.println(psicologia.getCalificacion());
		
		
		JOptionPane.showInternalConfirmDialog(null,"El nombre del curso es: "+psicologia.getNombre_curso());
		System.out.println("----------------------------------------------------------");
		JOptionPane.showInternalConfirmDialog(null, "La nota del curso es:"+psicologia.getCalificacion());
}
}