package app.Controllers;

import java.awt.*;
import app.*;

public class Controller {

	public static String incio() {
		return "Comienzo del programa";
	}

	public void setAccountValues(TextField t1, TextField t2, TextField t3, TextField t4) {
		String nombre = t1.getText().toString();
		String numero = t2.getText().toString();
		String saldo = t3.getText().toString();

		try {
			int numero1 = Integer.parseInt(numero);
			double saldo1 = Double.parseDouble(saldo);
			CuentaBancaria cuenta = new CuentaBancaria(nombre, numero1, saldo1);

			t4.setText(cuenta.getNombre() + ", " + cuenta.getNumero() + ", " + cuenta.getSaldo());
		} catch (Exception e) {
			t4.setText("Ha ocurrido un terrible error");
		}
	}

	public void setLaptopValues1() {

		String marca = "Lenovo";
		String modelo = "ACH3";
		double memoria = 512.3;
		double precio = 120.02;

		try {
			Laptop laptop = new Laptop();
			laptop.setMarca(marca);
			laptop.setModelo(modelo);
			laptop.setMemoria(memoria);
			laptop.setPrecio(precio);

			System.out.println(String.format("Tengo un nuevo computador de marca"
					+ "%s, \nes de modelo %s \ny tiene una memoria RAM de %s MB"
					+ "\nfinalmente me costó $ %s ", laptop.getMarca(), laptop.getModelo(),
					laptop.getMemoria(), laptop.getPrecio()));

			System.exit(1);

		} catch (Exception e) {
			System.out.println("Hubo un problema con la ejecución del programa");
		}
	}

	public void setLaptopValues2() {

		String marca = "Lenovo";
		String modelo = "ACH3";
		int memoria = 512;
		double precio = 120.02;

		try {
			Laptop laptop = new Laptop(marca, modelo, memoria, precio);

			System.out.println(String.format("Tengo un nuevo computador de marca"
					+ "%s, \nes de modelo %s \ny tiene una memoria RAM de %s MB"
					+ "\nfinalmente me costó $ %s", laptop.getMarca(), laptop.getModelo(),
					laptop.getMemoria(), laptop.getPrecio()));

			System.exit(1);

		} catch (Exception e) {
			System.out.println("Hubo un problema con la ejecución del programa");
		}
	}
	
	public void setLaptopValues3() {

		String marca = "Lenovo";
		String modelo = "ACH3";
		int memoria = 512;
		int precio = 120;

		try {
			Laptop laptop = new Laptop(marca, modelo, memoria, precio);

			System.out.println(String.format("Tengo un nuevo computador de marca"
					+ "%s, \nes de modelo %s \ny tiene una memoria RAM de %s MB"
					+ "\nfinalmente me costó $ %s", laptop.getMarca(), laptop.getModelo(),
					laptop.getMemoria(), laptop.getPrecio()));

			System.exit(1);

		} catch (Exception e) {
			System.out.println("Hubo un problema con la ejecución del programa");
		}
	}

}
