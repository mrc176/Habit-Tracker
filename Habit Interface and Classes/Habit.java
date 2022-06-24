//Author Charlie Cox
package HabitUI
public interface Habit 
{
    

      
    public void incrementFailures();
    public void incrementSuccesses();
    public int getNumFailures();
    public int getNumSuccesses();
    public void setName(String habName);
    public String getName();
    public void setNumFailures(int numFails);
    public void setReminders(int numReminders);
    public int getReminders();
    public String endHabit();
    
    
}
