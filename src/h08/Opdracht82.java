package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht82 extends Applet {


    Button manKnop;
    Button Resetknop;

    Button vrouwknop;
    Button meisjesknop;
    Button jongensknop;

    int jongens;
    int meisjes;

    int man;
    int vrouw;

    int totaal;


    public void init() {
////////manknop
        manKnop = new Button("Man");
        manKnop.addActionListener(new manKnopListener());
        add(manKnop);

///////vrouwknop
        vrouwknop = new Button("Vrouw");
        vrouwknop.addActionListener(new vrouwKnopListener());
        add(vrouwknop);

///////jongensknop
        jongensknop = new Button("jongens");
        jongensknop.addActionListener(new jongensKnopListener());
        add(jongensknop);

//////meisjesknop
        meisjesknop = new Button("meisjes");
        meisjesknop.addActionListener(new meisjesKnopListener());
        add(meisjesknop);



    }

    public void paint(Graphics g) {
        g.drawString("Mannen " + man, 20, 20);

        g.drawString("Totaal " + totaal, 20, 130);

        g.drawString("vrouwen" + vrouw, 20, 40);

        g.drawString("Jongens " + jongens,20,80);
        g.drawString("meisjes" + meisjes,20,60);


    }

    class manKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man = man + 1;

            totaal = totaal + 1;
            repaint();

        }
    }

    class vrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }


    class jongensKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongens = totaal + 1;
            totaal = totaal + 1;
            repaint();
        }
    }




    class meisjesKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisjes = totaal + 1;
            totaal = totaal + 1;
            repaint();


        }


    }
}





