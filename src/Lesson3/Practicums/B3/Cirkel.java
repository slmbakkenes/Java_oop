package Lesson3.Practicums.B3;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        if (rad <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
    }

    @Override
    public String toString() {
        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
