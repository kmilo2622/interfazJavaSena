package resources.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.Controllers.GeneralController;

import java.applet.*;

//<applet width="1500" height="500" code="AppletManejadores"></applet>
public class AppletManejadores extends Applet {

	private static final long serialVersionUID = 1L;

	/*
	 * Programa desarrollado por Juan Camilo Arroyave Rico
	 * Para el Servicio Nacional de Aprendizaje Sena
	 */

	//Creamos desde aqui todos los elementos correspondientes. 

	Label l1, l2, l3;
	TextField e1, e2, e3;
	Button suma, resta, multi, division, raizX, raizY, xY, yX, xModY;

	String f1, f2;

	GeneralController controller = new GeneralController();

	public AppletManejadores() {
		setLayout(new GridLayout(5,3,10,10));
		setSize(1400, 500);

		//Luego de crear el Layout para el Applet, comenzamos a posicionar todos los
		//elementos correspondientes

		//Labels

		l1 = new Label("X");
		l2 = new Label("Y");
		l3 = new Label("RESULTADO");

		//Text Fields

		e1 = new TextField();
		e2 = new TextField();
		e3 = new TextField();

		e3.setEditable(false);

		//Botones

		suma = new Button("+");
		resta= new Button("-");
		multi= new Button("x");
		division = new Button("/");
		raizX = new Button("Raiz x");
		raizY = new Button("Raiz y");
		xY = new Button("x a la y");
		yX = new Button("y a la x");
		xModY = new Button("x mod y");

		acciones();

		add(l1);
		add(l2);
		add(l3);

		add(e1);
		add(e2);
		add(e3);

		add(suma);
		add(resta);
		add(multi);
		add(division);
		add(raizX);
		add(raizY);
		add(xY);
		add(yX);
		add(xModY);
	}

	private void acciones() {

		suma.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.sumar(f1, f2, e3);
			}
		});

		resta.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.restar(f1, f2, e3);
			}
		});

		multi.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.multiplicar(f1, f2, e3);
			}
		});

		division.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.dividir(f1, f2, e3);
			}
		});

		raizX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				controller.raiz(f1, e3);
			}
		});

		raizY.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e2.getText();
				controller.raiz(f1, e3);
			}
		});

		xY.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.dividir(f1, f2, e3);
			}
		});

		yX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.dividir(f2, f1, e3);
			}
		});

		xModY.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f1 = e1.getText();
				f2 = e2.getText();
				controller.module(f2, f1, e3);
			}
		});


	}

}
