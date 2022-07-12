//Implement a simple calculator using AWT components.

import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener {
	Button sum,diff,pro,div;
	String str="";
	int res;
	TextField n1,n2,n3;

	public calculator() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		//create button
		sum = new Button("SUM");
		diff = new Button("DIFFERENCE");
		pro = new Button("PRODUCT");
		div = new Button("QUOTIENT");

		// Create controls.
		Label no1 = new Label("Enter the First Number  : ");
		Label no2 = new Label("Enter the Second Number : ");
		Label no3 = new Label(" Result ");


		n1 = new TextField(10);
		n2 = new TextField(10);
		n3 = new TextField(10);



		// Add the controls to the frame.
		add(no1);
		add(n1);
		add(no2);
		add(n2);

		add(sum);
		add(diff);
		add(pro);
		add(div);

		add(no3);
		add(n3);


		//add action listeners for buttons
		sum.addActionListener(this);
		diff.addActionListener(this);
		pro.addActionListener(this);
		div.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	// User pressed Enter.
	public void actionPerformed(ActionEvent ae) {

		int a=Integer.parseInt(n1.getText());
		int b=Integer.parseInt(n2.getText());

		String str=ae.getActionCommand();
		if(str.equals("SUM")){
			res=a+b;
		}
		else if(str.equals("DIFFERENCE")){
			res=a-b;
		}
		else if(str.equals("PRODUCT")){
			res=a*b;
		}
		else if(str.equals("QUOTIENT")){
			res=a/b;
		}
		n3.setText(Integer.toString(res));
		repaint();
	}


	public void paint(Graphics g) { }


	public static void main(String[] args) {
		calculator appwin = new calculator();

		appwin.setSize(new Dimension(320, 250));
		appwin.setTitle("TextFieldDemo");
		appwin.setVisible(true);
	}
}