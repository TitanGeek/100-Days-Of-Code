import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String grade;

    public Student(String id, String firstName, String lastName, String grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
class StudentCSVReader {

    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(csvSplitBy);
                Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the students list by first name
        students.sort(Comparator.comparing(Student::getFirstName));

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}