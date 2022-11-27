package sky.pro.java.course2.other.AdditionalTasks.oop.Shape;

public class Test {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(1.7, 1.3);
        Ball ball = new Ball(1.1);
        Pyramid pyramid = new Pyramid(2.3, 3.5);

        Box box = new Box(25);
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
        System.out.println(box.add(pyramid));
    }
}
