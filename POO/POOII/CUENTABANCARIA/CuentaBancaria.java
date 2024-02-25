package CUENTABANCARIA;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	
public void establece_saldo(){
	
	saldo=500;
	
}
public String dime_saldo() {
	
	return "En mi cuenta tengo un saldo de"+saldo;
}
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}


}