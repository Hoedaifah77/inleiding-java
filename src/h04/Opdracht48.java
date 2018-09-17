package h04;

import java.applet.*;
import java.awt.*;

public class Opdracht48 extends Applet {



    public void init() {
    }



    public void paint (Graphics g) {

            g.drawLine(10,20,120,20);

            g.drawRect(10,40,110,70);

            g.fillRect(140,40,110,70);
            g.setColor(Color.black);
            g.drawArc(140,40,110,70,0,360);
            g.drawArc(270,40,110,70,0,360);
            g.setColor(Color.magenta);
            g.fillArc(270,40,110,70,0,45);

            g.setColor(Color.black);
            g.drawRoundRect(10,120,110,70,30,30);
            g.setColor(Color.magenta);
            g.fillRoundRect(140,120,110,70,110,70);
            g.setColor(Color.black);
            g.drawArc(290,120,70,70,0,360);


        }





    }

