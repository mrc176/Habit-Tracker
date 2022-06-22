/*  Author: Martin Castaneda
// Currently: opens a New window when View Profile button is clicked on GUI Window.
// To Do: 
//      -Create and label Tables to input habit information
//      -Show information stored under user in database
//      -Format a Mobile-esque asthetic
//      
// Will use ActionEvent and Action Listener to send and recieve input information to SQL database
*/

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class UserProfile extends JFrame {
    JButton button;
 
    UserProfile(){

        // New window open
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);   
    }
    
   

}