
public class TestMain {
    
    public static void main(String args[])
    {
        Habit testHabit = new positiveHabit("Brush My Teeth", 2, 5);
        
        //HabitUI testUI = new HabitUI(testHabit);
        
        //createHabitGUI createHabitGUI = new createHabitGUI(); 
        endOfLifeUI testUI = new endOfLifeUI(testHabit);
        
    }
    
}
