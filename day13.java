class Day13{
    public static void main(String[] args) {
        int ages[] = { 1, 2, 3, 4, 5 };
        float avg = 0;
        float sum = 0;
        int length = ages.length;
        for (int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println(avg);
        int a[] = { 3, 7, 1 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}