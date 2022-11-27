package sky.pro.java.course2.other.AdditionalTasks.oop.Person;

public class Person {
    private  String fullName;
    private  int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void talk() {
        System.out.println(this.fullName + " говорит");
    }
}
