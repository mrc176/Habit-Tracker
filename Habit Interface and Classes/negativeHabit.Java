//Author: Charlie Cox
package HabitUI
public class NegativeHabit implements Habit {
    
    int numFailures;
    String name;
    int remindersPerDay;
    int numSuccesses;
    
    public NegativeHabit()
    {
        numFailures = 0;
        numSuccesses = 0;
    }

    @Override
    public void incrementFailures() {
        numFailures++;
    }

    @Override
    public void setName(String habName) {
        this.name = habName;
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    
    @Override
    public int getNumFailures()
    {
        return numFailures;
    }
    
    
    public int getNumSuccesses()
    {
        return numSuccesses;
    }

    @Override
    public void setNumFailures(int numFails) {
        numFailures = numFails;    
    }

    @Override
    public void setReminders(int numReminders) {
       remindersPerDay = 0;    
    }
    
    @Override
    public int getReminders()
    {
        return remindersPerDay;
    }

    @Override
    public String endHabit() {
        return "This habit has been tracked!";
    }

    @Override
    public void incrementSuccesses() {
        ++numSuccesses;
    }
    
    
}
