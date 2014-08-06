import org.joda.time.DateTime;

public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(new DateTime());
        System.out.println("Run for Your Lives!");
    }
}
