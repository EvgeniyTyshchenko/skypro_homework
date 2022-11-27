package sky.pro.java.course2.other.AdditionalTasks.oop.Animal;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");
    }
    @Override
    public void eat() {
        System.out.println("Кот ест");
    }
    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }
}