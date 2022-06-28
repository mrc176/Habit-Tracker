/* This has been developed with Java in Eclipse with the use of Window Builder */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JList;

public class ProfileTest2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileTest2 window = new ProfileTest2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfileTest2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(215, 10, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username: " + "UserName");	//replace variable
		lblNewLabel_1.setBounds(61, 79, 221, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Profile: " + "Profile Name");
		lblNewLabel_1_1.setBounds(61, 102, 221, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Change UserName");
		btnNewButton.setBounds(310, 75, 140, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnChangeProfileName = new JButton("Change Profile Name");
		btnChangeProfileName.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnChangeProfileName.setBounds(310, 98, 140, 21);
		frame.getContentPane().add(btnChangeProfileName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password: ");
		lblNewLabel_1_1_1.setBounds(61, 125, 63, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangePassword.setBounds(310, 121, 140, 21);
		frame.getContentPane().add(btnChangePassword);
		
		JLabel lblNewLabel_2 = new JLabel("**************");	/*Figure how to show password*/
		lblNewLabel_2.setBounds(125, 125, 157, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(61, 211, 175, 42);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_3 = new JLabel("Your Habits");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(109, 173, 85, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Add Habit");
		btnNewButton_1.setBounds(310, 169, 140, 21);
                btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            createHabitGUI newHabit = new createHabitGUI();
			}
		});
		frame.getContentPane().add(btnNewButton_1);
                
                frame.setVisible(true);
	}
}