package chapter2;

import java.applet.Applet;
import java.awt.*;

public class Example2 extends Applet {

    public void paint(Graphics g) {
        int hight;
        int width;
        int area;

        hight = 20;
        width = 10;
        area = hight * width;
        g.drawString("Area is" + area, 100, 100);
    }
}