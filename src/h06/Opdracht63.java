package h06;

import java.applet.*;
import java.awt.*;



public class Opdracht63 extends Applet {

    int a;

    int b;

    int c;

    int d;






    public void init() {

        a = 2147483647;

        b = 1;

        c = a + b;

        d = a - b;




    }


    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawString("negatief   " + c, 20,20);


        g.setColor(Color.blue);
        g.drawString("positief   " + d ,19,50);












    }


}