package app.Controllers;

import java.util.Scanner;

import app.BankAccount;
import app.Cliente;

public class SetValues {

	protected String name;
	protected long identification;
	protected long ammount;
	protected int account_id;
	protected String account_name;
	protected String key;

	/*
	 * Hecho por Juan Camilo Arroyave Rico
	 * Para el servicio Nacional de Aprendizaje SENA
	 */

	public void fillValues() {

		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese por favor su nombre");
		name = in.next();
		System.out.println("Ingrese por favor su Identificación");
		identification = in.nextLong();
		System.out.println("Hola " + name + "\n");

		System.out.println("Ingrese su tipo cuenta: 1 para ahorros y 2 para inversión");
		account_id = in.nextInt();

		System.out.println("Ingrese por favor la Cantidad de dinero a Ingresar");
		ammount = in.nextLong();

		if (account_id == 1) {

			account_name = BankAccount.CUENTA_AHORRO;

			if (ammount < 1000) {
				System.out.println("Debe ingresar más de $1000 debido a que es su primer depósito");
				ammount = in.nextLong();
			}
		} else if (account_id == 2) {

			account_name = BankAccount.CUENTA_INVERSION;

			if (ammount < 25000) {
				System.out.println("Debe ingresar más de $25.000 debido a que es su primer depósito");
				ammount = in.nextLong();
				
				if (ammount < 25000) {
					System.out.println("Debe ingresar más de $25.000 debido a que es su primer depósito");
					System.exit(1);
				}
			}
		}

		System.out.println("Ingrese por favor su clave para la cuenta bancaria");
		key = in.next();

		Cliente andres = new Cliente(1, identification, name, ammount, account_id, 
				account_name, "ASDfh");

		in.close();


		System.out.println("Bienvenido " + andres.getName());
		System.exit(1);

	}

	public void getValues() {

		int numero;
		int operacion;
		int account_type;
		int ammount_total = 500;
		int ammount_total_inv = 10000;

		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese por favor su Número de usuario");
		numero = in.nextInt();

		if (numero != 1) {
			System.out.println("Usted no se encuentra registrado");
			System.exit(1);
		}

		System.out.println("Ingrese su operacion \n" + "1. Consignación" +"\n 2.Retiro");
		operacion = in.nextInt();

		if (operacion == 2) {

			System.out.println("Ingrese su número de documento");
			identification = in.nextLong();

			if (identification != 12345) {
				System.out.println("Usted no puede realizar esta operación");
				System.exit(1);
			}

			System.out.println("Hola Andrés ¿Cómo ha estado? \n");

			System.out.println("Ingrese su tipo de cuenta: \n 1. Ahorros \n 2. Inversión");
			account_type = in.nextInt();

			if (account_type == 1) {

				System.out.println("Ingrese la cantidad de dinero a retirar");
				ammount = in.nextLong();

				if (ammount - ammount_total <= 500) {
					System.out.println("Desafortunadamente no tiene suficiente dinero para esta operacion");
					System.exit(1);
				} else {
					System.out.println("Dinero retirado exitosamente - Monto: " + ammount);
					System.exit(1);
				}

			} else if (account_type == 2) {
				
				System.out.println("Ingrese la cantidad de dinero a retirar");
				ammount = in.nextLong();

				if (ammount - ammount_total_inv <= 10000) {					
					System.out.println("Desea cancelar su cuenta a causa de retirar todo el dinero" +
							"\n 1. Si \n 2. No");
					int decision = in.nextInt();
					
					if (decision == 1) {
						System.out.println("Dinero retirado exitosamente \n " +
								"Cuenta cancelada exitosamente");
						System.exit(1);
					} else if (decision == 2) {
						System.out.println("No tienes suficiente dinero para esta operación");
						System.exit(1);
					}
					
				} else {
					System.out.println("Dinero retirado exitosamente - Monto: " + ammount);
					System.exit(1);
				}
			} else {
				System.out.println("Debió seleccionar una operación válida. Hasta luego");
				System.exit(1);
			}
			
			in.close();
		}
	}
	
	public void getEmployed() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese por favor su Número de usuario");
		
	}

}
