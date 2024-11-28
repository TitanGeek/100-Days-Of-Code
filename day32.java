class Instructor{
    public void PrintName(){
        System.out.println("Mr. Rakesh Rathod");
    }
}
class Students extends Instructor{
    public void PrintName(){
        System.out.println("Rohan Sharma");
    }
}
class Main{
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor();
        myInstructor.PrintName();
        Instructor myStudents = new Students();
        myStudents.PrintName();
    }
}