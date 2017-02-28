package resources.views;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<applet width="500" height="500" code="AppletCalculadora"></applet> 
public class AppletCalculadora extends Applet implements ActionListener{
    /**
	 * Programa desarrollado
	 * por Juan Camilo Arroyave Rico
	 */
	private static final long serialVersionUID = 1L;
	
	// Se crean las variables globales
    Button b0, b00, b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, bs, br, bm, bd, bi, bl, bc;
    TextField t1;
    Panel pgg, pg1, pg2, p1, p2;
    private double numero = 0.0;
    private double resultado = 0.0;
    private String comp = "";
    private String calc;
 
    public AppletCalculadora(){

        setLayout(new GridLayout(1, 1, 0, 0));
        pgg = new Panel(new GridLayout(2, 1, 0, 0)); // Panel General
        pg1 = new Panel(new GridLayout(1, 1, 0, 0)); // Panel de caja de texto
        pg2 = new Panel(new GridLayout(1, 2, 5, 5)); // Panel de botones general
        p1 = new Panel(new GridLayout(4, 3, 5, 5));  // Panel de botones numericos
        p2 = new Panel(new GridLayout(3, 2, 5, 5));  // Panel de botones de operaciones
 
        b0 = new Button("0");
        b00 = new Button("00");
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
        bs = new Button("+");
        br = new Button("-");
        bm = new Button("*");
        bd = new Button("/");
        bi = new Button("=");
        bc = new Button("C");
        bl = new Button("CE");
        t1 = new TextField();
 
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b00);
        p1.add(b0);
        p1.add(bp);
 
        p2.add(bs);
        p2.add(br);
        p2.add(bm);
        p2.add(bd);
        p2.add(bi);
        p2.add(bc);
        p2.add(bl);
 
        pg1.add(t1);
        pg2.add(p1);
        pg2.add(p2);
 
        pgg.add(pg1);
        pgg.add(pg2);
 
        add(pgg);
 
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bs.addActionListener(this);
        br.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bi.addActionListener(this);
        b0.addActionListener(this);
        b00.addActionListener(this);
        bp.addActionListener(this);
        bl.addActionListener(this);
        bc.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent boton){

        if (boton.getSource() == b0){
            calc = t1.getText();
            t1.setText(calc + "0");
        }
 
        if (boton.getSource() == b00){
            calc = t1.getText();
            t1.setText(calc + "00");
        }
 
        if (boton.getSource() == b1){
            calc = t1.getText();
            t1.setText(calc + "1");
        }
 
        if (boton.getSource() == b2){
            calc = t1.getText();
            t1.setText(calc + "2");
        }
 
        if (boton.getSource() == b3){
            calc = t1.getText();
            t1.setText(calc + "3");
        }
 
        if (boton.getSource() == b4){
            calc = t1.getText();
            t1.setText(calc + "4");
        }
 
        if (boton.getSource() == b5){
            calc = t1.getText();
            t1.setText(calc + "5");
        }
 
        if (boton.getSource() == b6){
            calc = t1.getText();
            t1.setText(calc + "6");
        }
 
        if (boton.getSource() == b7){
            calc = t1.getText();
            t1.setText(calc + "7");
        }
 
        if (boton.getSource() == b8){
            calc = t1.getText();
            t1.setText(calc + "8");
        }
 
        if (boton.getSource() == b9){
            calc = t1.getText();
            t1.setText(calc + "9");
        }
 
        if (boton.getSource() == bp){
            calc = t1.getText();
            t1.setText(calc + ".");
        }
 
        if (boton.getSource() == bs){
            funcSuma();
        }
 
        if (boton.getSource() == br){
            funcResta();
        }
 
        if (boton.getSource() == bm){
            funcMult();
        }
 
        if (boton.getSource() == bd){
            funcDiv();
        }
        
        if (boton.getSource() == bi){
        	funcIgualdad();
        }
 
        if (boton.getSource() == bc){
        	t1.setText(t1.getText().substring(0, t1.getText().length()-1));
        }
 
        if (boton.getSource() == bl){
            resultado = 0.0;
            numero = 0.0;
            comp = "";
            calc = "";
            t1.setText("");
        }
    }
 
    public void funcSuma(){

        if(t1.getText() == ""){
            t1.setText("0");
        }
 
        numero = Double.parseDouble(t1.getText());
 
        if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("0");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("0");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            t1.setText("0");
        }
 
        comp = "+";
        numero = Double.parseDouble(t1.getText());
        resultado = (resultado + numero);
        t1.setText("");
    }
 
    public void funcResta(){

        numero = Double.parseDouble(t1.getText());
 
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            t1.setText("");
        }
 
        comp = "-";
        numero = Double.parseDouble(t1.getText());
        resultado = (numero - resultado);
        t1.setText("");
    }
 
    public void funcMult(){
    	
        if(t1.getText() == ""){
            t1.setText("1");
        }
 
        numero = Double.parseDouble(t1.getText());
 
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("1");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("1");
        } else if (comp == "/"){
            resultado = (resultado / numero);
            t1.setText("1");
        }
 
        if(resultado == 0.0){
            resultado = 1.0;
        }
 
        comp = "*";
        numero = Double.parseDouble(t1.getText());
        resultado = (resultado * numero);
        t1.setText("");
    }
 
    public void funcDiv(){

        numero = Double.parseDouble(t1.getText());
 
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("");
        }
 
        if(resultado == 0.0){
            resultado = 1.0;
        }
 
        comp = "/";
        numero = Double.parseDouble(t1.getText());
        resultado = (numero / resultado);
        t1.setText("");
    }
 
    public void funcIgualdad(){
    	
        numero = Double.parseDouble(t1.getText());
 
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("" + resultado);
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("" + resultado);
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("" + resultado);
        } else if (comp == "/"){
            resultado = (resultado / numero);
            t1.setText("" + resultado);
        }
    }
}
