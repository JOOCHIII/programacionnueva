package INVENTARIO;

import javax.swing.JOptionPane;

public class Use_Inventarios {

	public static void main(String[] args) {
		
		
		
		Inventarios [] productos= new Inventarios[2];
		for (int i = 0; i < productos.length; i++) {
			String nombreProducto = JOptionPane.showInputDialog("Introduce el nombre del producto: ");
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese la cantidad:"));
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Ahora introduce el precio:"));
			productos[i] = new Inventarios(nombreProducto, cantidad, precio);
		}
		JOptionPane.showMessageDialog(null, "Inventario de productos");
		JOptionPane.showMessageDialog(null, productos);

	}

}
