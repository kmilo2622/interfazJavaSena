import java.util.Scanner;

import app.Controllers.SetValues;


public class Application {
	
	public static void main(String[] args) {
		
		SetValues set = new SetValues();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hola, bienvenido a este banco hecho por Juan Camilo Arroyave Rico \n" +
				"Por favor ingrese a continuación qué desea realizar en este lugar \n" +
				"1: Cliente nuevo \n" +
				"2. Retiro de dinero - Clientes \n" +
				"3. Retiro de dinero - Empleados");
		
		int operacion = in.nextInt();
		
		if (operacion == 1) {
			
			set.fillValues();
			
		} else if (operacion == 2) {
			
			set.getValues();
			
		} else if (operacion == 3) {
			
			set.getEmployed();
			
		} else {
			System.out.println("Usted presionó " + operacion + " Sesión terminada");
		}

	}

}
