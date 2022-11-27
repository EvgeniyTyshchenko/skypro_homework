package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

import java.util.ArrayList;

public class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double volume;
    private double available;
    public Box(double available) {
        this.available = available;
        this.volume = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available = available - shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}