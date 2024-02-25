package POOV;

import java.time.LocalDate;
import java.util.Scanner;

public class USO_EMPLEADO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el sueldo diario: ");
        double sueldo = scanner.nextDouble();
        System.out.print("Ingrese el año de alta: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese el mes de alta: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día de alta: ");
        int dia = scanner.nextInt();

        Empleado nuevo = new Empleado(nombre, sueldo, año, mes, dia);

        System.out.println("Nombre: " + nuevo.dameNombre());
        System.out.println("Sueldo: " + nuevo.dameSueldo());
        System.out.println("Fecha de Contrato: " + nuevo.dameFechaContrato());
        
    }
}

class Empleado {
    private String nombre;
    private double sueldo;
    private LocalDate altaContrato;

    public Empleado(String nom, double sue, int año, int mes, int dia) {
        nombre = nom;
        sueldo = sue;

        altaContrato = LocalDate.of(año, mes, dia);
    }

    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public LocalDate dameFechaContrato() {
        return altaContrato;
    }

    public void estableceNombre(String nom) {
        this.nombre = nom;
    }

    public void estableceSueldo(double sue) {
        this.sueldo = sue;
    }

    public void estableceFecha(int año, int mes, int dia) {
        this.altaContrato = LocalDate.of(año, mes, dia);
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
