//Program to draw Circle, Rectangle, Line

import java.awt.*;
import java.awt.event.*;

public class Shapes extends Frame {
public Shapes() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {

g.setColor(Color.black);

//Draw lines
g.drawLine(100, 100, 180, 100);


g.setColor(Color.pink);

//Draw rectangles
g.drawRect(80, 150, 60, 50);
g.fillRect(200,150, 60, 50);

g.setColor(Color.orange);

//Draw Circles
g.drawOval(80, 250, 50, 50);
g.fillOval(200, 250, 50, 50);
}

public static void main(String[] args) {
Shapes appwin = new Shapes();

appwin.setSize(new Dimension(400, 400));
appwin.setTitle("Shapes");
appwin.setVisible(true);
}
}


