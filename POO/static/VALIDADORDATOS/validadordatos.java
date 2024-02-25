package VALIDADORDATOS;

public class validadordatos {
	public static int validadorNumeroPrimo;
	public static double validadorNumeroNegativo;
	
	public static void validadorNumeroPrimo(double num1) {
		
		if(num1/ num1==0 && num1/1==0) {
			
			System.out.println("Es primo");
			
		}else {
			
			System.out.println("No es primo");
			
		}
	}
	//a
	public static void validadorNumeroNegativo(double num2) {
		
		if(num2 <0) {
			
			System.out.println("Es negativo");
			
		}else if (num2==0) {
			
			System.out.println("Es 0");
			
		}else {
			
			System.out.println("Es positivo");
		}
	}
	

	public static void main(String[] args) {
		
		double num1=15656;
		double num2=-5767;
		
		System.out.println("El numero "+num1+ +validadordatos.validadorNumeroPrimo);
		System.out.println("El numero "+num2+ +validadordatos.validadorNumeroNegativo);

	}

}

