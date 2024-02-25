package CONTACTO;

public class Contacto {

    private String nombreContacto;
    private String numeroTelefono;
    private String emailContacto;

    // Constructor
    public Contacto(String nombre, String num, String email) {
        this.nombreContacto = nombre;
        this.numeroTelefono = num;
        this.emailContacto = email;
    }

    // Getters y setters
    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String mostrarContacto() {
        String menu = "Nombre del contacto: " + this.nombreContacto;
        menu += "\n---------------------------------------\n";
        menu += "\nNúmero del contacto: " + this.numeroTelefono;
        menu += "\n---------------------------------------\n";
        menu += "\nEmail del contacto: " + this.emailContacto + "\n";
        menu += "\n---------------------------------------\n";
        return menu;
    }
}
