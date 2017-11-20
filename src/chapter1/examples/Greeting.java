package chapter1.examples;

import java.applet.Applet;
import java.awt.*;

public class Greeting extends Applet {
    public void paint (Graphics g) {
        g.drawOval(120,120,100,100);
        g.drawOval(135,135,70,70);
        g.drawOval(150,150,40,40);
        g.setColor(Color.blue);
       g.fillOval(120,120,100,100);
       g.setColor(Color.yellow);
       g.fillOval(135,135,70,70);
       g.setColor(Color.red);
       g.fillOval(150,150,40,40);
       g.drawString("10", 150,150);

    }
}