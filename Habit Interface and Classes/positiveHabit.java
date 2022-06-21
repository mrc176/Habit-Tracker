
public class positiveHabit implements Habit{
    
    String name;
    int remindersPerDay = 0;
    int dayCount = 0;
    int numFailures = 0;
    
    public positiveHabit(String habName, int numReminders, int numDays)
    {
        setName(habName); 
        int remindersPerDay = numReminders;
        int dayCount = numDays;
        int numFailures = 0;
    }

    @Override
    public void incrementFailures() {
        ++numFailures;
    }

    @Override
    public void setName(String habName) {
        name = habName; 
    }

    @Override
    public void setNumFailures(int numFails) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setReminders(int numReminders) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void endHabit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
