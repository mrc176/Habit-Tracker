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
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;

import javax.swing.JTextField;

public class PasswordReset extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textField;
	private JLabel lblnewPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordReset window = new PasswordReset();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public PasswordReset() {
		//The message below will print if there is no username initialization
		//i.e. If this program is ran by itself, rather than through the
		//SystemLog.java -> SQL database connection from which it accesses data
		System.out.println("No initialization value.");
	}

	public PasswordReset(String username) {
		setBounds(450, 300, 600, 125);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setBounds(250, 18, 300, 30);
		panel.add(textField);
		textField.setColumns(5);
		
		JButton btnSearch = new JButton("Enter");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newpw = textField.getText();
				try {
					Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "cs3398");
					PreparedStatement st = (PreparedStatement) connection.prepareStatement("Update user_list set password=? where name=?");
					
					st.setString(1,  newpw);
					st.setString(2,  username);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnSearch, "Password successfully changed.");
					setVisible(false);
					dispose();
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnSearch.setBackground(new Color(240, 240, 240));
		btnSearch.setBounds(245, 55, 80, 25);
		panel.add(btnSearch);
		
		lblnewPassword = new JLabel("Please enter your new password:");
		lblnewPassword.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblnewPassword.setBounds(35, 1, 300, 60);
		panel.add(lblnewPassword);
		
	}

}
