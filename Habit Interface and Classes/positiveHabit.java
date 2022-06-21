
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
        numFailures = numFails;
    }

    @Override
    public void setReminders(int numReminders) {
        remindersPerDay = numReminders; 
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
