package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht104 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int jaartal;

    public void init() {

        setSize(600, 400);
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();

            jaartal = Integer.parseInt( s);

            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = "Het jaar " + jaartal + " is een schrikkeljaar, dus februari heeft 29 dagen.";
            }
            else {
                tekst = "Het jaar "+ jaartal + " is geen schrikkeljaar, dus februari heeft 28 dagen.";
            }
            repaint();
        }
    }
}