import java.util.TimeZone;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Instant;

class Day17 {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        long epochSeconds = Instant.now().getEpochSecond();
        System.out.println(epochSeconds);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        System.out.println("Date = " + cal.getTime());
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, -3);
        cal.compareTo(cal1);
        cal.after(cal1);
        cal1.before(cal1);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(cal.getTime());
        cal1.setTimeZone(TimeZone.getTimeZone("CST"));
        System.out.println(cal1.getTime());
    }
}