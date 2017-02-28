package resources.views;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<applet width="500" height="500" code="AppletCalculadora"></applet>
public class AppletCalculadora extends Applet implements ActionListener {

	/*
	 * Programa desarrollado por Juan Camilo Arroyave Rico
	 * Para el servicio Nacional de Aprendizaje SENA.
	 */
	private static final long serialVersionUID = 1L;

	//Nombramiento de todas las variables necesarias
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	Button bp, bc, bce, big, bmas, bmenos, bpor, bdiv;

	TextField t1;

	Panel p1, p2;

	public AppletCalculadora() {

		setLayout(new FlowLayout());

		p1 = new Panel(new GridLayout(6, 3, 5, 5));
		p2 = new Panel(new FlowLayout());

		t1 = new TextField(20);

		//Botones
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		bp = new Button(".");
		b0 = new Button("0");
		bce = new Button("CE");

		bmas = new Button("+");
		bmenos = new Button("-");
		big = new Button("=");

		bpor = new Button("x");
		bdiv = new Button("/");
		bc = new Button("C");
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		p2.add(t1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(bp);
		p1.add(b0);
		p1.add(bce);
		p1.add(bmas);
		p1.add(bmenos);
		p1.add(big);
		p1.add(bpor);
		p1.add(bdiv);
		p1.add(bc);

		add(p2);
		add(p1);



	}

	public void actionPerformed(ActionEvent e) {

		StringBuilder string = new StringBuilder();
		if (e.getSource() == b1) {
			string.append("1");
			t1.setText(string.toString());
		}
		else if (e.getSource() == b2) {
			string.append("2");
			t1.setText(string.toString());
		}
	}

}
