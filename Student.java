public class Student extends Person {
    private int studentId;
    private String course;

    public Student(int studentId, String name, int age, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}