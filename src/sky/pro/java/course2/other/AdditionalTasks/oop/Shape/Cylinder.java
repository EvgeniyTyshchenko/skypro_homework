package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
