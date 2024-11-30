import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Student implements java.io.Serializable {
  public String stu_Name;
  public String stu_Addr;
  public int stu_Id;
  public static void main(String[] args) {
    Student std = new Student();
    std.stu_Name = "George";
    std.stu_Addr = "ABC,XYZ";
    std.stu_Id = 1;
    try {
      FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(std);
      out.close();
      fileOut.close();
      System.out.printf("Object serialized");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}