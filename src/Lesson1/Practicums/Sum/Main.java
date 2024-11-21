package Lesson1.Practicums.Sum;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 39; i++) {
            sum += i;
        }
        System.out.println("De som is: " + sum);

        if (sum == 780) {
            System.out.println("Het antwoord is correct!");
        } else {
            System.out.println("Het antwoord is fout!");
        }
    }
}
