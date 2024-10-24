import java.util.Scanner;

class Day8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = myObj.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
        System.out.println("Enter three numbers: ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > c && b > a) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }
        System.out.println("Enter year: ");
        int z = myObj.nextInt();
        String result = (z % 4 == 0) ? "Not a leap year" : "Leap year";
        System.out.println(result);
        myObj.close();
    }
}