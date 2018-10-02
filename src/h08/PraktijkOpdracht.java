package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdracht extends Applet {

    int input;
    int input2;

    TextField tekstvak;
    TextField tekstvak2;

    Button KnopPLUS;

    Button KnopMIN;

    Button KnopDEEL;

    Button KnopKEER;

    int uitkomst;


    public void paint(Graphics g) {
        g.drawString("" + uitkomst,40,40);


    }

    public void init() {

        ////tekstvak 2/////

        tekstvak2 = new TextField("" ,10);
        tekstvak2.addActionListener(new tekstvakListener());
        add(tekstvak2);


        ///tekstvak 1////

        tekstvak = new TextField("" ,10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        KnopPLUS = new Button("+");
        KnopPLUS.addActionListener(new PlusKNOPListener());
        add(KnopPLUS);

        KnopMIN = new Button("-");
        KnopMIN.addActionListener(new KnopMINListener());
        add(KnopMIN);

        KnopKEER = new Button("*");
        KnopKEER.addActionListener(new KnopKEERListener());
        add(KnopKEER);

        KnopDEEL = new Button("/");
        KnopDEEL.addActionListener(new KnopDEELListener());
        add(KnopDEEL);


        ///// wat het betekent /////


    }

    class tekstvak2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }
    }


    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


        }
    }


    class PlusKNOPListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //// wat de okknop moet doen////

            input = Integer.parseInt(tekstvak.getText());
            input2 = Integer.parseInt(tekstvak2.getText());

            uitkomst = input + input2;
            repaint();


        }
    }

    class KnopMINListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //// wat er in de tekstvak komt te staan///

            input = Integer.parseInt(tekstvak2.getText());
            input2 = Integer.parseInt(tekstvak.getText());

            uitkomst = input - input2;
            repaint();
        }
    }


    class KnopKEERListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tekstvak.getText());
            input2 = Integer.parseInt(tekstvak2.getText());

            uitkomst = input * input2;
            repaint();


        }
    }


    class KnopDEELListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            input = Integer.parseInt(tekstvak.getText());
            input2 = Integer.parseInt(tekstvak2.getText());

            uitkomst = input / input2;
            repaint();


        }
    }
}








