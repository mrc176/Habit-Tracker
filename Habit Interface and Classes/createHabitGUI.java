
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class createHabitGUI {
    
    String name;
    int numberReminders = 0;
    
    
    createHabitGUI()
    {
        // initializing GUI elements
        JFrame frame = new JFrame("Create New Habit");
        JPanel panel = new JPanel();
        JButton create = new JButton("Create");
        JButton nameHabit = new JButton("Name Habit");
        JButton remindersPerDay = new JButton ("Reminders Per Day");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        //JButton setGoal = new JButton("Set Goal"); //possible feature.
        JTextField nameField = new JTextField("Write Name Here"); 
        JTextField numberOfRemindersField = new JTextField();
        JLabel numReminders = new JLabel("Number of Failures Allowed");
        
        //setting dimensions
        frame.setSize(600,300);
        create.setBounds(480, 150, 75, 50);
        
        //plus and minus section
        plus.setBounds(60, 50, 75, 50);
        minus.setBounds(60, 105, 75, 50);
        numReminders.setBounds(60, 10, 250, 50);
        numberOfRemindersField.setBounds(150, 50, 75, 100);
        
        //name habit section
        nameHabit.setBounds(300, 50, 100, 50);
        nameField.setBounds(405, 50, 150, 50);
        
        //adding functionality to buttons
        plus.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               ++numberReminders;
               numberOfRemindersField.setText("" + numberReminders);
           }
       });
        
        minus.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               --numberReminders;
               numberOfRemindersField.setText("" + numberReminders);
           }
       });
        
        nameHabit.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               name = nameField.getText();
           }
       });
        
        create.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               Habit newHabit = new positiveHabit(name, numberReminders, 3);
               HabitUI newHabitUI = new HabitUI(newHabit);
               frame.dispose();
           }
       });
        
        
        //creating layout and adding stuff to panel and frame
        panel.setLayout(null);
        panel.add(create);
        panel.add(plus);
        panel.add(minus);
        panel.add(numReminders);
        panel.add(numberOfRemindersField);
        panel.add(nameHabit);
        panel.add(nameField);
        
        //housekeeping and design
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
        
        
        
        
        
    }
    
}
