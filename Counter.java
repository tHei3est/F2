public class Counter {
    int myCount;

    public Counter() {
        myCount = 0;
    }

    public void inc() {
        myCount++;
    }

    public void reset() {
        myCount = 0;
    }

    public int getVal() {
        return myCount;
    }
}