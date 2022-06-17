package systemLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import guiBasicTest.GUI;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;

public class SystemLog {

	private JFrame frmLoginPanel;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemLog window = new SystemLog();
					window.frmLoginPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SystemLog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPanel = new JFrame();
		frmLoginPanel.getContentPane().setBackground(SystemColor.activeCaption);
		frmLoginPanel.setBackground(Color.DARK_GRAY);
		frmLoginPanel.setTitle("Login Panel");
		frmLoginPanel.setBounds(200, 200, 375, 200);
		frmLoginPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPanel.getContentPane().setLayout(null);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserLogin.setBounds(135, 0, 96, 34);
		frmLoginPanel.getContentPane().add(lblUserLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(50, 56, 110, 20);
		frmLoginPanel.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(50, 80, 96, 14);
		frmLoginPanel.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(135, 56, 156, 20);
		frmLoginPanel.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(135, 80, 156, 20);
		frmLoginPanel.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// The code below has been deprecated.
				//String password = txtPassword.getText();
				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());

				//On successful log-in.
				if(username.contains("user") && password.contains("pass")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					//Uncomment the line below if unable to open GUI.java
					//GUI guiTest = new GUI();
					GUI.main(null);
				}
				//On failed log-in.
				else {
					JOptionPane.showMessageDialog(null, "Invalid username or password.","User Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(82, 129, 89, 23);
		frmLoginPanel.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem, "Are you sure you would like to exit the program?", "User Login", 
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(181, 129, 89, 23);
		frmLoginPanel.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 113, 341, 2);
		frmLoginPanel.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 45, 341, 2);
		frmLoginPanel.getContentPane().add(separator_1);
		
		JLabel lblWelcome = new JLabel("Welcome to Habit Tracker: Fieri Edition!");
		lblWelcome.setBounds(70, 28, 268, 14);
		frmLoginPanel.getContentPane().add(lblWelcome);
		
		JLabel lblNewLabel = new JLabel("v0.1");
		lblNewLabel.setBounds(304, 138, 47, 14);
		frmLoginPanel.getContentPane().add(lblNewLabel);
	}
}
