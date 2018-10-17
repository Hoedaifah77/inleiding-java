package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht102 extends Applet {

    Button Knop;
    TextField tekstvak;

    int lgetal;
    int input;

    int hgetal;


    public void init() {

        //////knop/////
        Knop = new Button("klik");
        Knop.addActionListener(new Knoplistener());
        add(Knop);

        ////tekstvak///
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvaklistener());
        add(tekstvak);




    }


    public void paint(Graphics g) {


        g.drawString("laagste getal =" + lgetal, 20, 40);
        g.drawString("hoogste getal =" + hgetal,20,60);


    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            lgetal = 9999999;

            input = Integer.parseInt(tekstvak.getText());


            if (input < lgetal); {

                lgetal = input;
            }
            if (input > hgetal); {

                hgetal = input;
            }

            tekstvak.setText("");
            repaint();

        }
    }


    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


           input = Integer.parseInt(tekstvak.getText());


           if (input < lgetal); {

                lgetal = input;
            }
            if (input > hgetal); {

                hgetal = input;
            }



            tekstvak.setText("");
            repaint();

        }
    }
}