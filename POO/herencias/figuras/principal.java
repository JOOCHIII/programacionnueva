package figuras;

public class principal {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[26];
        figuras[0] = new Circulo(8);
        figuras[1] = new Rectangulo(6, 65);

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
	}


