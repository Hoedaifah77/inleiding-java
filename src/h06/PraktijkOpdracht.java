package h06;

import java.applet.*;
import java.awt.*;



public class PraktijkOpdracht extends Applet {


    double a;

    double b;

    double c;

    double uitkomst;





    public void init() {

        a = 5.9;

        b = 6.9;

        c = 6.3;

        uitkomst = (a + b + c) / 3;
        uitkomst = (int) uitkomst * 10;
        uitkomst = uitkomst / 10;




    }


    public void paint(Graphics g) {
        /////// het gemiddelde
        g.setColor(Color.red);
        g.drawString(" gemiddelde:  " + uitkomst,20,20);












    }


}