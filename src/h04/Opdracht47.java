import java.awt.*;
import java.applet.*;

public class Opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRoundRect(50, 50, 200, 200, 10, 10);

        g.fillOval(80,80,50,50);
        g.drawOval(80,80,50,50);

        g.setColor(Color.red);
        g.fillOval(170,80,50,50);
        g.drawOval(170,80,50,50);

        g.setColor(Color.red);
        g.fillOval(80,80+100,50,50);
        g.drawOval(80,80+100,50,50);

        g.setColor(Color.BLACK );
        g.fillOval(80+100,80+100,50,50);
        g.drawOval(80+100,80+100,50,50);





    }
}