
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class endOfLifeUI {
    
    Habit deadHabit;
    int successPercentage;
    int successes;
    int fails;
    
    
    public endOfLifeUI(Habit habit) throws MalformedURLException
    {   
        successes = habit.getNumSuccesses();
        fails = habit.getNumFailures();
        //successPercentage = endOfLifeSummary.getAverage();
        successPercentage = 50;
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton closeButton = new JButton("Close");
        JLabel successLabel = new JLabel("Number of Successes: " + successes);
        JLabel failureLabel = new JLabel("Number of Failures: " + fails);
        JLabel averageLabel = new JLabel("Success Average: " + successPercentage + "%"); 
        URL imageURL = new URL("https://i.imgur.com/Sxy2STc.png");
        ImageIcon appLogo = new ImageIcon(imageURL);
        ImageIcon otherAppLogo = new ImageIcon("Sxy2STc.png");
        JLabel logoLabel = new JLabel(appLogo);
        
        
        
        //setting dimensions
        panel.setLayout(null);
        frame.setSize(400,180);
        panel.setBackground(Color.lightGray);
        closeButton.setBounds(290, 90, 80, 30);
        successLabel.setBounds(60, 20, 180, 30);
        failureLabel.setBounds(60, 40, 180, 30);
        averageLabel.setBounds(60, 60, 180, 30);
        logoLabel.setBounds(60, 100, 199, 200);
        //guyLabel.setBounds(50, 50, 199, 200);
        
        //making buttons work
        closeButton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
            }
        });
        
        //adding stuff to window
        panel.add(closeButton);
        panel.add(successLabel);
        panel.add(failureLabel);
        panel.add(averageLabel);
        panel.add(logoLabel);
        
        //panel.add(guyLabel);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }    
}
