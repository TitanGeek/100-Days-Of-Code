import java.util.Random;
import java.util.Scanner;

class Day10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myObj.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        myObj.close();
        int s = 0;
        int i = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        System.out.println(s);
        int a = 1;
        int b = 0;
        do {
            if (n == 0) {
                continue;
            }
            b += a;
            a++;
        } while (a <= n);
        System.out.println(b);
        Random ran = new Random();
        for (int j = 0; j < 100; j++) {
            int c = ran.nextInt(100);
            if (c % 5 == 0 && c % 7 == 0) {
                System.out.println(c);
                break;
            }
        }
    }
}