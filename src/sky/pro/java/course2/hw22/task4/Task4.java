package sky.pro.java.course2.hw22.task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(getRandomNumber());
        arrayList.add(getRandomNumber());
        arrayList.add(getRandomNumber());

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(getRandomNumber());
        arrayList2.add(getRandomNumber());
        arrayList2.add(getRandomNumber());

        List<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(getRandomNumber());
        arrayList3.add(getRandomNumber());
        arrayList3.add(getRandomNumber());

        List<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(getRandomNumber());
        arrayList4.add(getRandomNumber());
        arrayList4.add(getRandomNumber());

        List<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(getRandomNumber());
        arrayList5.add(getRandomNumber());
        arrayList5.add(getRandomNumber());

        map.put("string1", arrayList);
        map.put("string2", arrayList2);
        map.put("string3", arrayList3);
        map.put("string4", arrayList4);
        map.put("string5", arrayList5);

        Map<String, Integer> map1 = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            map1.put(entry.getKey(), getListSum(entry.getValue()));
        }

        System.out.println(map);
        getInfo(map1);
        System.out.println();

        System.out.println("Задание 5");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Петр");
        linkedHashMap.put(2, "Виктор");
        linkedHashMap.put(3, "Максим");
        linkedHashMap.put(4, "Вячеслав");
        linkedHashMap.put(5, "Игорь");
        System.out.println(linkedHashMap);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 1000) + 1;
    }

    public static int getListSum(List<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum;
    }

    public static void getInfo(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}