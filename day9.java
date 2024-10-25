import java.util.Scanner;

class Day9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int x = myObj.nextInt();
        switch (x / 10) {
            case 1:
            case 2:
                System.out.println("F");
                break;
            case 3:
            case 4:
                System.out.println("E");
                break;
            case 5:
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9:
                System.out.println("A");
                break;
            default:
                System.out.println("Please enter a valid percentage.");
                break;
        }
        myObj.close();
    }
}