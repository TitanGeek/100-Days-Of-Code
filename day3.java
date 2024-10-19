import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and marks: ");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double marks = myObj.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        myObj.close();
    }
}