
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class testUserUI {
    int habitNum;
    public testUserUI(String userName)
    {
        habitNum = 1;
        Habit [] habitArray = new Habit[20];
        
        habitArray[0] = new positiveHabit("Brush teeth", 3, 3);
        
        String name = userName;
        JFrame frame = new JFrame(name);
        JPanel panel = new JPanel();
        JTextArea habitList = new JTextArea();
        JButton createHabit = new JButton("Create Habit");
        JButton quit = new JButton("Quit");
        panel.setLayout(null);
        JButton seeHabitOne = new JButton("See Habit");
        
        frame.setSize(600,400);
        habitList.setBounds(60, 130, 200, 200);
        createHabit.setBounds(60, 0, 150, 50);
        quit.setBounds(60, 60, 150, 50);
        seeHabitOne.setBounds(280, 130, 100, 20);
        
        createHabit.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               
               createHabitGUI newHabit = new createHabitGUI();
               ++habitNum;
               
           }
       });
        
        seeHabitOne.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               
               try {
                   HabitUI newHabit = new HabitUI(habitArray[0]);
               } catch (MalformedURLException ex) {
                   Logger.getLogger(testUserUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               ++habitNum;
               
           }
       });
        
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(habitList);
        panel.add(createHabit);
        panel.add(quit);
        panel.add(seeHabitOne);
        frame.add(panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        for(int i = 0; i < 20; ++i)
        {
            habitList.append(habitArray[i].getName());
        }
        
        
        
    }
    
}
