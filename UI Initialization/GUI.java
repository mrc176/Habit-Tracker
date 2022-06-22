// This is a base template for testing with SystemLog.java
// To showcase UI initialization off of a successful login
// This should eventually be replaced by the actual UserUI
// package guiBasicTest;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GUI {
	
	public static void main(String[] args) {
		//Frame: The window.
		//Panel: The layout inside the window.
		//Bound: X, Y, Width, Height
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		JLabel label = new JLabel("HABIT TRACKER");
		label.setBounds(255, 50, 200, 50); //changed x,y to be visually more centered -MRC
		panel.add(label);

		/* added button under label to open user profile window -MRC */
		JButton button = new JButton();
		button.setBounds(200,100,200,25);
		button.addActionListener(e -> new UserProfile());
		button.setText("View Profile");
		button.setFocusable(false);
		
		frame.setVisible(true);
		panel.add(button);	
		// If button is added to frame, the entire window is the button, Put in panel to set bounds. -MRC
	}
}
