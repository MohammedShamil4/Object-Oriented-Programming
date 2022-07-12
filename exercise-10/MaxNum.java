//Program to find maximum of three numbers using AWT.

import java.awt.*;
import java.awt.event.*;

public class MaxNum extends Frame
implements ActionListener {

TextField num1, num2,num3,msg1,msg2,msg3;

public MaxNum() {
// Use a flow layout.
setLayout(new FlowLayout());

// Create controls.
Label namep = new Label("Enter Three Numbers: ",Label.RIGHT);

num1 = new TextField(12);
num2 = new TextField(12);
num3 = new TextField(12);

// Add the controls to the frame.
add(namep);
add(num1);
add(num2);
add(num3);

// Add action event handlers.
num1.addActionListener(this);
num2.addActionListener(this);
num3.addActionListener(this);

addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

// User pressed Enter.
public void actionPerformed(ActionEvent ae) {
repaint();
}

public void paint(Graphics g) {
g.drawString("Number1: " + num1.getText(),20, 100);
g.drawString("Number2: " + num2.getText(),140, 100);
g.drawString("Number3: " + num3.getText(),260, 100);
int x=Integer.parseInt(num1.getText());
int y=Integer.parseInt(num2.getText());
int z=Integer.parseInt(num3.getText());
if( x > y && x > z) {
g.drawString("Maximum of three numbers: " + num1.getText(),20, 160);
}
if( y > x && y > z) {
g.drawString("Maximum of three numbers: " + num2.getText(),20, 160);
}
if( z > y && z > x) {
g.drawString("Maximum of three numbers: " + num3.getText(),20, 160);
}

}

public static void main(String[] args) {
MaxNum appwin = new MaxNum();

appwin.setSize(new Dimension(600, 600));
appwin.setTitle("MaxNum");
appwin.setVisible(true);
}
}