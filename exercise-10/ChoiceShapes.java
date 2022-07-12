/*
Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s choice.
*/



import java.awt.*;
import java.awt.event.*;

public class ChoiceShapes extends Frame implements ItemListener {
	Choice shapes;
	String msg = "";

	public ChoiceShapes() {

		// Use a flow layout.
		setLayout(new FlowLayout());
		// Create choice lists.
		shapes = new Choice();

		// Add items to shapes list.
		shapes.add("Rectangle");
		shapes.add("Triangle");
		shapes.add("Square");
		shapes.add("Circle");

		// Add choice lists to window.
		add(shapes);

		// Add item listeners.
		shapes.addItemListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	// Display current selections.
	public void paint(Graphics g) {
		msg = "Current Shape: ";
		msg = shapes.getSelectedItem();
		g.drawString(msg, 20, 120);
		if(msg.equals("Rectangle")) 
		g.drawRect(80, 150, 60, 50);
		
		msg = shapes.getSelectedItem();
		if(msg.equals("Circle"))
		g.drawOval(80, 180, 50, 50);
		
		msg = shapes.getSelectedItem();
		int x[] = {50,160,270};
		int y[] = {140,110,140};
		Polygon poly=new Polygon(x,y,3);
		if(msg.equals("Triangle"))
		g.drawPolygon(poly);
		
		msg = shapes.getSelectedItem();
		g.drawString(msg, 20, 120);
		if(msg.equals("Square")) 
		g.drawRect(80, 150, 50, 50);
	}

	public static void main(String[] args) {
		ChoiceShapes appwin = new ChoiceShapes();

		appwin.setSize(new Dimension(300, 300));
		appwin.setTitle("ChoiceShapes");
		appwin.setVisible(true);
	}
}