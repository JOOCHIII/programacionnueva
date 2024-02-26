package Sobrecarga;

import javax.swing.JOptionPane;

public class Cochecillo {

	public static void main(String[] args) {
		Cochecillo Audi = new Cochecillo("Audi", "R8", 2005, "rojo", 5);
		
		JOptionPane.showMessageDialog(null,
				"\nMarca: " + Audi.getMarca() + "\nModelo: " + Audi.getModelo() + "\nAño: " + Audi.getAño()
						+ "\nColor: " + Audi.getColor() + "\nasientos: " + Audi.getAsientos());

		

	}
	 private String marca;
	 private String modelo;
	 private int año;
	 private String color;
	 private int asientos;
	 
	 
	public Cochecillo(String marca, String modelo, int año, String color, int asientos) {//primer constructor//
		
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.asientos = asientos;
	}


	public Cochecillo(String marca, String modelo, String color) {//segundo constructor//
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	 
}
