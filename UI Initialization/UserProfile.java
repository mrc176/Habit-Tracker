// Author Martin Castaneda

import E:\BitBucket\habit-tracker-repository\UI Initialization\GUI.java


public class UserProfile extends GUI{
 
    public UserProfile(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBoarder(BoarderFactory.creatEmptyBoarder(30, 30, 10, 30));
        panel.setLayout(new Gridlayout(0,1));

        frame.add(panel, BoarderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("User Profile")
        frame.pack();
        frame.setVisible(true);
    }

}