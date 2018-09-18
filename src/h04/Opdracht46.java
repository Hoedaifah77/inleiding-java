import java.awt.*;
import java.applet.*;
public class Opdracht46 extends Applet {

    public void init() {
    }

    public Opdracht46() throws HeadlessException {
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.drawOval(100, 100, 50, 50);
        g.fillOval(100,100,50,50);

        g.setColor(Color.green);
        g.drawOval(100, 40, 50, 50);
        g.fillOval(100,40,50,50);

        g.setColor(Color.red);
        g.drawOval(100,160,50,50);
        g.fillOval(100,160,50,50);



        g.setColor(Color.black);
        g.drawRoundRect(70, 30, 100, 200, 10, 10);








    }

}