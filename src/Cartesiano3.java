package Ambiente1;

import java.awt.*;

public class Cartesiano3 extends Canvas {


    public void paint(Graphics g) {

        g.drawLine(40,10,40,230);
        g.drawLine(40,230,450,230);

        g.drawLine(40, 10, 45, 10);
        g.drawLine(40, 57, 45, 57);
        g.drawLine(40, 115, 45, 115);
        g.drawLine(40, 172, 45, 172);

        g.drawString("40°", 15, 15);
        g.drawString("30°", 15, 62);
        g.drawString("20°", 15, 120);
        g.drawString("10°", 15, 177);
        g.drawString("Inverno", 40, 245);
        g.drawString("Primavera", 120, 245);
        g.drawString("Estate", 250, 245);
        g.drawString("Autunno", 380, 245);

        g.setColor(Color.red);
        g.drawLine(70, 178, 140, 114);
        g.drawLine(140, 114, 260, 44);
        g.drawLine(260, 44, 380, 110);
    }
}
