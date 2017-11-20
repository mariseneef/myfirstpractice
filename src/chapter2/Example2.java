package chapter2;

import com.sun.prism.Graphics;

import java.applet.Applet;

public class Example2 extends Applet {

    public void paint(Graphics g) {
        int length;
        int breadth;
        int area;

        length = 20;
        breadth = 10;
        area = length * breadth;
        g.drawString("Area is" + area, 100, 100);
    }
}