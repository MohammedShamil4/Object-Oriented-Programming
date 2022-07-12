/*
Find the percentage of marks obtained by a student in 5 subjects.
Display a happy face if he secures above 50% or a sad face if otherwise.
*/

import java.awt.*;
import java.awt.event.*;

public class Smily extends Frame implements ActionListener {

TextField t1, t2,t3,t4,t5,t6;
Button b;
Label l1,l2,l3,l4,l5,l6;
public Smily() {
// Use a flow layout.
setLayout(new FlowLayout());


t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);
t4 = new TextField(10);
t5 = new TextField(10);
t6 = new TextField(10);
l1=new Label("AI:");
l2=new Label("AOS:");
l3=new Label("ADBMS:");
l4=new Label("ACN:");
l5=new Label("Java:");
l6=new Label("Result:");

b=new Button("Get result");
b.setBounds(230,150,60,50);



// Add the controls to the frame.
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(l6);
add(t6);


add(b);




t5.addActionListener(this);

b.addActionListener(this);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}


public void actionPerformed(ActionEvent ae) {
repaint();
}


	public void paint(Graphics g){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int total=0;
        double per=0;
        g.drawString(" Scores out of 100",10,50);


        a= Integer.parseInt(t1.getText());
        b= Integer.parseInt(t2.getText());
        c= Integer.parseInt(t3.getText());
        d= Integer.parseInt(t4.getText());
        e= Integer.parseInt(t5.getText());
        total=a+b+c+d+e;

       t6.setText(String.valueOf(total));
        per=(a+b+c+d+e)/5;
        
        if(per > 50){
            g.setColor(Color.YELLOW);
            g.fillOval(200,100, 150, 150);

            g.setColor(Color.BLACK);
            g.fillOval(240,150,15,15);
            g.fillOval(290,150,15,15);

            g.drawArc(250,180,50,20,180,180);
        }
        else
        {
	    g.setColor(Color.YELLOW);
            g.fillOval(200,100, 150, 150);

            g.setColor(Color.BLACK);
            g.fillOval(240,150,15,15);
            g.fillOval(290,150,15,15);

            g.drawArc(250,180,50,20,180,-180);
           
        }
    }




public static void main(String[] args) {
Smily appwin = new Smily();

appwin.setSize(new Dimension(1400, 400));
appwin.setTitle("Smily");
appwin.setVisible(true);
}
}