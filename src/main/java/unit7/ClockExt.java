package unit7;

public class ClockExt extends Clock {

    private int second;


    public void nextSecond(){
        second++;

        if(second>59){
            nextMinute();
           second=0;
        }
    }

    public ClockExt() {
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                "hour=" + hour +
                ", minute=" + getMinute() +
                ", second=" + second +
                '}';
    }
}
