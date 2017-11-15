package chapter1.examples;

import java.applet.Applet;
import java.awt.*;

public class Greeting extends Applet {

    public void paint(Graphics g){
        g.drawString("Hello", 50, 50);
    }
}
