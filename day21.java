import java.util.HashMap;
class Day21{
    public static void main(String[] args) {
        HashMap <Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "Yash");
        students.put(2, "Yashika");
        students.put(3, "Gurdeep");
        students.put(4, "Gurleen");
        System.out.println(students.get(3));
        System.out.println(students.containsKey(5));
        students.remove(4);
        System.out.println(students.size());
        System.out.println(students.keySet());
        System.out.println(students.entrySet());
        System.out.println(students);
    }
}