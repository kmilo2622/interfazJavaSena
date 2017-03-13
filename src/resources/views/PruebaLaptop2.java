package resources.views;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import app.Controllers.Controller;

public class PruebaLaptop2 extends Applet implements ActionListener {

	/**
	 * Aplicación Desarrollada por Juan Camilo Arroyave Rico
	 * Para el servicio Nacional de Aprenizaje SENA
	 */
	private static final long serialVersionUID = 1L;
	
	//Defino todas las variables que corresponden
	Label l1, l2, l3, l4, l5, l6;
	TextField t1, t2, t3, t4;
	TextArea e1;
	Button b1;
	Choice ch1;
	
	public PruebaLaptop2() {
		
		l1 = new Label("Marca");
		l2 = new Label("Modelo");
		l3 = new Label("Memoria");
		l4 = new Label("Precio");
		l5 = new Label("Seleccione el resultado preferido");
		l6 = new Label("Resultado");
		
		t1 = new TextField(50);
		t2 = new TextField(50);
		t3 = new TextField(50);
		t4 = new TextField(50);
		e1 = new TextArea(10, 50);
		
		e1.setEditable(false);
		
		b1 = new Button("Ver Resultado");
		ch1 = new Choice();
		
		ch1.add("Primer Objeto");
		ch1.add("Segundo Objeto");
		ch1.add("Tercer Objeto");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		
		add(b1);
		
		add(l5);
		add(ch1);
		
		add(l6);
		add(e1);
		
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Controller control = new Controller();
		
		if (e.getSource() == b1) {
			
			if (ch1.getSelectedIndex() == 0) {
				control.setLaptopValues1(t1, t2, t3, t4, e1);
			}
			
			else if (ch1.getSelectedIndex() == 1) {
				control.setLaptopValues2(t1, t2, t3, t4, e1);
			}
			
			else if (ch1.getSelectedIndex() == 2) {
				control.setLaptopValues3(t1, t2, t3, t4, e1);
			}
			
		}
		
	}

}
