package sky.pro.java.course2.hw20.supermarket;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Supermarket {

    Queue<String> queue1 = new ArrayDeque<>(5);
    Queue<String> queue2 = new ArrayDeque<>(5);
    Queue<String> queue3 = new ArrayDeque<>(5);

    public void add(String s) {
        if (queue1.size() == 5 && queue2.size() == 5 && queue3.size() == 5) {
            System.out.println("Галя, бегом на четвертую кассу!");
            return;
        }
        if (queue1.size() < 5) {
            queue1.offer(s);
            System.out.println("Покупатель " + s + " добавлен в первую очередь");
            return;
        }
        if (queue2.size() < 5) {
            queue2.offer(s);
            System.out.println("Покупатель " + s + " добавлен во вторую очередь");
            return;
        }
        if (queue3.size() < 5) {
            queue3.offer(s);
            System.out.println("Покупатель " + s + " добавлен в третью очередь");
        }
    }

    public void delete() {
        Random random = new Random();
        int result = random.nextInt(3);
        if (result == 0) {
            queue1.poll();
        } else if (result == 1) {
            queue2.poll();
        } else {
            queue3.poll();
        }
    }
}
