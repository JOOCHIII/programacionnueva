package CALCULADORAIMPUESTOS;

import javax.swing.JOptionPane;

public class CALCULADORA2 { 
	public static void main(String[] args) {
		final double porcentajeimpuesto= 15.0 ;
		String precioproducto = JOptionPane.showInputDialog(" mete el precio del producto: ");
		if (precioproducto != null && !precioproducto.isEmpty()) {
		double precioproductodob = Double.parseDouble(precioproducto);
		
		double impuesto= precioproductodob*(porcentajeimpuesto/100);
        impuesto = Math.round(impuesto * 100.0) / 100.0;

		double preciofinal= precioproductodob+ impuesto;
		String panel= " el precio del producto: "+ precioproducto
		+" \n impuesto " +porcentajeimpuesto+ " euros "+ impuesto
		+" \n precio final: euros "+ preciofinal;
		
		  JOptionPane.showMessageDialog(null, panel);
		} else {
			  JOptionPane.showMessageDialog(null, "porfavor deja de hacer el gilipollas y mete un precio",precioproducto, JOptionPane.ERROR_MESSAGE);

		}
	}
	
}