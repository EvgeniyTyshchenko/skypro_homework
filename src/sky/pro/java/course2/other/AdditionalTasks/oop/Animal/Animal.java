package sky.pro.java.course2.other.AdditionalTasks.oop.Animal;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное шумит");
    }
    public void eat() {
        System.out.println("Животное ест");
    }
    public void sleep() {
        System.out.println("Животное спит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}