import java.util.ArrayList;

class Day15 {
    public static void main(String[] args) {
        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println(weekdays);
        weekdays.sort(null);
        System.out.println(weekdays);
        weekdays.sort((a, b) -> {
            return -1 * a.compareTo(b);
        });
        System.out.println(weekdays);
        weekdays.removeIf(n -> n.startsWith("T"));
        System.out.println(weekdays);
    }
}