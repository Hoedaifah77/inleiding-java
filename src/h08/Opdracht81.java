package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht81 extends Applet {

    Button okKnop;
    Button resetKnop;

    String input;

    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener ());
        add(okKnop);

        resetKnop = new Button("Reset");
        resetKnop.addActionListener(new resetKnopListener ());
        add(resetKnop);

        input = " ";


    }

    public void paint(Graphics g) {

        g.drawString("totaal " + input, 40,40);

    }

    class okKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input = tekstvak.getText();
            repaint();

        }

    }
    class resetKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();

        }

    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input = tekstvak.getText();
            repaint();

        }

    }
}