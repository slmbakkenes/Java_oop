package Lesson1.Practices.task5;

public class Student {
    private String name;
    private int studentNumber;

    public Student(String nm) {
        name = nm;
    }

    public Student(String nm, int stNr) {
        name = nm;
        studentNumber = stNr;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int stNr) {
        studentNumber = stNr;
    }

    @Override
    public String toString() {
        return "This student is called " + name + " and his student number is: " + studentNumber;
    }
}
