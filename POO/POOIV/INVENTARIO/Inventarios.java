package INVENTARIO;

public class Inventarios {

	private String producto;
	private int cantidad;
	private double precio;
	
// Constructor
public Inventarios(String nombre, int cantidad, double newPrecio) {
	this.producto = nombre;
	this.cantidad = cantidad;
	precio = newPrecio;
}
public String getProducto() {
	return producto;
}

public void setProducto(String producto) {
	this.producto = producto;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
public String toString() {
	String resultado = "Nombre del producto: " + this.producto;
	resultado += "\n---------------------------------------\n";
	resultado += "\nPrecio del producto: " + this.precio + " €";
	resultado += "\n---------------------------------------\n";
	resultado += "\nCantidad del producto: " + this.cantidad + "\n";
	resultado += "\n---------------------------------------\n";
	return resultado;
}

}
