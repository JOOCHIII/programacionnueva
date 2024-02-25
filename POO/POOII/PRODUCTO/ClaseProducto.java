package PRODUCTO;

public class ClaseProducto {

	private String nombre;
	private double precio;
	private int stock;
	
public void define_nombre() {
	nombre="alfombra";
}
public void define_precio() {
	precio=30;
}
public void define_stock() {
	stock=12;
}
public String dime_nombre() {
	
	return "El producto " +nombre+" tiene un precio de "+precio+" pero en stock está a "+stock;
	
}
}
	
	

