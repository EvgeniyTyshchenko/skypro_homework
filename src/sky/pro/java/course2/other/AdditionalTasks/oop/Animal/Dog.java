package sky.pro.java.course2.other.AdditionalTasks.oop.Animal;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
}