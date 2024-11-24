class Over{
    static int incrementSalaray(int salary, int percent){
        salary = salary*percent/100 + salary;
        return salary;
    }
    static int incrementSalaray(int salary, int percent, int bonus){
        salary = salary*percent/100 + salary + bonus;
        return salary;
    }
    public static void main(String[] args) {
        int s = incrementSalaray(1000, 60);
        System.out.println(s);
        int s1 = incrementSalaray(1000, 60, 500);
        System.out.println(s1);
    }
}