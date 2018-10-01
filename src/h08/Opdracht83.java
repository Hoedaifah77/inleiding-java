package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht83 extends Applet {


    ///// de ok knop///
    Button okKnop;

    ///tekstvak ///
    TextField tekstvak;

    ///wat je in typt///

    double btw;
    int input;

    public void paint(Graphics g) {

        g.drawString(""+ btw, 40,40);

    }

    public void init() {


        ///// wat het betekent /////

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);



    }

    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //// wat de okknop moet doen////

            input = Integer.parseInt(tekstvak.getText());

            btw = input * 1.21;
            tekstvak.setText("");
            repaint();






        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //// wat er in de tekstvak komt te staan///

            input = Integer.parseInt(tekstvak.getText());
            btw = input * 1.21;
            tekstvak.setText("");
            repaint();


        }
    }
}







