package Lesson1.Practices.task5;

public class Main {
    public static void main(String[] arg) {
        Student st1 = new Student("Sylvester");
        System.out.println("name: " + st1.getName());
        System.out.println("number: " + st1.getStudentNumber() );
        st1.setStudentNumber(12345678);
        System.out.println("toString: " + st1.toString());
        System.out.println();

        Student st2 = new Student("Karel", 98765432);
        System.out.println("name: " + st2.getName());
        System.out.println("number: " + st2.getStudentNumber());
        System.out.println("toString: " + st2.toString());
    }
}
