package resources.views;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import app.Controllers.Controller;

public class AppletMetodos extends Applet implements ActionListener {

	/**
	 * Programa realizado por Juan Camilo Arroyave Rico
	 * para el servicio Nacional de Aprendizaje SENA
	 */
	private static final long serialVersionUID = 1L;

	//Comienzo de declaración de todas las variables

	Label l1, l2, l3, l4;
	TextField t1, t2, t3, t4;
	Button b1;

	public AppletMetodos() {

		//Llamo todas las variables
		l1 = new Label("Número de cuenta");
		l2 = new Label("Nombre del cliente");
		l3 = new Label("Saldo de la cuenta");
		l4 = new Label("Resultado");

		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(20); 
		t4 = new TextField(40); 

		t4.setEditable(false);

		b1 = new Button("Despliega Cuenta");

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(l4);
		add(t4);

		b1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			if (t1.getText().equals("")) {
				t4.setText("No hay número de cuenta");
			} else if (t2.getText().equals("")) {
				t4.setText("No hay nombre de cuenta");
			} else if (t3.getText().equals("")) {
				t4.setText("No hay saldo en cuenta");
			} else {
				System.out.println(Controller.incio());
				Controller control = new Controller();
				control.setAccountValues(t2, t1, t3, t4);
			}

		}
	}
}
