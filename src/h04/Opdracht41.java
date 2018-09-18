import java.awt.*;
import java.applet.*;
public class Opdracht41 extends Applet {

    public void init() {
    }

    public Opdracht41() throws HeadlessException {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(180, 90, 90, 0);
        g.drawLine(90, 0, 0, 90);
        g.drawLine(0, 90, 180, 90);
    }
}
