public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String currTimeString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTimeString();
    }

    private void setTimeString() {
        currTimeString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        setTimeString();
    }

    public String getTime() {
        return currTimeString;
    }

    public void minIncrement() {
        minutes.increment();
        if (minutes.getValue() == 0)
            hours.increment();
        setTimeString();
    }   //end of minIncrement()
}   //end of ClockDisplay class