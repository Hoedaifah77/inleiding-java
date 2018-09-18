package h06;

import java.applet.*;
import java.awt.*;

public class Opdracht61 extends Applet {
    int bedrag, personen;
    double uitkomst;



    public void init() {

        bedrag = 113;
        personen = 4;
        uitkomst = bedrag / personen;




    }


    public void paint(Graphics g) {

        g.drawString("Jan", 20,20);
        g.drawString("Hoedie", 80,20);
        g.drawString("ali", 140,20);
        g.drawString("jeanette" , 180,20);
        g.drawString("" + uitkomst, 20, 35);
        g.drawString("" + uitkomst, 80, 35);
        g.drawString("" + uitkomst, 140, 35);
        g.drawString("" + uitkomst, 180, 35);










    }


}