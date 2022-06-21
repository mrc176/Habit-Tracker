//Author Charlie Cox

public interface Habit 
{
    int numFailures = 0;

    
    public void incrementFailures();
    public void setName(String habName);
    public void setNumFailures(int numFails);
    public void setReminders(int numReminders);
    public void endHabit();
    
    
}
