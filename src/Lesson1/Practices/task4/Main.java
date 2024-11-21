package Lesson1.Practices.task4;

public class Main {
    public static void main(String[] arg) {
        Student st1 = new Student("Sylvester");
        System.out.println( "getter: " + st1.getName() );
        System.out.println( "toString: " + st1.toString() );

        Student st2 = new Student("Karel");
        System.out.println( "getter: " + st2.getName() );
        System.out.println( "toString: " + st2.toString() );
    }
}
