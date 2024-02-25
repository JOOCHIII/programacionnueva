
package EMPLEADO;

import javax.swing.JOptionPane;

public class Usar_Empleado {

	public static void main(String[] args) {
		
		Empleado []empleados= new Empleado[5];
		
		for(int i=1; i<5; i++) {
			
			String nombre= JOptionPane.showInputDialog("Introduce el nombre del empleado:");
			double horas_hechas= Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));
			double tarifa=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa que tenga: "));
			
			empleados[i]=new Empleado(nombre,horas_hechas,tarifa) ;
				
			
			}
		StringBuilder salario=new StringBuilder();
		
		for(int i=1; i<5; i++) {
			
		System.out.println(JOptionPane.showInputDialog("El salario es: "+salario));
			
		}
		
			
			
		}

	}


