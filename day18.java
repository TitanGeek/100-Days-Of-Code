class Day18{
    static boolean isPrime (int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    static int Vow(String str){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        if(isPrime(11)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        Vow("Java");
    }
}