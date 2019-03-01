public class ClockTest {
    public static void main(String args[]) {
        MyClock c = new MyClock(12, 35);
        c.holdCenter();
        c.pressUp();
        c.pressCenter();
        c.pressUp();
        c.pressUp();
        c.pressUp();
        c.pressUp();
        c.pressUp();
        c.pressCenter();
    }
}