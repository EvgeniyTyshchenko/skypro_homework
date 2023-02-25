package sky.pro.java.course4.hw24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static List<Integer> list = new ArrayList<>(List.of(
            9, 12, 5, 7, 18, 15, 17, 3, 21, 16, 25, 37, 42, 40));

    public static void main(String[] args) {

        System.out.println("Задание 1");
        Stream<Integer> stream = list.stream();
        findMinMax(stream, Integer::compareTo, (min, max) -> System.out.printf("min: %s, max: %s%n", min, max));
        stream.close();

        System.out.println("Задание 2");
        System.out.println(getCountEvenNumbers(list));
    }

    /*
    Задание 1. Напишите метод findMinMax, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
    Данный метод принимает на вход 3 элемента:
    Stream<? extends T> stream,
    Comparator<? super T> order,
    BiConsumer<? super T, ? super T> minMaxConsumer

    Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
    minMaxConsumer.accept(min, max);

    Если стрим не содержит элементов, то вызовите:
    minMaxConsumer.accept(null, null);
     */

    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        List <T> list = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    /*
    Задание 2. Реализуйте метод, который принимает на вход список целых чисел, определяет количество четных и выводит в консоль.
    Решать именно с применением Stream API.
     */

    public static Long getCountEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(e -> e % 2 == 0)
                .count();
    }
}