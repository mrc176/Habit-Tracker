// This is a base template for testing with SystemLog.java
// To showcase UI initialization off of a successful login
// and with added log out/reset account password functionality
package guiBasicTest;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("unused")
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} 	catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		
	public GUI() {
		//The message below will print if there is no username initialization
		//i.e. If this program is ran by itself, rather than through the
		//SystemLog.java -> SQL database connection from which it accesses data
		System.out.println("No initialization value.");
	}
	
	public GUI(String username) {
		//Frame: The window.
		//Panel: The layout inside the window.
		//Bound: X, Y, Width, Height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 600, 600, 600);
		setResizable(false);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int prompt = JOptionPane.showConfirmDialog(btnLogOut, "Are you sure you want to logout?");
				if (prompt == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnLogOut.setBounds(466, 528, 110, 23);
		panel.add(btnLogOut);
		
		JButton btnResetPass = new JButton("Reset Password");
		btnResetPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PasswordReset passReset = new PasswordReset(username);
				passReset.setTitle("Changing Password");
				passReset.setVisible(true);
			}
		});
		btnResetPass.setBounds(321, 528, 135, 23);
		panel.add(btnResetPass);
		
		JLabel lblNewLabel = new JLabel("Welcome, " + username + "!");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 166, 23);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 517, 566, 2);
		panel.add(separator);
		
		JButton btnhabitAdd = new JButton("Add Habit");
		btnhabitAdd.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnhabitAdd.setBounds(30, 130, 172, 59);
		panel.add(btnhabitAdd);
		
		JButton btnhabitEdit = new JButton("Edit Habit");
		btnhabitEdit.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnhabitEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnhabitEdit.setBounds(205, 130, 172, 59);
		panel.add(btnhabitEdit);
		
		JButton btnhabitCancel = new JButton("Cancel Habit");
		btnhabitCancel.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnhabitCancel.setBounds(380, 130, 172, 59);
		panel.add(btnhabitCancel);
		
		JButton btnCompleteHabit = new JButton("Complete Active Habit");
		btnCompleteHabit.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCompleteHabit.setBounds(136, 325, 300, 59);
		panel.add(btnCompleteHabit);
		
		JButton btnViewHabits = new JButton("View Active Habits");
		btnViewHabits.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnViewHabits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewHabits.setBounds(136, 225, 300, 59);
		panel.add(btnViewHabits);
	}
}
