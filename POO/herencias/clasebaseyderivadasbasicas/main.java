package clasebaseyderivadasbasicas;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		String marca = JOptionPane.showInputDialog("Ingrese la marca");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
		int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehiculo"));
		String tipodecombustible = JOptionPane.showInputDialog("Ingrese el combustible que usa");

		claseautomovil auto = new claseautomovil(marca, modelo, año, tipodecombustible);
	
		String mensaje = "tu puto coche:\n"+
				"la marca : "+auto.getMarca()+"\n"+
				"el modelo " +auto.getModelo()+"\n"+
				"el año " +auto.getAño()+ "\n"+
				"tipo de combustible: "+auto.getTipodecombustible()+ "\n";
		JOptionPane.showMessageDialog(null,mensaje);
	}
}
