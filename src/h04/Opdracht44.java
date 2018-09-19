import java.awt.*;
import java.applet.*;
public class Opdracht44 extends Applet {

    public void init() {
    }

    public Opdracht44() throws HeadlessException {
        // HALLO
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
        g.fillRect(55,123,40,52);
        g.drawRect(55,123,40,52);//Valerie

        g.setColor(Color.blue);//kleur
        g.fillRect(105,92,40,83);
        g.drawRect(105,92, 40,83);

        g.setColor(Color.magenta);
        g.fillRect(155,30,40,145);
        g.drawRect(155,30, 40,145  );


    }

    }