
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.displayDetails();
            System.out.println("------------------");
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                s.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
