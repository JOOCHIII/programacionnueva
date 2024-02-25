package conversionunidades;

import conversionunidades.conversionunidades.convertidorunidades;

public class main {
	public static void main(String[] args) {
		double distanciaKilometros = 34;
		double distanciaMillas = convertidorunidades.kmamillas(distanciaKilometros);
		System.out.println(distanciaKilometros + " kilómetros equivalen a " + distanciaMillas + " millas.");

		double temperaturaCelsius = 67;
		double temperaturaFahrenheit = convertidorunidades.celAfa(temperaturaCelsius);
		System.out.println(
				temperaturaCelsius + " grados Celsius equivalen a " + temperaturaFahrenheit + " grados Fahrenheit.");
	}

}
