class Instructor {
    public void displayInfo() {
      System.out.println("Ishita Singh");
    }
  }
class Student extends Instructor {
    @Override
    public void displayInfo() {
      System.out.println("Ms. Ishita Singh");
    }
}
class Main {
    public static void main(String[] args) {
      Student d1 = new Student();
      d1.displayInfo();
    }
}