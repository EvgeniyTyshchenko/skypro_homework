package sky.pro.java.course2.other.tasks;

public class Task1 {
    public static void main(String[] args) {
        String s = "машина";
        int a = s.length()/2;
        System.out.println("Часть 1: " + s.substring(0, a));
        System.out.println("Часть 2: " + s.substring(a));
    }
}