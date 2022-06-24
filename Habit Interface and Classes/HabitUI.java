package HabitUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class HabitUI{
    
    JFrame frame;
    JButton addFail;
    JButton addSuccess;
    JButton saveChanges;
    JPanel panel;
    Habit habit;
    JTextField successField;
    JTextField failureField;
    JTextArea list;
    JLabel successNumber;
    JLabel failureNumber;
    JLabel history;
    ImageIcon guyFieri;
    JLabel guyLabel;
    
    public HabitUI(Habit passedHabit)
    {
       //initializing variables.
       this.habit = passedHabit;
       String frameName = habit.getName();
       frame = new JFrame(frameName);
       frame.setSize(600,600);
       panel = new JPanel();
       panel.setLayout(null);
       panel.setBackground(Color.lightGray);
       addFail = new JButton("Add a Failure");
       addSuccess = new JButton("Add a Success");
       saveChanges = new JButton("Save Changes");
       list = new JTextArea();
       successField = new JTextField();
       failureField = new JTextField();
       successNumber = new JLabel("Number of Successes: ");
       failureNumber = new JLabel("Number of Failures: ");
       guyFieri = new ImageIcon("myGuy.jpg");
       guyLabel = new JLabel(guyFieri);
       history = new JLabel("History: ");
       
       //setting bounds on things.
       successField.setColumns(10);
       failureField.setColumns(10);
       successField.setBounds(360, 200, 200, 50);
       failureField.setBounds(360, 50, 200, 50);
       addFail.setBounds(60, 50, 200, 50);
       addSuccess.setBounds(60,200,200,50);
       saveChanges.setBounds(380, 290, 150, 50);
       list.setBounds(60, 350, 500, 200);
       successNumber.setBounds(380, 155, 150, 50);
       failureNumber.setBounds(380, 0, 150, 50);
       history.setBounds(75, 300, 150, 50);
       guyLabel.setBounds(-200, 0, 900, 1200);
       
       //setting up working buttons
       addFail.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               passedHabit.incrementFailures();
               list.append("You failed! \n");
               String numFailures = "";
               failureField.setText(numFailures + passedHabit.getNumFailures()); 
           }
       });
       addSuccess.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               passedHabit.incrementSuccesses();
               list.append("You succeeded! \n");
               String numFailures = "";
               successField.setText(numFailures + passedHabit.getNumSuccesses()); 
           }
       });
       saveChanges.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               list.append("Changes Saved \n");
           }
       });
       
       //adding everything to the panel.
       panel.add(addFail);
       panel.add(failureField);
       panel.add(addSuccess);
       panel.add(successField);
       panel.add(list);
       panel.add(successNumber);
       panel.add(failureNumber);
       panel.add(history);
       panel.add(saveChanges);
       panel.add(guyLabel);
       
       frame.add(panel);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }

    
}
