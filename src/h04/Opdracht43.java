import com.sun.deploy.util.BlackList;

import java.awt.*;
import java.applet.*;
/////***OPDRACHT4.3/////
public class Opdracht43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
g.fillRect(20,20,10,150);
g.setColor(Color.black);
g.drawRect(20,20,10,150);
g.setColor(Color.red);

g.drawRect(20,20,100,40);
g.fillRect(20,20,100,40);
g.setColor(Color.WHITE);

g.drawRect(20,40,100,40);
g.fillRect(20,40,100,40);

g.setColor(Color.blue);
g.drawRect(20,60,100,20);
g.fillRect(20,60,100,20);



    }
}