package interfaz2;

import javax.swing.JOptionPane;

import interfaz2.pagos.Pago;

public class Caixa implements Pago{
public static double dinero = 8000000;
String contra = "0000";
double cantidad = 78;
	
	
	@Override
	public void realizarPago() {
		String pinI = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");
		
		if(contra.equals(pinI)){
			JOptionPane.showMessageDialog(null,  "\nDinero en cuenta: "+ Caixa.dinero);
			Caixa.dinero = Caixa.dinero - cantidad;
			JOptionPane.showMessageDialog(null, "\nCantidad de Transaccion: " + cantidad + "\nDinero en cuenta: "
					+ Caixa.dinero);
		}else {
			JOptionPane.showMessageDialog(null, "\nError, fallo de transacción");
		}
		
		
	}

	@Override
	public void reembolsarPago() {
		 Caixa.dinero=Caixa.dinero + cantidad;
		 JOptionPane.showMessageDialog(null,"Reembolso realizado" + "\nDinero en cuenta: "+ Caixa.dinero);
	}

}
