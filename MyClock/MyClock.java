public class MyClock {
    private int h;
    private int m;
    private int state;

    public MyClock(int hours, int mins) {
        h = hours;
        m = mins;
        state = 0;
    }

    public void holdCenter() {
        if(state == 0) {
            state++;
        }
        else {
            state = 0;
            printTime();
        }
    }

    public void pressCenter() {
        if(state == 1) {
            state = 2;
        }
        else if(state == 2) {
            state = 1;
        }
    }

    public void pressUp() {
        if(state == 1) {
            h++;
        }
        else if(state == 2) {
            m++;
        }
    }

    public void pressDown() {
        if(state == 1) {
            h--;
        }
        else if(state == 2) {
            m--;
        }
    }

    public void printTime() {
        System.out.println(h + ":" +m);
    }
}