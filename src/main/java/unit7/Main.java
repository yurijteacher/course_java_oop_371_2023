package unit7;

import java.util.Calendar;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour+":"+minute+":"+second);

        System.out.println(calendar.get(Calendar.DATE));


//        Timer timer = new Timer();

//        timer.schedule(new MyClock(), 1000, 1000);


        Clock clock = new Clock(17,30);
        System.out.println(clock);

    }
}
