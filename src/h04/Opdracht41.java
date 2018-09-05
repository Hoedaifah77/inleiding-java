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
        g.drawLine(200, 10, 250, 200);
        g.drawLine(200, 10, 150, 200);
        g.drawLine(150, 200, 250, 200);
    }
}
