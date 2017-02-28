import java.util.Scanner;

import javax.swing.JFrame;

import resources.views.AppletInterfaz;

public class Interfaz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Seleccione a continuación el applet de su interés \n"
				+ "1. AppletInterfaz \n"
				+ "2. AppletManejadores \n"
				+ "3. AppletCalculadora \n"
				);
		
		int decision = in.nextInt();
		
		if (decision == 1) {
			System.out.println("Ir a AppletInterfaz.java en el paquete resources/views\n"
					+ "No hubo forma de abrirla desde aqu� \n"
					+ "No quiero tener tantos proyectos diferentes");
		} else if (decision == 2) {
			System.out.println("Ir a AppletManejadores.java en el paquete resources/views");
		}

	}

}
