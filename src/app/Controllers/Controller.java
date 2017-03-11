package app.Controllers;

import java.awt.*;

import app.CuentaBancaria;

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

}
