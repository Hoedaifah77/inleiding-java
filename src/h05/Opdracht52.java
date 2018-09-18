package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht52 extends Applet {

    int gewicht;
    int y;

    int gewicht2;
    int y2;

    int gewicht3;
    int y3;

    public void init() {

        gewicht = 52;
        y = 123;

        gewicht2 = 83;
        y2 = 92;

        gewicht3 = 145;
        y3 = 30;
    }


    public void paint(Graphics g) {
        g.drawLine(50,20,50,175);
        g.drawLine(50,175,195,175);
        g.drawString("Valerie", 55,195);
        g.drawString("Hans", 110,195);
        g.drawString("Jeroen", 155,195);
        g.drawString("100", 27, 30);
        g.drawString("80", 34, 61);
        g.drawString("60", 34, 92);
        g.drawString("40", 34, 123);
        g.drawString("20", 34, 154);
        g.drawString("0", 40, 185);
        g.setColor(Color.red);//kleur rood
        g.fillRect(55,y,40,gewicht);
        g.drawRect(55,y,40,gewicht);//Valerie

        g.setColor(Color.blue);//kleur
        g.fillRect(105,y2,40,gewicht2);
        g.drawRect(105,y2, 40,gewicht2);

        g.setColor(Color.magenta);
        g.fillRect(155,30,40,145);
        g.drawRect(155,y3, 40,gewicht3  );


    }

}