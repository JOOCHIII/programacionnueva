package alarma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		relojAlarma mihora = new relojAlarma();

		int a = 0;
		String b = null;
		String c = null;
		int d;
		do {

			System.out.println("RELOJ");
			System.out.println(mihora.ver_hora());
			System.out.println(
					"|| (1) CAMBIAR HORA | (2) ACTIVAR ALARMA | (3) CONSULTAR ALARMA | (4) VER HORA |(5) SALIR ||");
			a = Integer.parseInt(lector.readLine());
			switch (a) {
			case 1:
				System.out.println("QUE HORA QUIERES PONER");
				c = lector.readLine();
				mihora.cambiar_hora(c);
				break;
			case 2:
				System.out.println("QUIERES ACTIVAR LA ALARMA |(1)SI 0 (2)NO||");
				d = Integer.parseInt(lector.readLine());
				mihora.alarma_On(d);
				if (d == 1) {
					System.out.println("A QUE HORA QUIERES PONER LA ALARMA");
					b = lector.readLine();
					mihora.hora_alarma(b);
					System.out.println("ALARMA ACTIVADA");
				}
				break;
			case 3:
				mihora.ver_activa();
				break;
			case 4:
				break;
			default:
				
			}

		} while (a != 5);
		
		System.out.println("chao");

	}

}
