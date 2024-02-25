package bancos;

public class ProcesamientosPagos {

	interface ProcesadorPago {
		
		
		public static double dinero = 0;

		public void realizarPago();

		public void reembolsarPago();
	}
}
