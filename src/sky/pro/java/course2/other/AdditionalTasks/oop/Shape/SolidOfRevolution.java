package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

abstract class SolidOfRevolution implements Shape {
    private final double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
