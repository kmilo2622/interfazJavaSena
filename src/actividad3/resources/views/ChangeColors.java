package actividad3.resources.views;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Juan Camilo Arroyave Rico para el servicio Nacional de Aprendizaje
 * SENA
 */
// <applet width="100" height="300" code="AppletColor"></applet>
public class ChangeColors extends Applet implements AdjustmentListener {

    private static final long serialVersionUID = 1L;
    Label l1, l2, l3;
    Scrollbar s1, s2, s3;
    int deslizador1, deslizador2, deslizador3;

    public ChangeColors() {

        l1 = new Label("deslizador 1=");
        l2 = new Label("deslizador 2 =");
        l3 = new Label("deslizador 3 =");
        s1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        s2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        s3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);

        add(s1);
        add(s2);
        add(s3);
        add(l1);
        add(l2);
        add(l3);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {

        deslizador1 = s1.getValue();
        deslizador2 = s2.getValue();
        deslizador3 = s3.getValue();

        l1.setText("deslizador1=" + deslizador1);
        l2.setText("deslizador2=" + deslizador2);
        l3.setText("deslizador3=" + deslizador3);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Color valor = new Color(deslizador1, deslizador2, deslizador3);
        g.drawRect(0, 0, 500, 500);
        g.setColor(valor);
        g.fillRect(0, 0, 500, 500);

    }

}
