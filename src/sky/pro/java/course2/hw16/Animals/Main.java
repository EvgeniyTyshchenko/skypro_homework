package sky.pro.java.course2.hw16.Animals;

import sky.pro.java.course2.hw16.Animals.Amphibians.Amphibians;
import sky.pro.java.course2.hw16.Animals.Birds.Birds;
import sky.pro.java.course2.hw16.Animals.Birds.Flightless;
import sky.pro.java.course2.hw16.Animals.Birds.Flying;
import sky.pro.java.course2.hw16.Animals.Mammals.Herbivores;
import sky.pro.java.course2.hw16.Animals.Mammals.Mammals;
import sky.pro.java.course2.hw16.Animals.Mammals.Predators;

public class Main {
    public static void main(String[] args) {

        Animals gazelle = new Herbivores("Газель", 5, "полупустыня", 55, "трава");
        Mammals giraffe = new Herbivores("Жираф", 3, "полупустыня", 15, "листья");
        Herbivores horse = new Herbivores("Лошадь", 13, "степь", 60, "овёс");

        Animals hyena = new Predators("Гиена", 6, "полупустыня", 50, null);
        Mammals tiger = new Predators("Тигр", 4, "тропический лес", 45, "мясо");
        Predators bear = new Predators("Медведь", 8, "степь", 30, "рыба");

        Animals frog = new Amphibians("Лягушка", 7, "водоём");
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "водоём");

        Animals peacock = new Flightless("Павлин", 13, "саванна", "ходит в развалку");
        Birds penguin = new Flightless("Пингвин", 1, "открытое море", "ходит в развалку");
        Flightless dodoBird = new Flightless("Птица ДоДо", 3, "степи", "ходит");

        Animals gull = new Flying("Чайка", 6, "берег водоемов", "летает");
        Birds albatross = new Flying("Альбатрос", 3, "берег водоемов", "летает");
        Flying falcon = new Flying("Сокол", 5, "саванна", "летает");

        System.out.println(gazelle);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(peacock);
        System.out.println(gull);

        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(giraffe.equals(horse));
    }
}