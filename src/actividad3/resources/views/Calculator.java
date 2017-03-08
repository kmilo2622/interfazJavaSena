package actividad3.resources.views;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import actividad3.resources.GeneralController;

public class Calculator extends Applet implements ActionListener {
	
	/**
	 * Programa desarrollado por Juan Camilo Arroyave Rico
	 * Para el Servicio Nacional de Aprendizaje SENA
	 * 
	 * Hice este trabajo en dos IDE's, tomando como el mejor
	 * a eclipse con algunas modificicaciones para aumentar 
	 * su rendimiento... Netbeans ha perdido mi confianza.
	 */
	private static final long serialVersionUID = 1L;
	
	//Hemos de crear todas las variables correspondientes, de esta manera podemos utilizarla
	//En las demás partes de la clase sin problemas.
	
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button suma, resta, multi, divi, raiz1, raiz2, mayor, limpia;
	Panel p1, p2, pg, p3;
	GeneralController con = new GeneralController();

	public Calculator() {
		
		pg = new Panel(new GridLayout(3, 7, 0, 0)); 
		p1 = new Panel(new GridLayout(2, 2, 0, 0)); 
		p2 = new Panel(new GridLayout(4, 2, 5, 5)); 
		p3 = new Panel(new GridLayout(3, 2, 5, 5)); 
		//Declaración de los Labels
		l1 = new Label("Numero 1");
		l2 = new Label("Numero 2");
		l3 = new Label("Resultado");
		//Declaración de los Textfields
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		
		t3.setEditable(false);
		//Declaración de todos los botones
		suma = new Button("suma");
		resta = new Button("resta");
		multi = new Button("multi");
		divi = new Button("divi");
		raiz1 = new Button("raiz1");
		raiz2 = new Button("raiz2");
		mayor = new Button("mayor");
		limpia = new Button("limpia");
		//Les damos acciones a los botones
		suma.addActionListener(this);
		resta.addActionListener(this);
		multi.addActionListener(this);
		divi.addActionListener(this);
		raiz1.addActionListener(this);
		raiz2.addActionListener(this);
		mayor.addActionListener(this);
		limpia.addActionListener(this);
		
		//Agregamos todo en el layout
		p1.add(l1);
		p1.add(l2);
		p1.add(t1);
		p1.add(t2);
		
		//Agregamos los botones
		p2.add(suma);
		p2.add(resta);
		p2.add(multi);
		p2.add(divi);
		p2.add(raiz1);
		p2.add(raiz2);
		p2.add(mayor);
		p2.add(limpia);
		
		//Agregamos los campos de resultado
		p3.add(l3);
		p3.add(t3);
		
		pg.add(p1);
		pg.add(p2);
		pg.add(p3);
		
		add(pg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String primer = t1.getText();
		String segundo = t2.getText();
		
		if (e.getSource() == suma) {
			con.sumar(primer, segundo, t3);
		}
		
		if (e.getSource() == resta) {
			con.restar(primer, segundo, t3);
		}
		
		if (e.getSource() == multi) {
			con.multiplicar(primer, segundo, t3);
		}
		
		if (e.getSource() == divi) {
			con.dividir(primer, segundo, t3);
		}
		
		if (e.getSource() == raiz1) {
			con.raiz(primer, t3);
		}
		
		if (e.getSource() == raiz2) {
			con.raiz(segundo, t3);
		}
		
		if (e.getSource() == mayor) {
			int numero1 = Integer.parseInt(primer);
			int numero2 = Integer.parseInt(segundo);
			
			if (numero1 > numero2) {
				t2.setText("");
				t3.setText(primer);
			} else if (numero2 > numero1) {
				t1.setText("");
				t3.setText(segundo);
			} else {
				t3.setText("Números iguales");
			}
		}
		
		if (e.getSource() == limpia) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
