package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

public class Pyramid implements Shape {
    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return h * s * 4 / 3;
    }
}
