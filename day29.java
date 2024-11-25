class Name{
    void getFullName(String s){
        System.out.println(s);
    }
}
class Title extends Name{
    @Override void getFullName(String s1){
        System.out.println("Prof. "+s1);
    }
}
class Main {
    public static void main(String[] args) {
        Name obj = new Name();
        obj.getFullName("Satvik Sharma");
        Title obj1 = new Title();
        obj1.getFullName("Satvik Sharma");
    }
}