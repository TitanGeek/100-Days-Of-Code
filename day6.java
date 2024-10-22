class Day6 {
    public static void main(String[] args) {
        String s = "20";
        System.out.println(s.getClass().getSimpleName());
        int i = Integer.parseInt(s);
        System.out.println(((Object) i).getClass().getSimpleName());
        float f = Float.parseFloat(s);
        System.out.println(((Object) f).getClass().getSimpleName());
        String s1 = String.valueOf(i);
        System.out.println(s1.getClass().getSimpleName());
        String s2 = Integer.toString(i);
        System.out.println(s2.getClass().getSimpleName());
    }
}