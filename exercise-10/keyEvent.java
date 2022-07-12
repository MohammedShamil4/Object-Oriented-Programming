//Develop a program to handle Key events.


import java.awt.*;
import java.awt.event.*;

public class keyEvent extends Frame implements KeyListener {

	String msg = "";
	String keyState = "";
	public keyEvent() {
		addKeyListener(this);
		addWindowListener(new
		MyWindowAdapter());
	}

	// Handle a key press.
	public void keyPressed(KeyEvent ke) {
		keyState = "Key pressed";
		repaint();
	}

	// Handle a key release.
	public void keyReleased(KeyEvent ke) {
		keyState = "Key released";
		repaint();
	}

	// Handle key typed.
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}

	// Display keystrokes.
	public void paint(Graphics g) {
		g.drawString(msg, 20, 100);
		g.drawString(keyState, 20, 50);
	}

	public static void main(String[] args) {
		keyEvent appwin = new keyEvent();

		appwin.setSize(new Dimension(400, 400));
		appwin.setTitle("SimpleKey");
		appwin.setVisible(true);
	}
}

// When the close box in the frame is clicked,
// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}