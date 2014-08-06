import org.joda.time.DateTime;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println(new DateTime());
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(20);
        Runnable runnable = new Runnable();
        scheduler.scheduleAtFixedRate(runnable, 3, 3, TimeUnit.SECONDS);
    }
}
