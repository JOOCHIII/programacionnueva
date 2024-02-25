
package POOV;

import java.time.LocalDate;

import javax.swing.JOptionPane;
//AA
public class USO_EMPLEADOpanel {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo diario"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de alta"));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de alta"));

        Empleado nuevo = new Empleado(nombre, sueldo, year, month, day);

        JOptionPane.showMessageDialog(null, "Nombre: " + nuevo.dameNombre() +
                                            "\nSueldo: " + nuevo.dameSueldo() +
                                            "\nFecha de Contrato: " + nuevo.dameFechaContrato());
    }
}

class Empleados {
    private String nombre;
    private double sueldo;
    private LocalDate altaContrato;

    public Empleados(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;

        altaContrato = LocalDate.of(agno, mes, dia);
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

    public void estableceFecha(int agno, int mes, int dia) {
        this.altaContrato = LocalDate.of(agno, mes, dia);
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
