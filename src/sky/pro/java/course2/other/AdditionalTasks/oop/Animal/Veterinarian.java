package sky.pro.java.course2.other.AdditionalTasks.oop.Animal;

public class Veterinarian {
    private Animal animal;

    public Veterinarian(Animal animal) {
        this.animal = animal;
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal);
    }
}