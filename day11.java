class Day11{
    public static void main(String[] args) {
        String txt = "ABCDEDFGH";
        System.out.println(txt.length());
        String txt1 = "abcdefgh";
        System.out.println(txt + txt1);
        System.out.println(txt.equals(txt1));
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        String txt2 = "fdusvjnfgikgvjjhfhb  ";
        System.out.println(txt2.trim());
        System.out.println(txt2.substring(3));
        String[] strarray = txt2.split("f");
        for (int i = 0; i < strarray.length; i++) {
            System.out.println(strarray[i]);
        }
        String s = "Hello World!";
        String s1 = "";
        for (int j = s.length() - 1; j >= 0; j--) {
            s1 = s1 + s.charAt(j);
        }
        System.out.println(s1);
        CharSequence seq = "Hello";
        boolean bool = s.contains(seq);
        System.out.println(bool);
    }
}