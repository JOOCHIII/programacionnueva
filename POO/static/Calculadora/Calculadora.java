package Calculadora;

public class Calculadora {

	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public static double restar(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		System.out.println("Suma: " + Calculadora.sumar(5, 8));
		System.out.println("Resta: " + Calculadora.restar(10, 6));
		System.out.println("Multiplicación: " + Calculadora.multiplicar(8, 7));
		System.out.println("División: " + Calculadora.dividir(45, 5));
	}
}
