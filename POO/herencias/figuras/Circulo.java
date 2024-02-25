package figuras;

public class Circulo extends Figura {

 double rad;

public Circulo(double rad) {
    this.rad = rad;//aa
}

public double calcularArea() {
    return Math.PI * rad * rad;
}
}
