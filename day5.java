import java.util.Scanner;
class Day5{
    public static void main (String []args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = myObj.nextInt();
        ++x;
        System.out.println(x);
        --x;
        System.out.println(x);
        x += 5;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x /= 5;
        System.out.println(x);
        x %= 5;
        System.out.println(x);
        myObj.close();
    }
}
