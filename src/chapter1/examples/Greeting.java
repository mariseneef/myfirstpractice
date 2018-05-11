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
       g.setColor(Color.BLACK);
        g.drawString("10", 163,134);
        Graphics evert = g;
        evert.setColor(Color.red);
        evert.draw3DRect(12, 12, 100, 10, true);
        System.out.println("color of g="+g.getColor());
//        for(int x=0;x<400; x=x+40){
//            for(int y=0;y<400;y=y+40){
//                g.drawString(""+x+"."+y, x, y);
//            }
//        }
    }
}