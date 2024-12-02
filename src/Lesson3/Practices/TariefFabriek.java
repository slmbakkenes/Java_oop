package Lesson3.Practices;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven bt = new BelastingTarieven();
        boolean genererenNogNietGeslaagd = true;

        while (genererenNogNietGeslaagd) {
            try {
                bt.produceerBelastingTarieven();
                genererenNogNietGeslaagd = false;
            } catch (ArithmeticException ae) {
                System.out.println("mislukt");
            }
        }
    }
}
