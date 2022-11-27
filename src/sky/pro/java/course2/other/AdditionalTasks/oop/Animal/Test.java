package sky.pro.java.course2.other.AdditionalTasks.oop.Animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("мясо", "в доме");
        Cat cat = new Cat("корм для кошек", "в квартире");
        Horse horse = new Horse("сено", "в конюшне");
        animals.add(dog);
        animals.add(cat);
        animals.add(horse);

        Veterinarian veterinarian = new Veterinarian(horse);
        veterinarian.treatAnimal(horse);
        horse.eat();
        horse.sleep();
        System.out.println();
        Veterinarian veterinarian1 = new Veterinarian(dog);
        veterinarian1.treatAnimal(dog);
        dog.makeNoise();
        dog.eat();
        dog.sleep();
    }
}