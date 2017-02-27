package resources.views;

import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//<applet width="500" height="500" code="AppletInterfaz"></applet>

public class AppletInterfaz extends Applet {

	/**
	 * Hecho por Juan Camilo Arroyave Rico
	 */
	private static final long serialVersionUID = 1L;
	Label l1, l2;
	Choice c1 = new Choice();

	public void start() {
		l1 = new Label("Programa Desarrollado por", Label.CENTER);
		l2 = new Label("Juan Camilo Arroyave Rico", Label.CENTER);
		
		l2.setBackground(Color.WHITE);
		l1.setBackground(Color.WHITE);
		c1.setBackground(Color.WHITE);

		setLayout(new FlowLayout());
		

		//Inicio de llenado de los choices
		c1.add("Seleccione un color");
		c1.add("ROJO");
		c1.add("AZUL");
		c1.add("AMARILLO");

		add(l1);
		add(l2);
		add(c1);

		c1.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = c1.getSelectedItem();

				System.out.println(item);
				
				switch (item) {

				case "ROJO": 
					setBackground(Color.RED);
					break;

				case "AZUL":
					setBackground(Color.BLUE);
					break;

				case "AMARILLO":
					setBackground(Color.YELLOW);
					break;

				default:
					setBackground(Color.WHITE);
					break;
				}
			}

		});
	}

}
