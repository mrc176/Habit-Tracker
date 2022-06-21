// This is a base template for testing with SystemLog.java
// To showcase UI initialization off of a successful login
// This should eventually be replaced by the actual UserUI
package guiBasicTest;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		JLabel label = new JLabel("HABIT TRACKER USER UI");
		label.setBounds(200, 50, 200, 50);
		panel.add(label);
		
		frame.setVisible(true);
	}
}
