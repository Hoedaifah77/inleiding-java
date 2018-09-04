package h01;

import java.awt.*;
import java.applet.*;

public class HalloRocDev extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Hoedaifah!!", 50, 60 );
        g.setColor(Color.yellow);
        g.drawString("elfathi!!", 50, 80 );
    }
}


