package sky.pro.java.course2.other.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
    }
    public static void foo () throws IOException {

    }
}