package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 3) * 4 / 3;
    }
}
