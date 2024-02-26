package Sobrecarga;

import javax.swing.JOptionPane;

public class Figura {

	public static void main(String[] args) {
		
		rectangulo figura1 = new rectangulo(12, 23);
		rectangulo figura2 = new rectangulo(1.5, 0.2);

		JOptionPane.showMessageDialog(null, "\naltura: " + figura1.getAltura() + "\nancho: " + figura1.getAncho());
		JOptionPane.showMessageDialog(null, "\naltura: " + figura2.getAltura() + "\nancho: " + figura2.getAncho());
	}
	}
	
	public class rectangulo {
		
	private double ancho;
	private double altura;


	public rectangulo(double ancho, double altura) {
		 this.ancho=ancho;
		 this.altura=altura;
		 
	}

	public rectangulo(double ancho, int altura) {
		 this.ancho=ancho;
		 this.altura=altura;
		 
		 
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	}

	
