import java.util.Arrays;

class Day14 {
    static void transpose(int arr[][], int arr1[][]) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
    }

    public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max = 0;
            i++;
        }
        printArray(result);
    }

    public static void printArray(int[] result) {
        int a[] = { 1, 2, 3 };
        for (int i = 0; i < result.length; i++) {
            a[i] = result[i];
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 23, 45, 78, 12 },
                { 56, 90, 34, 67 },
                { 89, 21, 43, 76 } };
        maxelement(3, arr);
        int arr1[][] = new int[4][3], i, j;
        transpose(arr, arr1);
        maxelement(3, arr1);
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.print("\n");
        }
    }
}