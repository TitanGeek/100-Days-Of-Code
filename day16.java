class Day16 {
    enum weekdays {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }

    public static void main(String[] args) {
        for (weekdays myVar : weekdays.values()) {
            System.out.println(myVar);
        }
    }
}