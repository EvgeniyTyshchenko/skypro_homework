package sky.pro.java.course1.other.exercise;

public class Exercise {
    public static void main(String[] args) {

        String one = "казак";

        StringBuilder stringBuilder = new StringBuilder(one);
        stringBuilder.reverse();
        String two = stringBuilder.toString();
        if(one.equals(two)) {
            System.out.println("Данное слово является палиндромом");
        } else {
            System.out.println("Данное слово не является палиндромом");
        }
    }
}
