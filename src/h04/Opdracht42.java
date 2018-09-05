import java.awt.*;
import java.applet.*;
/////***OPDRACHT4.2/////
public class Opdracht42 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(180, 90, 90, 0);
        g.drawLine(90, 0, 0, 90);
        g.drawLine(0, 90, 180, 90);
        g.drawRect(0,90,180,180);
        g.drawRect(0,200,40,70);
        g.drawRect(80,217,75,45);
    }
}
