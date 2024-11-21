package Lesson1.Practices.task4;

public class Student {
    private String name;

    public Student(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This student is called " + name;
    }
}
