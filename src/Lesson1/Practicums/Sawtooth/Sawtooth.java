package Lesson1.Practicums.Sawtooth;

public class Sawtooth {
    public static void main(String[] args) {
        int rows = 40;

        String text = "s";

        for (int i = 1; i <= rows; i++) {
            System.out.println(text);
            if (i % 2 == 0) {
                text = "s";
            } else {
                text += "s";
            }
        }
    }
}
