package Lesson1.Practicums.Sum;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Getallen: ");
        for (int i = 0; i <= 39; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nDe som is: " + sum);

        if (sum == 780) {
            System.out.println("Het antwoord is correct!");
        } else {
            System.out.println("Het antwoord is fout!");
        }
    }
}
