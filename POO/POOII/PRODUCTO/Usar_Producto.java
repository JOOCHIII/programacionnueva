package PRODUCTO;

public class Usar_Producto {

	public static void main(String[] args) {
		ClaseProducto alfombra=new ClaseProducto();
		alfombra.define_nombre();
		alfombra.define_precio();
		alfombra.define_stock();
		System.out.println(alfombra.dime_nombre());
	}

}
