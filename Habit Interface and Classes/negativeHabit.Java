//Author: Charlie Cox

public class NegativeHabit implements Habit {
    
    int numFailures;
    String name;
    int remindersPerDay;
    
    public NegativeHabit()
    {
        numFailures = 0;
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
    
    
}