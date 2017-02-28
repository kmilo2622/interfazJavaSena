package app.Controllers;

import java.awt.TextField;

public class GeneralController {

	public void sumar(String primer, String segundo, TextField tercero) {

		float f1, f2;
		f1 = Float.parseFloat(primer);
		f2 = Float.parseFloat(segundo);
		float resultado = f1 + f2;
		tercero.setText(String.valueOf(resultado));
	}

	public void restar (String primer, String segundo, TextField tercero) {

		float f1, f2;
		f1 = Float.parseFloat(primer);
		f2 = Float.parseFloat(segundo);
		float resultado = f1 - f2;
		tercero.setText(String.valueOf(resultado));
	}
	
	public void multiplicar (String primer, String segundo, TextField tercero) {

		float f1, f2;
		f1 = Float.parseFloat(primer);
		f2 = Float.parseFloat(segundo);
		float resultado = f1 * f2;
		tercero.setText(String.valueOf(resultado));
	}
	
	public void dividir (String primer, String segundo, TextField tercero) {

		float f1, f2;
		f1 = Float.parseFloat(primer);
		f2 = Float.parseFloat(segundo);
		float resultado = f1 / f2;
		tercero.setText(String.valueOf(resultado));
	}

	public void raiz (String primer, TextField tercero) {

		float f1;
		f1 = Float.parseFloat(primer);
		float resultado = (float) Math.sqrt(f1);
		tercero.setText(String.valueOf(resultado));
	}

	public void potenciar (String primer, String segundo, TextField tercero) {

		double f1, f2;
		f1 = Double.parseDouble(primer);
		f2 = Double.parseDouble(segundo);
		double resultado = Math.pow(f1, f2);
		tercero.setText(String.valueOf(resultado));
	}

	public void module (String primer, String segundo, TextField tercero) {

		double f1, f2;
		f1 = Double.parseDouble(primer);
		f2 = Double.parseDouble(segundo);
		double resultado = f1 % f2;
		tercero.setText(String.valueOf(resultado));
	}


}
