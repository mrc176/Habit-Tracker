
public class positiveHabit implements Habit{
    
    String name;
    int remindersPerDay = 0;
    int dayCount = 0;
    int numFailures = 0;
    int numSuccesses = 0;
    int failureGoal;
    
    public positiveHabit(String habName, int numReminders, int allowedFailures)
    {
        setName(habName); 
        int remindersPerDay = numReminders;
        int failureGoal = allowedFailures;
        int numFailures = 0;
    }
    
    public void setFailureGoal(int failsAllowed)
    {
        failureGoal = failsAllowed;
    }
    
    public int getFailureGoal()
    {
        return failureGoal;
    }

    @Override
    public void incrementFailures() {
        ++numFailures;
    }
    
    @Override
    public void incrementSuccesses()
    {
        ++numSuccesses;
    }
    
    @Override
    public int getNumFailures()
    {
        return numFailures;
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
    public String getName()
    {
        return name;
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
    public int getNumSuccesses() {
        return numSuccesses;
    }

    
    
}
