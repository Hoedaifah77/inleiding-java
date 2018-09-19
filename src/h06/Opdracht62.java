package h06;

import java.applet.*;
import java.awt.*;

public class Opdracht62 extends Applet {

    int secondesperuur;
    int secondesperdag;
    int secondesperjaar;




    public void init() {

        secondesperuur = 60*60;
        secondesperdag = secondesperuur*24;
        secondesperjaar = secondesperdag*365;

    }


    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawString(" " + secondesperuur, 20, 30);
        g.drawString("secondesperuur",20,20);

        g.setColor(Color.blue);
        g.drawString(" " + secondesperdag, 20, 70);
        g.drawString("secondesperdag",20,60);

        g.setColor(Color.red);
        g.drawString(" " + secondesperjaar, 20, 130);
        g.drawString("secondesperjaar",20,120);












    }


}